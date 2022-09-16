package com.example.PTB.A3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText NIDN, Password;
    Button BtnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        NIDN = findViewById(R.id.edit_1);
        Password = findViewById(R.id.edit_2);
        BtnLogin = findViewById(R.id.btn_1);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //isi action button
                Toast.makeText(LoginActivity.this, "Berhasil Login", Toast.LENGTH_SHORT).show();

                String username = NIDN.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if (username.isEmpty()) {
                    NIDN.setError("Silahkan isi NIDN Anda");
                    return;
                }

                if (password.isEmpty()) {
                    Password.setError("Silahkan isi password Anda");
                    return;
                }

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
