package com.udacity.gradle.builditbigger;

import android.support.v4.app.Fragment;;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by saumgarg on 17/12/17.
 */

public class MainActivityFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_main, container, false);

        // Inflate the layout for this fragment
        return root;
    }


}
