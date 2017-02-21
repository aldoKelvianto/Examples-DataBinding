package com.aldoapps.adbpractice.twoway;

import android.view.View;
import android.widget.Button;

/**
 * Created by aldo on 1/6/17.
 */

public class ButtonClickedHandler {

    public void onEventButtonClicked(View view) {
        if (view instanceof Button) {
            int times = Integer.parseInt(view.getTag().toString());
            times++;
            ((Button) view).setText("Clicked: " + times + " Times");
            view.setTag(times);
        }
    }
}
