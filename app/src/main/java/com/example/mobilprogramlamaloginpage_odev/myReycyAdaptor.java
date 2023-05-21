package com.example.mobilprogramlamaloginpage_odev;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myReycyAdaptor extends RecyclerView.Adapter<myReycyAdaptor.Myholder> {
    private ArrayList<DataBaseclass> cars;

    public myReycyAdaptor(ArrayList<DataBaseclass> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item,parent,false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.txtModel.setText(cars.get(position).getModel());
        holder.txtMarka.setText(cars.get(position).getMarka());
        holder.imgLogo.setImageResource(cars.get(position).getLogo());

    }

    @Override
    public int getItemCount() {

        return cars.size();
    }

    public class Myholder extends RecyclerView.ViewHolder{

        TextView txtModel,txtMarka;
        ImageView imgLogo;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            imgLogo  = itemView.findViewById(R.id.imgLogo);
            txtMarka = itemView.findViewById(R.id.txtMarka);
            txtModel = itemView.findViewById(R.id.txtModel);
        }
    }
}
