package com.thoughtworks.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<Data> data;

    public MyAdaptor(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        return this.data.get(position).type.type;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (Data.DataType.Header.type == viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_header, parent, false);
            return new HeaderViewHolder(itemView);
        } else {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
            return new DataViewHolder(itemView);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Data data = this.data.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }
}
