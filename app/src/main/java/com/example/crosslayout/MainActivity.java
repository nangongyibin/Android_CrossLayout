package com.example.crosslayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ngyb.crosslayout.CrossLayout;

public class MainActivity extends AppCompatActivity {

    private CrossLayout mCl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCl = findViewById(R.id.cl);
    }

    public void change(View view) {
        mCl.changeItem();
    }
}
