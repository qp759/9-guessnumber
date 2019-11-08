package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private int miCountSet = 0;
    private boolean returngame;
    private int guesstimes;
    private int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        Intent intent=getIntent();
        returngame = intent.getBooleanExtra("returngame",true);
        guesstimes = intent.getIntExtra("guesstimes",0);
        random = intent.getIntExtra("random",0);

        if (returngame == true){
            random =  (int)(Math.random()* 9+1);
            intent.putExtra("returngame", false);
        }

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 1);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 2);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 3);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 4);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 5);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 6);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 7);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 8);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("portal", 9);
                intent.putExtra("guesstimes",guesstimes );
                startActivity(intent);
            }
        });
        final Button R_button = (Button) findViewById(R.id.reset);
        R_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                random =  (int)(Math.random()* 9+1);
                guesstimes = 0;

            }
        });

    }
}