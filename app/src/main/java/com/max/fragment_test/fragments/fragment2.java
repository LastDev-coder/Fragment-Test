package com.max.fragment_test.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.max.fragment_test.R;
import com.max.fragment_test.model.MyMessage;

public class fragment2 extends Fragment {

    View view;
    TextView textView;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment2, container, false);
        textView = view.findViewById(R.id.showdata);
        button = view.findViewById(R.id.back);
        String data = MyMessage.getMessage();

        if (data != null) {
            textView.setText(data);
        } else {
            Toast.makeText(getContext(), "error", Toast.LENGTH_LONG).show();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment1 fragment1 = new fragment1();
                getFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment1).commit();

            }
        });

        return view;
    }
}