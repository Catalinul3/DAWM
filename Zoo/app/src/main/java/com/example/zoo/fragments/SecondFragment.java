package com.example.zoo.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.zoo.ItemClickListener;
import com.example.zoo.R;
import com.example.zoo.adapters.SpeciesItemAdapter;

public class SecondFragment extends Fragment {
    public String animal;
    public String continent;
    public String color;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);
        Bundle bundle=getArguments();
        if(bundle!=null)
        {color=bundle.getString("Color");
            animal=bundle.getString("animal");
            continent= bundle.getString("continent");
        }
    return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);
        TextView textView1=view.findViewById(R.id.animal);
        TextView textView2=view.findViewById(R.id.continent);
        textView2.setText(continent);
        textView1.setText(animal);
        int colors=Color.parseColor(color);
        ConstraintLayout layout=view.findViewById(R.id.secondFragment);
        layout.setBackgroundColor(colors);


    }

}
