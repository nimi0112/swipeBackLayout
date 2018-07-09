package com.tutor.feel_better.swipetry;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class sampleActivity extends AppCompatActivity {

    FrameLayout secind_frme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        secind_frme=findViewById(R.id.secind_frme);

        BlankFragment tryFragment= new BlankFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack("dashboard");
        fragmentTransaction.add(R.id.secind_frme, tryFragment, "tag").commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed(){

        finish();


    }
}
