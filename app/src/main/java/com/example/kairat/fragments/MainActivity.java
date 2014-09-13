package com.example.kairat.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import java.io.FileDescriptor;
import java.io.PrintWriter;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();

        if (d.getWidth() > d.getHeight())
        {
            Fragment1 fragment1 = new Fragment1();
            fragmentTransaction.replace(android.R.id.content, fragment1);
        }else
        {
            Fragment2 fragment2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content, fragment2);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        */
    }
}
