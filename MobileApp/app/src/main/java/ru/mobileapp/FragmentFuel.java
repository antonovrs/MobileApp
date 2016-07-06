package ru.mobileapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentFuel extends android.app.Fragment {

    public void onStart() {
        super.onStart();
        getView().findViewById(R.id.sinkconsumption).callOnClick();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fuel, container, false);
    }
}
