package com.example.tp4androidex1;

public class Movie {

    private String Nom;
    private String Annee;
    private String Genre;

    public Movie(String nom, String genre ,String annee) {
        Nom = nom;
        Annee = annee;
        Genre = genre;
    }

    public String getNom() {
        return Nom;
    }

    public String getAnnee() {
        return Annee;
    }

    public String getGenre() {
        return Genre;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setAnnee(String annee) {
        Annee = annee;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
