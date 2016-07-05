package ru.mobileapp;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    private static final String LOGIN_VALUE = "madmin";
    private static final String PASSWORD_VALUE = "q123456";
    Button singIn;
    EditText login, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singIn = (Button) findViewById(R.id.singIn);
        login = (EditText) findViewById(R.id.editLogin);
        password = (EditText) findViewById(R.id.editPassword);

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals(LOGIN_VALUE) &&
                        password.getText().toString().equals(PASSWORD_VALUE)) {
                    Toast.makeText(getApplicationContext(), "Загрузка...", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    FragmentTransaction ftrans = getFragmentManager().beginTransaction();

                } else {
                    Toast.makeText(getApplicationContext(), "Неверные данные", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
