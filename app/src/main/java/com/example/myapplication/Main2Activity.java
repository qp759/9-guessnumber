package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private int guesstimes;
    private int random;
    private int input_N;
    private boolean returngame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button = (Button) findViewById(R.id.button);

        Intent intent=getIntent();
        random = intent.getIntExtra("random",0);
        input_N = intent.getIntExtra("portal",0);
        guesstimes = intent.getIntExtra("guesstimes",0);

        TextView txprompt = (TextView)findViewById(R.id.txprompt);
        TextView txresult = (TextView)findViewById(R.id.txresult);
         if (random == input_N & guesstimes > 0){
             txresult.setText("O");
            guesstimes++;
            txprompt.setText("你一共猜了"+guesstimes+"次");
            returngame=true;
            guesstimes=0;
            button.setText("再玩一次");
        }
         else if(random == input_N & guesstimes == 0){
             txresult.setText("O");
             guesstimes++;
             txprompt.setText("你一次就猜中了!");
             returngame=true;
             guesstimes=0;
             button.setText("再玩一次");
         }
        else  if (random < input_N){
            txresult.setText("X");
            txprompt.setText("太大");
            returngame=false;
            guesstimes++;
        }
        else if (random > input_N){
            txresult.setText("X");
            txprompt.setText("太小");
            returngame=false;
            guesstimes++;
        }


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("guesstimes",guesstimes );
                intent.putExtra("random", random);
                intent.putExtra("returngame", returngame);
                startActivity(intent);
            }
        });
    }
}