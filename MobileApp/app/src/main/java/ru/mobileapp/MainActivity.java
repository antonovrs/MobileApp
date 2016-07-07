package ru.mobileapp;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

import ru.mobileapp.layout.FuelAll;
import ru.mobileapp.layout.FuelConsumption;
import ru.mobileapp.layout.FuelSInk;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentTask ftask;
    FragmentStatePark fstate_park;
    FragmentFuel ffuel;
    FragmentEvent fevent;
    FragmentEmployees femloyees;

    FragmentAdmin fadmin;

    FuelAll fAll;
    FuelSInk fsink;
    FuelConsumption fConsumption;

    private RadioButton sink;
    private RadioButton consumption;
    private RadioButton sinkconsumption;

    private CheckBox statePark;
    private CheckBox event;
    private CheckBox task;
    private CheckBox employees;
    private CheckBox fuel;

    private RadioButton stateParkMain;
    private RadioButton eventMain;
    private RadioButton taskMain;
    private RadioButton employeesMain;
    private RadioButton fuelMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ftask = new FragmentTask();
        fstate_park = new FragmentStatePark();
        ffuel = new FragmentFuel();
        fevent = new FragmentEvent();
        femloyees = new FragmentEmployees();
        fadmin = new FragmentAdmin();

        fsink = new FuelSInk();
        fAll = new FuelAll();
        fConsumption = new FuelConsumption();

        FragmentTransaction ftrans = getFragmentManager().beginTransaction();
        ftrans.replace(R.id.container, fstate_park);
        ftrans.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.act_admin:
                FragmentTransaction ftrans = getFragmentManager().beginTransaction();
                ftrans.replace(R.id.container, fadmin);
                ftrans.commit();
                return true;
            case R.id.exit:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.employees){
            Intent intent = new Intent(this, ItemEmployeesListActivity.class);
            startActivity(intent);
        }
        FragmentTransaction ftrans = getFragmentManager().beginTransaction();
        if (id == R.id.state_park) {
            ftrans.replace(R.id.container, fstate_park);
        } else if (id == R.id.event) {
            ftrans.replace(R.id.container, fevent);
        } else if (id == R.id.task) {
            ftrans.replace(R.id.container, ftask);
        } else if (id == R.id.fuel) {
            ftrans.replace(R.id.container, ffuel);
        }
        ftrans.commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onCheckedChange(View v) {
        sink = (RadioButton) v.findViewById(R.id.sink);
        consumption = (RadioButton) v.findViewById(R.id.consumption);
        sinkconsumption = (RadioButton) v.findViewById(R.id.sinkconsumption);
        FragmentTransaction fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.sink:
                fTrans.replace(R.id.barchartlayout, fsink);
                break;
            case R.id.consumption:
                fTrans.replace(R.id.barchartlayout, fConsumption);
                break;
            case R.id.sinkconsumption:
                fTrans.replace(R.id.barchartlayout, fAll);
                break;
        }
        fTrans.commit();
    }

    public void fragmentChange(View v) {
        stateParkMain = (RadioButton) v.findViewById(R.id.state_park_main);
        eventMain = (RadioButton) v.findViewById(R.id.event_main);
        taskMain = (RadioButton) v.findViewById(R.id.task_main);
        employeesMain = (RadioButton) v.findViewById(R.id.employees_main);
        fuelMain = (RadioButton) v.findViewById(R.id.fuel_main);

        FragmentTransaction ftrans = getFragmentManager().beginTransaction();

        switch (v.getId()) {
            case R.id.state_park_main:
                ftrans.replace(R.id.container, fstate_park);
                break;
            case R.id.event_main:
                ftrans.replace(R.id.container, fevent);
                break;
            case R.id.task_main:
                ftrans.replace(R.id.container, ftask);
                break;
            case R.id.employees_main:
                ftrans.replace(R.id.container, femloyees);
                break;
            case R.id.fuel_main:
                ftrans.replace(R.id.container, ffuel);
                break;
        }
        ftrans.commit();
    }

}