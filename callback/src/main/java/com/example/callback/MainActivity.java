package com.example.callback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Computer,View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button) findViewById(R.id.add);
        Button minus = (Button) findViewById(R.id.minus);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button divide = (Button) findViewById(R.id.divide);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
    }


    @Override
    public void result(int a) {
        System.out.println("result:"+a);
    }

    @Override
    public void onClick(View v) {
        Process process = new Process(this);
        switch (v.getId()){
            case R.id.add:
                process.add(3,2);
                break;
            case R.id.minus:
                process.minus(83,29);
                break;
            case R.id.multiply:
                process.multiply(88,11);
                break;
            case R.id.divide:
                process.divide(88,8);
                break;
            default:
                System.out.println("error");
        }

    }
}
