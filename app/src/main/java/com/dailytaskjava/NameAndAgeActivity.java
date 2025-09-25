package com.dailytaskjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NameAndAgeActivity extends AppCompatActivity {

    EditText et_yourName;
    EditText et_yourAge;
    Button bt_submit;
    TextView tv_name_age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_name_and_age);
        et_yourName = findViewById(R.id.et_yourName_day2);
        et_yourAge = findViewById(R.id.et_yourAge_day2);
        bt_submit = findViewById(R.id.bt_submit_day2);
        tv_name_age = findViewById(R.id.tv_name_age_day2);

        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_yourName.getText().toString().isEmpty() || et_yourAge.getText().toString().isEmpty())
                {
                    Toast.makeText(NameAndAgeActivity.this, "Enter both Name and Age", Toast.LENGTH_SHORT).show();
                }
                else {
                    tv_name_age.setText("Name : "+et_yourName.getText().toString() + " and Age : "+et_yourAge.getText().toString());
                }
            }
        });

    }
}