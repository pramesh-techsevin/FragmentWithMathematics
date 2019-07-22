package com.example.fragmentwithmathematics.IntegerValueFragment;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.fragmentwithmathematics.BaseFragment.BaseFragment;
import com.example.fragmentwithmathematics.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstValueFragment extends BaseFragment {


    /*TextView textvalue1;
    Button btnnextvalue1;
    String TextValue1String;
*/

    TextInputEditText edittextvalue1;
    Button btnnextvalue1;
    String TextValue1String;
    TextInputLayout textinputlayoutval1;
    private boolean isValidateVal1;


    public FirstValueFragment() {
        // Required empty public constructor
    }


    public static FirstValueFragment newInstance() {


        return new FirstValueFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first_value, container, false);

        edittextvalue1 = view.findViewById(R.id.edittextvals1);
        btnnextvalue1 = view.findViewById(R.id.nextbtn1);
        textinputlayoutval1 = view.findViewById(R.id.textinputlayoutval1);

        edittextvalue1.requestFocus();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(edittextvalue1, InputMethodManager.SHOW_IMPLICIT);


        Bundle bundle = new Bundle();
        bundle.putString("textval1", TextValue1String);


        btnnextvalue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextValue1String = edittextvalue1.getText().toString().trim();

                if(onValidate()){

              //  if (TextValue1String != null && TextValue1String != "") {

                    SecondValueFragment.newInstance(TextValue1String);
                    SecondValueFragment secondValueFragment = new SecondValueFragment();
                    callFragment(secondValueFragment,false);

                } else {

                    Toast.makeText(getActivity(), "Please Enter Val 1", Toast.LENGTH_SHORT).show();

                }

            }
        });

        return view;

    }

    private boolean onValidate() {

        isValidateVal1 = false;

        if (TextUtils.isEmpty(TextValue1String)) {
            edittextvalue1.setError("Cannot Be Empty");
            edittextvalue1.setBackgroundColor(Color.WHITE);
            return false;

        } else {
            isValidateVal1 = true;
            textinputlayoutval1.setError(null);
        }
       /* if (isValidateVal1) {

            Toast.makeText(getActivity(), "Thank you for Entering Val 1", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getActivity(), "Please Enter Value 1 ", Toast.LENGTH_SHORT).show();
        }*/


        return true;


    }

}