package com.aldoapps.adbpractice.blog;

import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

/**
 * Created by aldo on 12/23/16.
 */

public class ArticleObservable implements Observable {
    private String title;
    private String excerpt;
    private boolean hightlight;
    private String imageUrl;
    private int commentsNumber;
    private boolean read;

    PropertyChangeRegistry registry;

    public ArticleObservable(String title, String excerpt, boolean hightlight, String imageUrl, int commentsNumber) {
        this.title = title;
        this.excerpt = excerpt;
        this.hightlight = hightlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = false;
    }

    public ArticleObservable(String title, String excerpt, boolean hightlight, String imageUrl, int commentsNumber, boolean read) {
        this.title = title;
        this.excerpt = excerpt;
        this.hightlight = hightlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = read;
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {

    }
}
