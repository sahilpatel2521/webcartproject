package com.example.webcart;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment_home extends Fragment {

    LinearLayout grocery,vegetable,house_hold,home_kitchen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.home_fragment,null);


        grocery = view.findViewById(R.id.linear);
        house_hold = view.findViewById(R.id.linear2);
        home_kitchen = view.findViewById(R.id.linear3);
        vegetable = view.findViewById(R.id.linear4);

        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Grocery.class);
                startActivity(i);
            }
        });

        house_hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),House_hold.class);
                startActivity(i);
            }
        });

        home_kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getContext(),Home_kitchen.class);
                startActivity(i);
            }
        });
        vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),Vegetable.class);
                startActivity(i);
            }
        });

        return view;
    }
}
