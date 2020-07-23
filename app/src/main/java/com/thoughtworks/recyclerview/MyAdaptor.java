package com.thoughtworks.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<MyViewHodler> {

    private ArrayList<Data> data;

    public MyAdaptor(ArrayList<Data> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new MyViewHodler(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHodler holder, int position) {
        Data data = this.data.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }
}
