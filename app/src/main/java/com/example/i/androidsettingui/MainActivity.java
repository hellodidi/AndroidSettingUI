package com.example.i.androidsettingui;

import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends PreferenceActivity{

    private PreferenceScreen mps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mylistperference);
        mps = (PreferenceScreen) findPreference("sp");
    }
}
