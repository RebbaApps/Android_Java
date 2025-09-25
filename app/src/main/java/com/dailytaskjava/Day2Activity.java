package com.dailytaskjava;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dailytaskjava.databinding.ActivityDay2Binding;

public class Day2Activity extends AppCompatActivity {

    // Declare binding object
    private ActivityDay2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //Inflate layout using binding
        binding = ActivityDay2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //use binding to access views
        binding.btSubmitDay2.setOnClickListener(v -> {
            String name = binding.etYourNameDay2.getText().toString();
            String age = binding.etYourAgeDay2.getText().toString();
            String email = binding.etEmailDay2.getText().toString();
            String phone = binding.etPhoneDay2.getText().toString();

            if(name.isEmpty() || age.isEmpty() || email.isEmpty() || phone.isEmpty())
            {
                Toast.makeText(this, "Enter all details", Toast.LENGTH_SHORT).show();
                binding.tvNameAgeDay2.setText("");
            }
            else {
                binding.tvNameAgeDay2.setText("Name is " +name+" \n Age is "+age+ "\n Email is "+email +"\n Phone Number is "+phone);
            }
        });
    }
}