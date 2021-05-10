package com.max.fragment_test.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.max.fragment_test.R;
import com.max.fragment_test.model.MyMessage;

public class fragment1 extends Fragment {

    View view;
    Button button;
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        editText = view.findViewById(R.id.editText1);
        button = view.findViewById(R.id.butto1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 fragment2 = new fragment2();

                String data = editText.getText().toString();
                if (data.isEmpty()) {
                    Toast.makeText(getContext(), "Your message should not be blank", Toast.LENGTH_LONG).show();


                } else {

                    MyMessage.setMessage(data);
                    System.out.println(MyMessage.getMessage());
                    getFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment2).commit();


                }

            }
        });
        return view;
    }
}