package com.example.doga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button plus;
    private Button minus;
    private TextView text;
    private RelativeLayout back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        back.setBackgroundColor(Color.rgb(0,0,0));
        text.setTextColor(Color.rgb(0,0,255));


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textt = text.getText().toString();
                int szam = Integer.parseInt(textt);
                szam++;
                text.setText(String.valueOf(szam));
                if (szam > 0){
                    text.setTextColor(Color.rgb(0,255,0));
                }else if (szam == 0){
                    text.setTextColor(Color.rgb(0,0,255));
                }else{
                    text.setTextColor(Color.rgb(255,0,0));
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textt = text.getText().toString();
                int szam = Integer.parseInt(textt);
                szam--;
                text.setText(String.valueOf(szam));
                if (szam > 0){
                    text.setTextColor(Color.rgb(0,255,0));
                }else if (szam == 0){
                    text.setTextColor(Color.rgb(0,0,255));
                }else{
                    text.setTextColor(Color.rgb(255,0,0));
                }
            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(String.valueOf(0));
                text.setTextColor(Color.rgb(0,0,255));
            }
        });
    }

    private void init(){
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        text = findViewById(R.id.text);
        back = findViewById(R.id.back);
    }
}