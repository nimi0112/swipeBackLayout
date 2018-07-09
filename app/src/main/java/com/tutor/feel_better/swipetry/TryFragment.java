package com.tutor.feel_better.swipetry;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TryFragment extends Fragment {
    protected RecyclerView my_rcv;
    List<Integer> mlist= new ArrayList<>();
    //NestedScrollView my_scroll;
    LockableScrollView lockableScrollView;
    public TryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=         inflater.inflate(R.layout.fragment_try, container, false);
        my_rcv=view.findViewById(R.id.my_rcv);
        lockableScrollView= new LockableScrollView(getActivity());
        for (int i=0;i<50;i++){
            mlist.add(i);
        }

        my_rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        my_rcv.setNestedScrollingEnabled(false);
        AdapterRCv adapterRCv= new AdapterRCv(getActivity(),mlist);
        my_rcv.setAdapter(adapterRCv);

        //my_scroll=view.findViewById(R.id.my_Scroll) ;
        lockableScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                if (lockableScrollView != null) {
                    if (lockableScrollView.getChildAt(0).getBottom()-200 <= (lockableScrollView.getHeight() + lockableScrollView.getScrollY())-200) {

                        lockableScrollView.setScrollingEnabled(false);
                       // my_scroll.scrollTo(0, my_scroll.getBottom()-20);
                        //lockableScrollView.scrollTo(0,my_scroll.getBottom()-20);
                        //
                        // lockableScrollView.setScrollingEnabled(true);

                        /* Handler handler= new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                               // my_scroll.scrollTo(0, my_scroll.getTop());//my_scroll.getBottom()-200);
                                Log.e("scrolled","scrolled");
                            }
                        },500);*/

                        //scroll view is at bottom
                    } else {
                        lockableScrollView.setScrollingEnabled(false);
                        //scroll view is not at bottom
                    }
                }
            }
        });
        return view;
    }

}
