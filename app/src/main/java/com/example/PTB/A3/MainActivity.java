package com.example.PTB.A3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickKP (View View){
        Intent B = new Intent(this, DetailKP.class);
        startActivity(B);
    }
    public void onClickDashboard (View View){
        Intent A = new Intent(this, DashboardActivity.class);
        startActivity(A);
    }

}