package ru.mobileapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class FragmentEvent extends android.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.fragment_event, container, false);
        PieChart mPieChart = (PieChart) rootView.findViewById(R.id.piechart);

        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.event_no_connection), 8, getResources().getColor(R.color.colorGreen)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.event_out_route), 5, getResources().getColor(R.color.colorYellow)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.event_speed_reduction), 15, getResources().getColor(R.color.colorRed)));

        mPieChart.startAnimation();

        PieChart mPieChart1 = (PieChart) rootView.findViewById(R.id.piechart1);

        mPieChart1.addPieSlice(new PieModel("А 013 АА 64", 15, getResources().getColor(R.color.colorGreen)));
        mPieChart1.addPieSlice(new PieModel("А 012 АА 64", 25, getResources().getColor(R.color.colorYellow)));
        mPieChart1.addPieSlice(new PieModel("А 014 АА 64", 35, getResources().getColor(R.color.colorRed)));

        mPieChart1.startAnimation();

        return rootView;
    }
}
