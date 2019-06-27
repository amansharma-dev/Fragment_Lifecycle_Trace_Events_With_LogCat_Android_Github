package com.example.fragment_lifecycle_trace_events_with_logcat_android_github;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view) {
        SampleFragment fragment = new SampleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.frame_container, fragment, FRAGMENT_TAG)
                .commit();
    }

    public void removeFragment(View view) {

        Fragment fragment =
                getSupportFragmentManager()
                        .findFragmentByTag(FRAGMENT_TAG);
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
