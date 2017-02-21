package com.aldoapps.adbpractice.twoway;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by aldo on 1/6/17.
 */

public class HumanObservableField {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
