package com.example.myapplication.movies;
public class MovieActivity{
    private String title;
    private String imageUrl;

    private String id;


    public MovieActivity(String id, String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.id = id;

    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }
}
