package com.atta.myrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<String> cities;

    public MyAdapter(ArrayList<String> cities) {
        this.cities = cities;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String city = cities.get(position);

        holder.cityTv.setText(city);
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView cityTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cityTv = itemView.findViewById(R.id.city_tv);
        }
    }


}
