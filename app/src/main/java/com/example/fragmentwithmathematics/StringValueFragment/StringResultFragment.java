package com.example.fragmentwithmathematics.StringValueFragment;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.fragmentwithmathematics.IntegerValueFragment.SecondValueFragment;
import com.example.fragmentwithmathematics.MainActivity;
import com.example.fragmentwithmathematics.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StringResultFragment extends Fragment {


    TextView TextViewFirstSecondVal;
    TextView TextViewLowerCaseVal;
    TextView TextViewUpperCaseVal;
    TextView TextViewDisplayEachVal;
    static String stringValString;
    LinearLayout linearLayout;



    public static StringResultFragment newInstance(String string1) {

        stringValString = string1;
        return new StringResultFragment();
    }


    public StringResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_string_result, container, false);

        TextViewFirstSecondVal = view.findViewById(R.id.TextViewFirstSecondVal);
        TextViewLowerCaseVal = view.findViewById(R.id.TextViewLowerCaseVal);
        TextViewUpperCaseVal = view.findViewById(R.id.TextViewUpperCaseVal);
//        TextViewDisplayEachVal = view.findViewById(R.id.TextViewDisplayEachVal);




        String firstsecond = stringValString.substring(0,1)+" and "+stringValString.substring(stringValString.length()-1);

        char[] characters = stringValString.toCharArray();

        int length = characters.length;

        Log.d("check","charater"+characters[0]);
        for (int i = 0;i<length;i++){

            Log.d("data" ,""+characters[i]);



        }

       // char first = test.charAt(0);


        /*TextViewFirstSecondVal.setText(stringValString.substring(0,1), TextView.BufferType.EDITABLE);
        txt2.setText(existingAddress.subString(existingAddress.length()-1),  TextView.BufferType.EDITABLE);*/
        TextViewFirstSecondVal.setText("The First and Last Character of String :-"+firstsecond);
        TextViewLowerCaseVal.setText("The LowerCase of String :-"+stringValString.toLowerCase());
        TextViewUpperCaseVal.setText("The UpperCase of String :-"+stringValString.toUpperCase());
        linearLayout = view.findViewById(R.id.lin1);

        for (int i = 0;i<length;i++){

            Log.d("datas" ,""+characters[i]);

            TextView textView = new TextView(getActivity());

            textView.setTextColor(Color.WHITE);
            textView.setTextSize(20);
            textView.setText(String.valueOf(characters[i]));
            linearLayout.addView(textView);


        }

        int count =  getFragmentManager().getBackStackEntryCount();








        Log.d("count","count"+count);

        MainActivity.newInatance(count);










        return view;

    }

}
