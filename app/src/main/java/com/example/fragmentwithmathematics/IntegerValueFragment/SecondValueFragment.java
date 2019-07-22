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
public class SecondValueFragment extends BaseFragment {
    //EditText textviewValue2;
    TextInputEditText edittextValue2;
    Button btnNextvalue2;
    TextInputLayout textinputlayoutval2;
    static String TextValue2String, TextValue1String;
    private boolean isValidateVal2;



    public SecondValueFragment() {
        // Required empty public constructor
    }


    public static SecondValueFragment newInstance(String val1) {

        TextValue1String = val1;
        return new SecondValueFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_value, container, false);
        edittextValue2 = view.findViewById(R.id.edittextvals2);
        btnNextvalue2 = view.findViewById(R.id.nextbtn2);
        textinputlayoutval2 = view.findViewById(R.id.textinputlayoutval2);


        Bundle bundle = new Bundle();
        bundle.putString("textval2", TextValue2String);
        String textval1 = bundle.getString("textval1");

        edittextValue2.requestFocus();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(edittextValue2, InputMethodManager.SHOW_IMPLICIT);


        btnNextvalue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextValue2String = edittextValue2.getText().toString().trim();
               if(onValidate()){
                /* if (TextValue2String != null) {*/
                    ResultFragment.newInstance(TextValue1String, TextValue2String);
                    ResultFragment resultFragment = new ResultFragment();
                    callFragment(resultFragment,true);
                } else {
                    Toast.makeText(getActivity(), "Please Enter Val 2", Toast.LENGTH_SHORT).show();
                }

            }
        });


        return view;
    }

    private boolean onValidate() {

        isValidateVal2 = false;

        if (TextUtils.isEmpty(TextValue2String)) {
            edittextValue2.setError("Cannot Be Empty");
            edittextValue2.setBackgroundColor(Color.WHITE);
            return false;

        } else {
            isValidateVal2 = true;
            textinputlayoutval2.setError(null);
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
