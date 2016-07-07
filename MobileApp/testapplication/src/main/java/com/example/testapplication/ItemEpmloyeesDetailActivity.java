package com.example.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;


public class ItemEpmloyeesDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemepmloyees_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (savedInstanceState == null) {

            Bundle arguments = new Bundle();
            arguments.putString(ItemEpmloyeesDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(ItemEpmloyeesDetailFragment.ARG_ITEM_ID));
            ItemEpmloyeesDetailFragment fragment = new ItemEpmloyeesDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.itemepmloyees_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            navigateUpTo(new Intent(this, ItemEpmloyeesListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
