package com.example.kairat.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Kairat on 12.09.2014.
 */
public class Fragment2 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        Button btnGetText = (Button) getActivity().findViewById(R.id.btnGetText);

        btnGetText.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView lbl = (TextView) getActivity().findViewById(R.id.lblFragment1);
                Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
