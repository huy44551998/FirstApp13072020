package com.example.firstapp13072020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int value;
        double random = Math.random();
       value =  tinhTong(5,6);
        Random random1 = new Random();
        //21>101
        int value1 = random1.nextInt(81)+21;
        random1.nextBoolean();
        Log.d("BBB","Floor is round down"+random);
        String msg= "dang hoc bai";
        inThongBao(msg);

    }

    private int tinhTong(int a, int b){
        int ketqua = a+b;
        return ketqua;
    }
    private void inThongBao(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}