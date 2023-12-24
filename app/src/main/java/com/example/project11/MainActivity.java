package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.t1);
        tv.setText("EitanHagever");
        tv.setTextColor(Color.GREEN);
        tv.setTextSize(50);

        bt = findViewById(R.id.bt1);
        bt.setTextColor(Color.BLUE);
        bt.setText("press Me");
        bt.setBackgroundColor(Color.RED);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("you pressed me!");
            }
        });
    }
}