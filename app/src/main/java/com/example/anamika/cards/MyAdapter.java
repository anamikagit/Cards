package com.example.anamika.cards;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerViewHolder> {

    String[] values;
    Context context;

    public MyAdapter(String[] values, Context context) {
        this.values = values;
        this.context = context;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_items,parent,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText(values[position]);
        holder.textView.setBackgroundColor(Color.GREEN);
    }

    @Override
    public int getItemCount() {
        return values.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
        }
    }
}
