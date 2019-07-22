package com.example.fragmentwithmathematics.IntegerValueFragment;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fragmentwithmathematics.BaseFragment.BaseFragment;
import com.example.fragmentwithmathematics.R;
import com.example.fragmentwithmathematics.StringValueFragment.FirstStringFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends BaseFragment {
    TextView textViewAddValue;
    TextView textViewSubValue;
    TextView textViewMulValue;
    TextView textViewDivValue;
    Button btnHome;
    static String vals1, vals2;


    public ResultFragment() {
        // Required empty public constructor
    }

    public static ResultFragment newInstance(String str1, String str2) {


        vals1 = str1;
        vals2 = str2;

        return new ResultFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        textViewAddValue = view.findViewById(R.id.textviewadd);
        textViewSubValue = view.findViewById(R.id.textviewsub);
        textViewMulValue = view.findViewById(R.id.textviewmul);
        textViewDivValue = view.findViewById(R.id.textviewdiv);
        btnHome = view.findViewById(R.id.btnhome);

      /*  Bundle bundle = new Bundle();
        String val1 = bundle.getString("textval1");
        String val2 = bundle.getString("textval2");*/

        int value1 = Integer.parseInt(vals1);
        int value2 = Integer.parseInt(vals2);

        Log.d("check", "Value 1: " + vals1);
        Log.d("check", "Value 2: " + (value1 + value2));

        textViewAddValue.setText("" + (value1 + value2));
        textViewSubValue.setText("" + (value1 - value2));
        textViewMulValue.setText("" + (value1 * value2));
        textViewDivValue.setText("" + (value1 / value2));

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                getActivity().finish();

                FirstStringFragment firstStringValueFragment = new FirstStringFragment();
                callFragment(firstStringValueFragment,false);


// ----------------This below code is for Activity Restart ---------------------
                /*new Handler().post(new Runnable() {

                    @Override
                    public void run()
                    {
                        Intent intent = getActivity().getIntent();
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK
                                | Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        getActivity().overridePendingTransition(0, 0);
                        getActivity().finish();

                        getActivity().overridePendingTransition(0, 0);
                        startActivity(intent);
                    }
                });*/


//                --------------------------------------------------------------

            }
        });


        return view;


    }

}
