package org.nlgreens.www.august15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tab3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.tab_3,
                container, false);
//
//        try {
//            addFragment();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        return view;

    }
//@Override
//    void addFragment () {
//
//        FragmentManager childFragMan = getChildFragmentManager();
//        FragmentTransaction childFragTrans = childFragMan.beginTransaction();
//        YoutubeFragment fragB = new YoutubeFragment();
//        childFragTrans.add(R.id.child_fragment, fragB);
//        childFragTrans.addToBackStack("B");
//        childFragTrans.commit();
//    }


//        YoutubeFragment fragmentC = new YoutubeFragment();
//        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//        getChildFragmentManager().findFragmentById(R.id.child_fragment);
//        transaction.add(R.id.child_fragment, fragmentC);
//        transaction.commit();


}


