package com.aldoapps.adbpractice.eventhandling;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by aldo on 12/23/16.
 */

public class ToastPresenter {

    private Context context;

    public ToastPresenter(Context context) {
        this.context = context;
    }

    public void sayHello(HumanBean humanBean) {
        Toast.makeText(context, "hallo " + humanBean.getName(), Toast.LENGTH_SHORT).show();
    }
}
