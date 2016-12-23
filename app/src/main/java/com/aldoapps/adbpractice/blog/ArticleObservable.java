package com.aldoapps.adbpractice.blog;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import static android.databinding.tool.util.GenerationalClassUtil.ExtensionFilter.BR;

/**
 * Created by aldo on 12/23/16.
 */

public class ArticleObservable extends BaseObservable {
    private String title;
    private String excerpt;
    private boolean hightlight;
    private String imageUrl;
    private int commentsNumber;
    private boolean read;

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

    public void setTitle(String title) {
        this.title = title;
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

    @Bindable
    public String getTitle() {
        return title;
    }
}
