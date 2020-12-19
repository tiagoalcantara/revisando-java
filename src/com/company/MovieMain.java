package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Movie {
    // public, private, protected
    private String title;
    private GregorianCalendar releaseDate;

    public Movie(String title, GregorianCalendar releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setCalendar(releaseDate);

        return formatter.format(releaseDate.getTime());
    }

    public void setReleaseDate(GregorianCalendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return String.format("%s, lançado em %s", this.title, this.getReleaseDate());
    }
}

public class MovieMain {
    public static void main(String[] args) {
        // Tipos complexos -> String, Integer, Double, Array, Scanner
        // Fazer uma classe é fazer um tipo complexo customizado

        Movie filme = new Movie("O Rei Leão", new GregorianCalendar(1994, Calendar.JULY, 10));
        System.out.println(filme.getTitle());
        System.out.println(filme.getReleaseDate());

        System.out.println(filme);
    }
}
