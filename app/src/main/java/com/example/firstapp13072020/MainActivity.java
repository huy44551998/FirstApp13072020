package com.example.firstapp13072020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText mEdtmin, mEdtmax;
    Button mBtnRandom;
    TextView mTvResult;
    String mValue="";
    Random random = new Random();
    int n=0,a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnRandom = findViewById(R.id.randombtn);
        mEdtmin = findViewById(R.id.minNumber);
        mEdtmax = findViewById(R.id.maxNumber);
        mTvResult = findViewById(R.id.result);
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String textSmin = mEdtmin.getText().toString();
               String textSmax = mEdtmax.getText().toString();
                if(textSmax.isEmpty()||textSmin.isEmpty()){
                    Toast.makeText(MainActivity.this, "please enter the numbers", Toast.LENGTH_SHORT).show();
                return;
                }
                int min = Integer.parseInt(textSmin);
                int max = Integer.parseInt(textSmax);
                if(min>=max){

                    max = min+1;
                }
                if(max==0){
                    textSmax = "1";
                    max=1;
                    mEdtmax.setText(textSmax);
                    textSmin="0";
                    min=0;
                    mEdtmin.setText(textSmin);

                }


                 n = random.nextInt((max-min)+1)+min;
                mValue =mValue+n+"-";

                mTvResult.setText(mValue);

            }
        });


    }


}