package com.example.fragments_intheclass;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {
    IButtonFragment listener;

    public static ButtonFragment create(IButtonFragment listener){
        ButtonFragment fragment = new ButtonFragment();
        fragment.listener = listener;
        return fragment;
    }


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button1 = view.findViewById(R.id.button_1);
        Button button2 = view.findViewById(R.id.button_2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            listener.showTextFragment();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            listener.showButtonFragment();
            }
        });


    }
}
