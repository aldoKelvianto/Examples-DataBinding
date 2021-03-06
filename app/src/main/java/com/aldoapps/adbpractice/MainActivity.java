package com.aldoapps.adbpractice;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aldoapps.adbpractice.blog.RecyclerViewBindingActivity;
import com.aldoapps.adbpractice.databinding.ActivityMainBinding;
import com.aldoapps.adbpractice.eventhandling.EventHandlingActivity;
import com.aldoapps.adbpractice.newtwoway.NewTwoWayActivity;
import com.aldoapps.adbpractice.simple.SimpleDataBindingActivity;
import com.aldoapps.adbpractice.twoway.TwoWayActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);

        // Notice that in XML, the id is btn_simple_data
        binding.btnSimpleData.setOnClickListener(v -> goToSimpleDataBinding());
        binding.btnTwoWay.setOnClickListener(v -> goToTwoWayActivity());
        binding.btnNewTwoWay.setOnClickListener(v -> goToNewTwoWay());

        binding.btnRecyclerViewBinding.setOnClickListener(v -> goToRecyclerViewBinding());
        binding.btnEventHandling.setOnClickListener(v -> goToEventHandling());
    }

    private void goToNewTwoWay() {
        Intent intent = new Intent(this, NewTwoWayActivity.class);
        startActivity(intent);
    }

    private void goToEventHandling() {
        Intent intent = new Intent(this, EventHandlingActivity.class);
        startActivity(intent);
    }

    private void goToRecyclerViewBinding() {
        Intent intent = new Intent(this, RecyclerViewBindingActivity.class);
        startActivity(intent);
    }

    private void goToSimpleDataBinding() {
        Intent intent = new Intent(this, SimpleDataBindingActivity.class);
        startActivity(intent);
    }

    private void goToTwoWayActivity() {
        Intent intent = new Intent(this, TwoWayActivity.class);
        startActivity(intent);
    }

}
