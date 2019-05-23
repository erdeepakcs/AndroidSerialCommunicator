package com.example.serialcommunicator;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import gurux.serial.GXSerial;


/**
 * A simple {@link Fragment} subclass.
 */
public class SerialPortFragment extends Fragment {


    private Spinner dataBits;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_serial_port, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Add data bits.
        List<Integer> dataBitsList = new ArrayList<Integer>();
        dataBitsList.add(7);
        dataBitsList.add(8);
        ArrayAdapter<Integer> dataBitsAdapter = new ArrayAdapter<Integer>(getActivity().getApplicationContext(),
                android.R.layout.simple_spinner_item, dataBitsList);
        dataBitsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataBits.setAdapter(dataBitsAdapter);
    }
}
