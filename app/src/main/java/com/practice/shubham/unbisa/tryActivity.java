package com.practice.shubham.unbisa;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class tryActivity extends Fragment {

    View myView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIn) {
        myView = inflater.inflate(R.layout.activity_try, container, false);
        return myView;
    }


}