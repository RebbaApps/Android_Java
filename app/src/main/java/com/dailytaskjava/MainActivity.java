package com.dailytaskjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText et_enter_name;
    EditText et_yourAge;
    Button bt_submit;
    TextView tv_yourName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et_enter_name = findViewById(R.id.et_enter_name);
        et_yourAge = findViewById(R.id.et_yourAge_day2);
        bt_submit = findViewById(R.id.bt_submit_day2);
        tv_yourName = findViewById(R.id.tv_yourName);

        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_enter_name.getText().toString().isEmpty() || et_yourAge.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter valid name and Age", Toast.LENGTH_SHORT).show();
                }
                else {
                    tv_yourName.setText("Your Name is : "+et_enter_name.getText().toString() +" and your age is : "+et_yourAge.getText());
                }
            }
        });

    }
}