package com.example.i.androidsettingui;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by i on 2017/4/16.
 */

public class screenpreference extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.screenpreference);
    }
}
