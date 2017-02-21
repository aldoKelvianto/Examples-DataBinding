package com.aldoapps.adbpractice.blog;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;
import com.squareup.picasso.Picasso;

/**
 * Created by aldo on 12/23/16.
 */

public class ArticleBaseObservable extends BaseObservable {
    private String title;
    private String excerpt;
    private boolean highlight;
    private String imageUrl;
    private int commentsNumber;
    private boolean read;

    public ArticleBaseObservable(String title, String excerpt, boolean highlight, String imageUrl, int commentsNumber) {
        this.title = title;
        this.excerpt = excerpt;
        this.highlight = highlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = false;
    }

    public ArticleBaseObservable(String title, String excerpt, boolean highlight, String imageUrl, int commentsNumber, boolean read) {
        this.title = title;
        this.excerpt = excerpt;
        this.highlight = highlight;
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

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public void setRead(boolean read) {
        if (read && !this.read) {
            setTitle("READ: " + getTitle());
        }

        this.read = read;
    }

    public boolean isRead() {
        return read;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public View.OnClickListener onReadMoreClicked() {
        return v -> Toast.makeText(v.getContext(), "Open Article Detail", Toast.LENGTH_SHORT).show();
    }

    public View.OnClickListener onCommentsClicked() {
        return v -> Toast.makeText(v.getContext(), "Open comments detail", Toast.LENGTH_SHORT).show();
    }

    @BindingAdapter({"image"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext()).load(imageUrl).into(view);
    }
}
