package ru.mobileapp.layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

import ru.mobileapp.R;

public class FuelAll extends android.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_fuel_all, container, false);

        BarChart mBarChart = (BarChart) rootview.findViewById(R.id.barchart);

        mBarChart.addBar(new BarModel(5.f, 0xFF1FF456));
        mBarChart.addBar(new BarModel(1.f, 0xFF343456));
        mBarChart.addBar(new BarModel(5.f, 0xFF1FF456));
        mBarChart.addBar(new BarModel(4.f, 0xFF343456));
        mBarChart.addBar(new BarModel(7.f, 0xFF1FF456));
        mBarChart.addBar(new BarModel(0.f, 0xFF343456));

        mBarChart.startAnimation();

        return rootview;
    }
}
