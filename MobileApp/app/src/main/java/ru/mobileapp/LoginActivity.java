package ru.mobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    Button singIn;
    EditText login, password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singIn =(Button)findViewById(R.id.singIn);
        login =(EditText)findViewById(R.id.editLogin);
        password =(EditText)findViewById(R.id.editPassword);

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals("admin") &&

                        password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Загрузка...", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(getApplicationContext(), "Неверные данные", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
