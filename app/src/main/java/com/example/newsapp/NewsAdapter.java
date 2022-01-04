package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<NewsArticle> {

    public NewsAdapter(Context context, List<NewsArticle> newsArticles) {
        super(context, 0, newsArticles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        NewsArticle currentNewsArticle = getItem(position);

        TextView textViewTitle = (TextView) listItemView.findViewById(R.id.text_title);
        TextView textViewSection = (TextView) listItemView.findViewById(R.id.text_section);
        TextView textViewDate = (TextView) listItemView.findViewById(R.id.text_Date);
        TextView textViewType = (TextView) listItemView.findViewById(R.id.text_type);

        textViewTitle.setText(currentNewsArticle.getTitle().substring(0, 60) + " ...");
        textViewSection.setText(currentNewsArticle.getSection());
        textViewDate.setText(currentNewsArticle.getDate());
        textViewType.setText(currentNewsArticle.getType());

        return listItemView;
    }

}
