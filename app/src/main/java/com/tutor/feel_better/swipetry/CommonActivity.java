package com.tutor.feel_better.swipetry;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

import java.util.Arrays;

public class CommonActivity extends BaseSwipeBackActivity {

      int arr[]=new int[2];
      int height;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_common;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (mSwipeBackLayout.getDirectionMode()) {
            case com.tutor.feel_better.swipetry.library.SwipeBackLayout.FROM_LEFT:
                fromLeftRb.setChecked(true);
                break;
            case com.tutor.feel_better.swipetry.library.SwipeBackLayout.FROM_TOP:
                fromTopRb.setChecked(true);
                break;
            case com.tutor.feel_better.swipetry.library.SwipeBackLayout.FROM_RIGHT:
                fromRightRb.setChecked(true);
                break;
            case com.tutor.feel_better.swipetry.library.SwipeBackLayout.FROM_BOTTOM:
                fromBottomRb.setChecked(true);
                break;
        }
    }

    @Override
    public void onClick(View v) {

    }

    public int[] getdimens(){
        return arr;
    }

    public int getHeight(){
        return height;
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
    @Override
    public void onBackPressed(){
        finish();
    }

}