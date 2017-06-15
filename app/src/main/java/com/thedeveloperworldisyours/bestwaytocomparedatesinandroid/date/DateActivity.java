package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.ActivityUtils;
import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.R;
import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date.DateFragment;
import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date.DatePresenter;

public class DateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
// Set up the toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_activity_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorText));
        toolbar.setTitle(R.string.app_name);


        DateFragment dateFragment = (DateFragment) getSupportFragmentManager().findFragmentById(R.id.main_activity_content_frame);

        if (dateFragment == null) {
            dateFragment = dateFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), dateFragment, R.id.main_activity_content_frame);
        }

        new DatePresenter(dateFragment);
    }
}
