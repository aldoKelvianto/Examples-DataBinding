package com.aldoapps.adbpractice.blog;

import android.databinding.ObservableDouble;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;

/**
 * Created by aldo on 12/23/16.
 */

public class Article {
    public final ObservableField<ArticlePOJO> article = new ObservableField<>();
    public final ObservableLong price = new ObservableLong(31);
}
