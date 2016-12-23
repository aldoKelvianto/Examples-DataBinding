package com.aldoapps.adbpractice.simple;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ActivitySimpleDataBindingBinding;

/**
 * Created by aldo on 12/23/16.
 */

public class SimpleDataBindingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySimpleDataBindingBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_simple_data_binding);
        User user = new User("Tony", "Stark");
        binding.setUser(user);

        binding.btnStartFragment.setOnClickListener(v -> startAFragment());
    }

    private void startAFragment() {
//        FragmentManager fragmentManager = getSupportFragmentManager().b;

    }

}
