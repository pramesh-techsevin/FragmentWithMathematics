package com.example.fragmentwithmathematics.BaseFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentwithmathematics.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {


    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    public void callFragment(Fragment fragment, boolean val) {
        if (val) {

            getFragmentManager().beginTransaction().replace(R.id.containers, fragment).commit();

        } else {
            getFragmentManager().beginTransaction().replace(R.id.containers, fragment).addToBackStack("back").commit();
        }
    }

}
