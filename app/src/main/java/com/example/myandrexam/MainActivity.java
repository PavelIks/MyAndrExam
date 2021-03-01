package com.example.myandrexam;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    private EditText EditText1; // Стоимость автомобиля ($)
    //EditText EditText2 = (EditText) findViewById(R.id.EditTextNumber_ID2); // Объем двигателя (куб. дм)
    //Spinner Spinner1 = (Spinner) findViewById(R.id.Spinner_ID1); // Тип двигателя
    //EditText EditText3 = (EditText) findViewById(R.id.EditTextNumber_ID3); // Год выпуска
    //Button Button1 = (Button) findViewById(R.id.Button_ID1); // Стоимость

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText1 = (EditText) findViewById(R.id.EditTextNumber_ID1);
    }

    public void cost_button(View view)
    {
        int a1 = Integer.parseInt(EditText1.getText().toString());
    }
}