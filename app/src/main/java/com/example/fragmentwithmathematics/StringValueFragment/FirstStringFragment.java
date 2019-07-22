package com.example.fragmentwithmathematics.StringValueFragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import com.example.fragmentwithmathematics.BaseFragment.BaseFragment;
import com.example.fragmentwithmathematics.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstStringFragment extends BaseFragment {

    TextInputLayout textinputlayoutval;
    TextInputEditText edittextval;
    Button nextbtn;



    public FirstStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first_string_value, container, false);

        textinputlayoutval  = view.findViewById(R.id.textinputlayoutval);
        edittextval = view.findViewById(R.id.edittextval);
        nextbtn = view.findViewById(R.id.nextbtn);

        edittextval.requestFocus();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(edittextval, InputMethodManager.SHOW_IMPLICIT);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                StringResultFragment.newInstance(edittextval.getText().toString().trim());






                StringResultFragment stringResultFragment = new StringResultFragment();
                callFragment(stringResultFragment,true);



            }
        });



        return  view;
    }

}
