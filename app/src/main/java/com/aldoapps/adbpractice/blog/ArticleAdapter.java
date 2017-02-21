package com.aldoapps.adbpractice.blog;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ItemArticleBinding;

import java.util.List;

/**
 * Created by aldo on 12/23/16.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleBindingHolder> {

    private List<ArticleBaseObservable> articleList;

    public ArticleAdapter(List<ArticleBaseObservable> articleList) {
        this.articleList = articleList;
    }

    @Override
    public ArticleBindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemArticleBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_article, parent, false);
        return new ArticleBindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(ArticleBindingHolder holder, int position) {
        ArticleBaseObservable article = articleList.get(position);
        holder.binding.setArticle(article);
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public static class ArticleBindingHolder extends RecyclerView.ViewHolder {

        private ItemArticleBinding binding;

        public ArticleBindingHolder(ItemArticleBinding binding) {
            super(binding.contactCard);
            this.binding = binding;
        }
    }
}
