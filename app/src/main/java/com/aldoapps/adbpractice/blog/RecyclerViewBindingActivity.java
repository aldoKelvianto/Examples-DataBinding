package com.aldoapps.adbpractice.blog;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.aldoapps.adbpractice.R;
import com.aldoapps.adbpractice.databinding.ActivityRecyclerViewBindingBinding;

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
    }
}
