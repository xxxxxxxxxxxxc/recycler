package com.thoughtworks.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContentActivity extends AppCompatActivity {
    @BindView(R.id.content)
    RecyclerView recyclerView;

    private ArrayList<Data> data = new ArrayList<>();
    private MyAdaptor adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        ButterKnife.bind(this);
        createData();

        this.adapter = new MyAdaptor(this.data);

        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        this.recyclerView.setAdapter(this.adapter);
    }

    private void createData() {
        this.data.add(new Data(Data.DataType.Header, "here is title", null, 0));
        this.data.add(new Data(Data.DataType.Data ,"title1", "desp1", 1));
        this.data.add(new Data(Data.DataType.Data ,"title2", "desp2", 2));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));
        this.data.add(new Data(Data.DataType.Data ,"title3", "desp3", 3));

    }
}

