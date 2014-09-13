package com.example.kairat.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kairat on 12.09.2014.
 */
public class Fragment1 extends Fragment
{
    private String logMes = "Fragment 1";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Log.d(logMes, "onCreateView");
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Log.d(logMes, "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(logMes, "onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d(logMes, "onActivityCreated");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(logMes, "onStart");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(logMes, "onResume");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(logMes, "onPause");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(logMes, "onStop");
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(logMes, "onDestroyView");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(logMes, "onDestroy");
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d(logMes, "onDetach");
    }
}
