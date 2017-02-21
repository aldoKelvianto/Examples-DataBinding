package com.aldoapps.adbpractice.newtwoway;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ActivityNewTwoWayBinding;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by aldo on 2/21/17.
 */

public class NewTwoWayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityNewTwoWayBinding binding = DataBindingUtil
            .setContentView(this, R.layout.activity_new_two_way);

        binding.setHandphone(new Handphone("LG G4", "LG"));

    }

    private ObservableArrayMap<String, Object> getHandphoneObservable() {
        ObservableArrayMap<String, Object> handphoneMap = new ObservableArrayMap<>();
        handphoneMap.put("name", "iPhone 7");
        handphoneMap.put("brand", "Apple");
        return handphoneMap;
    }
}
