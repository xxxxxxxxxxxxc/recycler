package com.thoughtworks.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class HeaderViewHolder extends MyViewHolder {

    private final TextView title;


    public HeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.item_title);
    }

    public void setData(Data data) {
        this.title.setText(data.title);
    }

}
