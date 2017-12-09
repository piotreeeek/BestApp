package com.example.piotrek.bestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    GridLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        layout = findViewById(R.id.first_layout);
        Bundle bundle = getIntent().getExtras();

        TextView textView = findViewById(R.id.fa_text_v);
        try {
            textView.setText((CharSequence) bundle.get("text"));
        }
        catch (NullPointerException e){
            textView.setText(R.string.error);
        }

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.kot);
        layout.addView(imageView);
    }
}
