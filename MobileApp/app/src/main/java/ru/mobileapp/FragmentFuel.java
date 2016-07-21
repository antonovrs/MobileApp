package ru.mobileapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

public class FragmentFuel extends android.app.Fragment {

    RadioGroup radioGroup;

    public void onStart() {
        super.onStart();
        getView().findViewById(R.id.sinkconsumption).callOnClick();
        radioGroup.check(R.id.sinkconsumption);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_fuel, container, false);

        radioGroup = (RadioGroup) root.findViewById(R.id.radioGroup);

        return root;
    }
}
