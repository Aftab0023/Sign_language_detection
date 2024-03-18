package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Learn extends AppCompatActivity {

    TextView learn_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        learn_more = findViewById(R.id.learnmore);
        learn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri you=Uri.parse("https://youtube.com/@LearnHowtoSign?si=au0SnySQA0WmWsSN");
                Intent you_intent=new Intent(Intent.ACTION_VIEW,you);
                startActivity(you_intent);

            }
        });
    }
}