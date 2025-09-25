package com.dailytaskjava;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dailytaskjava.databinding.ActivityDay3Binding;
import com.dailytaskjava.day3.Day3Adapter;
import com.dailytaskjava.day3.UserDay3;

import java.util.ArrayList;

public class Day3Activity extends AppCompatActivity {

    // Declare binding object
    private ActivityDay3Binding binding;

    private ArrayList<UserDay3> userDay3s;

    private Day3Adapter day3Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //Inflate layout using binding
        binding = ActivityDay3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //prepare static data
        userDay3s = new ArrayList<>();
        userDay3s.add(new UserDay3("praveen","35","9966139516"));
        userDay3s.add(new UserDay3("suresh","25","5544667788"));
        userDay3s.add(new UserDay3("naresh","26","9988776655"));
        userDay3s.add(new UserDay3("muresh","27","8844667788"));
        userDay3s.add(new UserDay3("kuresh","28","7744667788"));

        // Step 2: Setup RecyclerView

        day3Adapter = new Day3Adapter(this,userDay3s, userDay3 -> {
            Toast.makeText(this, "Name : "+userDay3.getName()
                    +"\nPhone : "+userDay3.getPhone(), Toast.LENGTH_SHORT).show();
        });

        binding.rvRecyclerviewDay3.setLayoutManager(new LinearLayoutManager(this));
        binding.rvRecyclerviewDay3.setHasFixedSize(true);
        binding.rvRecyclerviewDay3.setAdapter(day3Adapter);

    }
}