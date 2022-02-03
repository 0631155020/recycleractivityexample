package com.applook.recycleractivityexample.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.applook.recycleractivityexample.R;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView cardName, cardPrice;
    ImageView cardImg;

    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        cardName= itemView.findViewById(R.id.card_item_name);
        cardPrice = itemView.findViewById(R.id.card_item_price);
        cardImg = itemView.findViewById(R.id.card_image);
    }
}
