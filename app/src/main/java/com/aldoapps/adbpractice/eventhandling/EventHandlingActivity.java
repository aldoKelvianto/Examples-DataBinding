package com.aldoapps.adbpractice.eventhandling;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ActivityEventHandlingBinding;

/**
 * Created by aldo on 12/23/16.
 */

public class EventHandlingActivity extends AppCompatActivity {

    private ActivityEventHandlingBinding binding;
    private ToastHandler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler = new ToastHandler(this);
        HumanBean humanBean = new HumanBean("aldo");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_event_handling);
        binding.setHumanBean(humanBean);
        binding.setHandler(handler);
    }
}
