package com.example.viewbindinginandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewbindinginandroidjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=activityMainBinding.getRoot();
        setContentView(view);
        activityMainBinding.messageID.setText("This is View Binding implementations");
        activityMainBinding.btnID.setOnClickListener(this);
        /*activityMainBinding.btnID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is Toast message",Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"This is Toast message",Toast.LENGTH_LONG).show();

    }
}