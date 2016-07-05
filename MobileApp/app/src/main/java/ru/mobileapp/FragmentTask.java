package ru.mobileapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class FragmentTask extends android.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_task, container, false);
        PieChart mPieChart = (PieChart) rootView.findViewById(R.id.piechart);

        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.task_done), 35, getResources().getColor(R.color.colorGreen)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.task_in_work), 17, getResources().getColor(R.color.colorYellow)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.task_not_done), 35, getResources().getColor(R.color.colorRed)));
        mPieChart.addPieSlice(new PieModel(getResources().getString(R.string.task_create), 38, getResources().getColor(R.color.colorGray)));
        mPieChart.startAnimation();
        return rootView;
    }
}
