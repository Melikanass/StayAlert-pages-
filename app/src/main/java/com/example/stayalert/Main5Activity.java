package com.example.stayalert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button nextbutton5 = (Button)findViewById(R.id.nextpage5);
        nextbutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        });
    }
}
