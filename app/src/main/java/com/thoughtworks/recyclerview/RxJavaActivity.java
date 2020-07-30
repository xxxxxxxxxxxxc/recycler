package com.thoughtworks.recyclerview;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RxJavaActivity extends AppCompatActivity {

    @OnClick(R.id.rxjava_button)
    void click(Button button) {
        Observable<Integer> tObservable = Observable.fromIterable(IntStream.range(0, 10).boxed().collect(Collectors.toList()))
                .map(v -> {
                    SystemClock.sleep(1000);
                    return v;
                })
                .doOnComplete(() -> {
                    SystemClock.sleep(1000);
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        Disposable subscribe = tObservable
                .subscribe(x -> {
                    button.setText(String.valueOf(x));
                }, x -> {
                }, () -> {
                    button.setText("Done");
                });
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxjava);
        ButterKnife.bind(this);
    }
}
