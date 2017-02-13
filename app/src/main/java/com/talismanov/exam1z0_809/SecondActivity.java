package com.talismanov.exam1z0_809;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("im here");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("on start");
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("on restart");
        Toast.makeText(this, "Second Activity", Toast.LENGTH_LONG).show();
    }
}
