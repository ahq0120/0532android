package com.example.traveling2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent intent = new Intent();
        Button emailMe = (Button) findViewById(R.id.emailMe);
        Button visitHomepage = (Button) findViewById(R.id.visitHomepage);
        Button callMe = (Button) findViewById(R.id.callMe);

        emailMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:a109222252@mail.shu.edu.tw"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "[About Traveling]");
                startActivity(intent);
            }
        });

        visitHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://im.wp.shu.edu.tw/"));
                startActivity(intent);
            }
        });

        callMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0968367640"));
                startActivity(intent);
            }
        });
    }
}
