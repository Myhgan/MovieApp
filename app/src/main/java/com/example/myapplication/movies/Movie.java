package com.example.myapplication.movies;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private String actors;
    private int year;
    private String description;
    private double rating;
    private String imageUrl;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Movie() {
    }

    public Movie(String title, String director, String actors, int year, String description, double rating, String imageUrl) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.description = description;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.url = url;
    }

    public static List<Movie> GetList(Context context){
        List<Movie> list = new ArrayList<Movie>();

        Movie movie = new Movie("Avatar", "James Cameron", "Sam Worthington, Zoe Saldana", 2009, "Một người ngoài hành tinh tham gia vào một cuộc chiến đấu giữa hai phe đối địch trên hành tinh Pandora.", 7.8, "");

        movie.url = "android.resource://" + context.getPackageName() + "/" ;

        list.add(movie);
        return list;
    }
}
