package com.thoughtworks.recyclerview;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThreadActivity extends AppCompatActivity {
    @BindView(R.id.thread_count_button)
    Button countButton;

    @OnClick(R.id.thread_count_button)
    void click(View view) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;

                int finalCount = count;
                view.post(new Runnable() {
                    @Override
                    public void run() {
                        countButton.setClickable(false);
                        countButton.setText(String.valueOf(finalCount));
                    }
                });
                for (int i = 0; i < 10; i++) {
                    SystemClock.sleep(1000);
                    count += 1;
                    int finalCount1 = count;
                    view.post(new Runnable() {
                        @Override
                        public void run() {
                            countButton.setText(String.valueOf(finalCount1));
                        }
                    });

                }
                view.post(new Runnable() {
                    @Override
                    public void run() {
                        countButton.setClickable(true);
                    }
                });

            }
        });
        thread.start();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        ButterKnife.bind(this);
    }
}
