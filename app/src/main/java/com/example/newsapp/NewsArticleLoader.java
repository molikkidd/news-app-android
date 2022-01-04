package com.example.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class NewsArticleLoader extends AsyncTaskLoader<List<NewsArticle>> {

    private static final String LOG_TAG = NewsArticleLoader.class.getName();

    private String mUrl;
    public NewsArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<NewsArticle> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<NewsArticle> newsArticles = QueryUtils.fetchNewsArticleData(mUrl);
        return newsArticles;
    }
}
