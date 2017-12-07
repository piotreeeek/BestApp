package com.example.piotrek.bestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear_layout);

        Button button = new Button(this);
        ViewGroup.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        button.setLayoutParams(params);
        button.setText(R.string.btn2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          onButton2Click(v);

                                      }
                                  }
        );
        linearLayout.addView(button);
    }

    private void onButton2Click(View view) {
        Intent intent = new Intent(this, FormActivity.class);
        startActivityForResult(intent, 1);
    }

    public void onButton1Click(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("text", getString(R.string.fa_send_text));
        intent.putExtras(bundle);
        startActivity(intent);
        TextView textView = findViewById(R.id.text_view_hw);
        textView.setText(R.string.bye_world);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){

                TextView textView = new TextView(this);
                textView.setText(data.getStringExtra("result"));
                linearLayout.addView(textView);
            }
        }
    }
}
