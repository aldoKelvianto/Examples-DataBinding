package com.aldoapps.adbpractice.blog;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ActivityRecyclerViewBindingBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aldo on 12/23/16.
 */

public class RecyclerViewBindingActivity extends AppCompatActivity {

    ActivityRecyclerViewBindingBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view_binding);

        initArticleList();
    }

    private void initArticleList() {
        LinearLayoutManager manager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        binding.articleList.setLayoutManager(manager);

        List<ArticleBaseObservable> articles = new ArrayList<>();

        articles.add(new ArticleBaseObservable("An outbreak of parasitic bees",
                "This summer, we are facing a very serious issue. And it is nothing else but an outbreak of parasitic bees.",
                true, "android.resource://com.example.databindingblog/drawable/bee", 45));
        articles.add(new ArticleBaseObservable("Brno - the city of 2016",
                "It has been announced by the committee of know-it-all that Brno has been elected city of year 2016.",
                false, "android.resource://com.example.databindingblog/drawable/brno", 0));
        articles.add(new ArticleBaseObservable("Restaurants in trouble",
                "Restaurants offering daily menus could soon face a serious trouble. The government has just...",
                true, "android.resource://com.example.databindingblog/drawable/food", 1));
        articles.add(new ArticleBaseObservable("Survey amongst drivers reveals shocking facts",
                "A survey taken by 1100 drivers commuting every day to work shows that the drivers mostly drive their car alone.",
                false, "android.resource://com.example.databindingblog/drawable/driver", 33));
        articles.add(new ArticleBaseObservable("Rugby for everyone?",
                "Until lately, rugby has been considered a sport played only by men. What are the consequences...",
                false, "android.resource://com.example.databindingblog/drawable/rugby", 11));

        ArticleAdapter articleAdapter = new ArticleAdapter(articles);
        binding.articleList.setAdapter(articleAdapter);

    }
}
