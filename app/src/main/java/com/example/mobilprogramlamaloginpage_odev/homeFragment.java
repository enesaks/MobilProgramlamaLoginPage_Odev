package com.example.mobilprogramlamaloginpage_odev;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link homeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homeFragment extends Fragment {

    private RecyclerView myrecycler;
    private myReycyAdaptor myAdaptor;
    private ArrayList<DataBaseclass> cars;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        myrecycler = view.findViewById(R.id.myrecycler);
         cars = new ArrayList<>();
         myAdaptor = new myReycyAdaptor(cars);
         myrecycler.setAdapter(myAdaptor);
         myrecycler.setLayoutManager(new LinearLayoutManager(getContext()));
         diziolustur();
         myAdaptor.notifyDataSetChanged();







        return view;
    }

    private void diziolustur() {
        cars.add(new DataBaseclass(R.drawable.at,"audi","a3"));
        cars.add(new DataBaseclass(R.drawable.at,"audi","a4"));
        cars.add(new DataBaseclass(R.drawable.at,"audi","a5"));
        cars.add(new DataBaseclass(R.drawable.kus,"bmw","5.17"));
        cars.add(new DataBaseclass(R.drawable.at,"bmw","5.20"));
        cars.add(new DataBaseclass(R.drawable.kedi,"mercedes","CLK"));
        cars.add(new DataBaseclass(R.drawable.kedi,"mercedes","AMG"));

    }
}