package com.thoughtworks.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class DataViewHolder extends MyViewHolder {

    private final TextView title;
    private final TextView number;
    private final TextView description;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        this.number = itemView.findViewById(R.id.item_number);
        this.title = itemView.findViewById(R.id.item_title);
        this.description = itemView.findViewById(R.id.item_description);

    }

    public void setData(Data data) {

        this.number.setText(String.valueOf(data.number));
        this.title.setText(data.title);
        this.description.setText(data.description);
    }

}
