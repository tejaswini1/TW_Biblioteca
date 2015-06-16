package com.twu.biblioteca;

public class Movie implements Item{

    private String name;
    private String year;
    private String director;
    private int rating;

    public Movie(String name, String year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String toString() {
        return name + " " + year + " " + director + " " + rating;
    }

    public boolean match(String name) {
        return this.name.equals(name);
    }
}
