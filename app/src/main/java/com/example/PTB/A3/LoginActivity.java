package com.example.PTB.A3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void dashboardOnClicked(View view) {
        Intent dashboardOnClicked = new Intent(this, DashboardActivity.class);
        startActivity(dashboardOnClicked);
    }
}