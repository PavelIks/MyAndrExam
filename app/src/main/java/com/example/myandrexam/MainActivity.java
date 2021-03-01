package com.example.myandrexam;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    }

    public void cost_button(View view)
    {
        try
        {
            if (EditText1 != null || EditText2 != null)
            {
                int a1 = Integer.parseInt(EditText1.getText().toString());
                int a2 = Integer.parseInt(EditText2.getText().toString());
                int b1 = a1 + a2;
                TextView1.setText(String.valueOf(b1));
            }
        }
        catch (Exception exception)
        {
            TextView1.setText("Exception!");
        }
    }
}