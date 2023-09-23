package com.example.temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView display;
    RadioGroup rdgroup;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        display = findViewById(R.id.display);
        rdgroup = findViewById(R.id.rdgroup);
        convert = findViewById(R.id.button);
        rdgroup.clearCheck();


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioid = rdgroup.getCheckedRadioButtonId();
                switch (radioid) {
                    case R.id.rbtn1:
                        double get = Double.parseDouble(String.valueOf(input.getText()));
                        double far_to_cel = (get-32)*5/9;
                        display.setText("The Temperature is"+ far_to_cel+ "degrees celsius");
                        break;
                    case R.id.rbtn2:
                        double get2 = Double.parseDouble(String.valueOf(input.getText()));
                        double cel_to_far = (9.0/5*get2+32);
                        display.setText("The Temperature is"+ cel_to_far+ "degrees fahrenheit");
                        break;
                }
            }
        });

    }
}
