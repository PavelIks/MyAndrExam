package com.example.myandrexam;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText EditText1; // Стоимость автомобиля ($)
    private EditText EditText2; // Объем двигателя (куб. дм)
    private Spinner Spinner1;   // Тип двигателя
    private EditText EditText3; // Год выпуска
    private Button Button1;     // Стоимость
    private TextView TextView1; // Стоимость

    String[] Motor = { "Бензин", "Дизель"};
    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1 = (EditText) findViewById(R.id.EditTextNumber_ID1);
        EditText2 = (EditText) findViewById(R.id.EditTextNumber_ID2);
        Spinner1 = (Spinner) findViewById(R.id.Spinner_ID1);
        EditText3 = (EditText) findViewById(R.id.EditTextNumber_ID3);
        Button1 = (Button) findViewById(R.id.Button_ID1);
        TextView1 = (TextView) findViewById(R.id.TextView_ID5);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Motor);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner1.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            { item = (String)parent.getItemAtPosition(position); }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        };
        Spinner1.setOnItemSelectedListener(itemSelectedListener);
    }

    int с1;
    public void cost_button(View view)
    {
        if (item == "Бензин")
        {
            с1 = 10;
        }
        else
        {
            с1 = 20;
        }
        try
        {
            if (EditText1 != null || EditText2 != null)
            {
                int a1 = Integer.parseInt(EditText1.getText().toString());
                int a2 = Integer.parseInt(EditText2.getText().toString());

                int b1 = a1 + a2 + с1;
                TextView1.setText("$" + String.valueOf(b1));
            }
            else
            {
                TextView1.setText("Error!");
            }
        }
        catch (Exception exception)
        {
            TextView1.setText("Exception!");
        }
    }
}