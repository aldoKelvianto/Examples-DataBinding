package com.aldoapps.adbpractice.blog;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by aldo on 12/23/16.
 */

public class ArticleBaseObservable extends BaseObservable {
    private String title;
    private String excerpt;
    private boolean hightlight;
    private String imageUrl;
    private int commentsNumber;
    private boolean read;

    public ArticleBaseObservable(String title, String excerpt, boolean hightlight, String imageUrl, int commentsNumber) {
        this.title = title;
        this.excerpt = excerpt;
        this.hightlight = hightlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = false;
    }

    public ArticleBaseObservable(String title, String excerpt, boolean hightlight, String imageUrl, int commentsNumber, boolean read) {
        this.title = title;
        this.excerpt = excerpt;
        this.hightlight = hightlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = read;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public void setHightlight(boolean hightlight) {
        this.hightlight = hightlight;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    // =============================
    // Nothing special in getter
    // =============================

    public boolean isRead() {
        return read;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isHightlight() {
        return hightlight;
    }

    public String getExcerpt() {
        return excerpt;
    }

}
