package com.example.fragment_lifecycle_trace_events_with_logcat_android_github;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {


    public static final String TAG_LIFECYCLE = "fragment_lifecycle";


    public SampleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.i(TAG_LIFECYCLE,"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG_LIFECYCLE,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample, container, false);

        Log.i(TAG_LIFECYCLE,"onCreateView");

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG_LIFECYCLE,"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG_LIFECYCLE,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG_LIFECYCLE,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG_LIFECYCLE,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG_LIFECYCLE,"onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG_LIFECYCLE,"onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG_LIFECYCLE,"onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG_LIFECYCLE,"onDetach");
    }
}
