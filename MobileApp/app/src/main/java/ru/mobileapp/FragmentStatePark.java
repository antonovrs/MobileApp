package ru.mobileapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class FragmentStatePark extends android.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.fragment_state_park, container, false);
        PieChart mPieChart = (PieChart) rootView.findViewById(R.id.piechart);

        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.state_free), 15, getResources().getColor(R.color.colorGreen)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.state_not_available), 25, getResources().getColor(R.color.colorYellow)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.state_repairs), 35, getResources().getColor(R.color.colorRed)));

        mPieChart.startAnimation();

        return rootView;
    }
}
