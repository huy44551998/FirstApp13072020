package com.example.firstapp13072020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int value;
       value =  tinhTong(5,6);
        Log.d("BBB",String.valueOf(value));
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