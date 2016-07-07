package ru.mobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra("textView3");
        TextView messageView = (TextView)findViewById(R.id.textView3);
        messageView.setText(messageText);
    }
}
