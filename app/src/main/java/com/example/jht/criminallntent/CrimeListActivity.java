package com.example.jht.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by jht on 2016/11/7.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
