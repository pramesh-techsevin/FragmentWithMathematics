package com.example.fragmentwithmathematics;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentwithmathematics.IntegerValueFragment.FirstValueFragment;

public class MainActivity extends AppCompatActivity {

    static int count;

    public static MainActivity newInatance(int Count){

        Count = count;
        return new MainActivity();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().replace(R.id.containers, FirstValueFragment.newInstance()).commit();




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(count==2) {
            finish();
        }


    }
}
