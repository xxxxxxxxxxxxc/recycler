package com.thoughtworks.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.to_recycler_view)
    void click() {
        Intent intent = new Intent(this, ContentActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.to_thread)
    void threadClick() {
        Intent intent = new Intent(this, ThreadActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}