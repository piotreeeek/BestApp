package com.example.piotrek.bestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void onButtonSendClick(View view) {
        EditText editText = findViewById(R.id.editText);
        String input = editText.getText().toString();
        if(input.length() > 0) {
            Intent intent = new Intent();
            intent.putExtra("result", input);
            setResult(RESULT_OK, intent);
            finish();
        }else{
            Toast.makeText(this, R.string.input_error, Toast.LENGTH_SHORT).show();
        }
    }
}
