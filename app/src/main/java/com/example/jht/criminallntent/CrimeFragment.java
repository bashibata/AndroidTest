package com.example.jht.criminallntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by jht on 2016/11/4.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
