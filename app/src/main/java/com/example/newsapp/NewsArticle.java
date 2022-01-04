package com.example.newsapp;

public class NewsArticle {
    private String section;

    private String date;

    private String title;

    private String url;
    private String author;

    public String getSection() {
        return section;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return author;
    }

    public NewsArticle(String section, String date, String title, String url, String author) {
        this.section = section;
        this.date = date;
        this.title = title;
        this.url = url;
        this.author = author;

    }
}
