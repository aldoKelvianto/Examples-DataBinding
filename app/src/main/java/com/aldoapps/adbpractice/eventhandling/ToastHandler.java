package com.aldoapps.adbpractice.eventhandling;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by aldo on 12/23/16.
 */

public class ToastHandler {

    private Context context;

    public ToastHandler(Context context) {
        this.context = context;
    }

    public void toastHello(View view) {
        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
    }
}
