package com.example.admin.androidtask;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class Fragment11 extends Fragment {
    ImageView imageView;
    Button button;


//dhsfnd
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment11, container, false);
        imageView=(ImageView) v.findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment22=new Fragment22();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                imageView.setImageResource(R.drawable.pic1);
                fragmentTransaction.replace(R.id.fg2,fragment22);
                fragmentTransaction.commit();
            }
        });
        return v;
    }


}
