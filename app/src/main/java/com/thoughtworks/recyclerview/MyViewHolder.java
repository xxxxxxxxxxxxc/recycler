package com.thoughtworks.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public abstract class MyViewHolder extends RecyclerView.ViewHolder {

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void setData(Data data);

}


