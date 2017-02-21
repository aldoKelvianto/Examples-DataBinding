package com.aldoapps.adbpractice.twoway;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ActivityTwoWayBinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by aldo on 1/6/17.
 */

public class TwoWayActivity extends AppCompatActivity {

    private Human human = new Human("aldo", "kelvianto", 18, "male");

    private HumanObservableField hof = new HumanObservableField();

    private ActivityTwoWayBinding activityTwoWayBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityTwoWayBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_two_way);

        hof.firstName.set("Aldo");
        hof.lastName.set("Kelvianto");
        hof.age.set(18);
        activityTwoWayBinding.setHuman(hof);

        activityTwoWayBinding.setHandler(new ButtonClickedHandler());
    }

    public void onBtnUpdateClick(View view) {
    }
}
