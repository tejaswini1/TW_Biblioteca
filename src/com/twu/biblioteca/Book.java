package com.twu.biblioteca;

// gives single book details

public class Book {
    String author;
    String name;
    String yearOfPublication;

    public Book(String name, String author, String yearOfPublication){
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;

    }

    public String toString(){
        return name+", "+author+", "+yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Book && (this.name.equals(((Book) o).name)))
            return true;
        return false;
    }


}
