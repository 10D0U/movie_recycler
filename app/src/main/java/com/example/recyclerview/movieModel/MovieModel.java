package com.example.recyclerview.movieModel;

public class MovieModel {
    private int image, ranking;
    private String name;
    private double total;

    public MovieModel(int image, int ranking, String name, double total) {
        this.image = image;
        this.ranking = ranking;
        this.name = name;
        this.total = total;
    }

    public int getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }
}
