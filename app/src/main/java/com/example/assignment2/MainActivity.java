package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_launch = findViewById(R.id.button_launch);
        EditText link_text = findViewById(R.id.launch_text);
        Button btn_ring = findViewById(R.id.ring_button);
        EditText number_text = findViewById(R.id.ring_text);

        btn_launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = link_text.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);

            }
        });

        btn_ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = number_text.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });


    }
}