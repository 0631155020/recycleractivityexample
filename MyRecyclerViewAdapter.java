package com.applook.recycleractivityexample.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.applook.recycleractivityexample.R;
import com.applook.recycleractivityexample.model.Item;
import com.bumptech.glide.Glide;

import java.util.List;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder>{

    List<Item> itemList;
    Context mComtext;

    public MyRecyclerViewAdapter(Context mComtext, List<Item> itemList){
        this.mComtext=mComtext;
        this.itemList=itemList;
    }
    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mComtext)
                .inflate(R.layout.item,parent,false);
        return new MyRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
Glide.with(mComtext)
        .load(itemList.get(position).getImage())
        .into(holder.cardImg);
holder.cardName.setText(itemList.get(position).getName());
holder.cardPrice.setText(itemList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return itemList.size() ;
    }
}
