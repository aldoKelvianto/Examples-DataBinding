package com.aldoapps.adbpractice.blog;

/**
 * Created by aldo on 12/23/16.
 */

public class ArticlePOJO {
    private String title;
    private String excerpt;
    private boolean hightlight;
    private String imageUrl;
    private int commentsNumber;
    private boolean read;

    public ArticlePOJO(String title, String excerpt, boolean hightlight, String imageUrl, int commentsNumber) {
        this.title = title;
        this.excerpt = excerpt;
        this.hightlight = hightlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = false;
    }

    public ArticlePOJO(String title, String excerpt, boolean hightlight, String imageUrl, int commentsNumber, boolean read) {
        this.title = title;
        this.excerpt = excerpt;
        this.hightlight = hightlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = read;
    }
}
