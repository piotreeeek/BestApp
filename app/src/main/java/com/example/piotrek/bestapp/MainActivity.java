package com.example.piotrek.bestapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.linear_layout);

        Button button = new Button(this);
        button.setText(R.string.btn2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          onButton1Click(v);
                                      }
                                  }
        );
        linearLayout.addView(button);
    }

    public void onButton1Click(View view) {
        TextView textView = findViewById(R.id.text_view_hw);
        textView.setText(R.string.bye_world);
    }
}
