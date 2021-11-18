package com.example.omnivisionapplication.placeholder;

public class Chantier {

    int id_chantier;
    double coordonnees_lattitude_chantier;
    double coordonnees_longitude_chantier;
    String nom_chantier;
    String date_de_debut_chantier;
    int id_projet;
    int imgPathint;
    String imgPathString;

    public String getImgPathString() {
        return imgPathString;
    }

    public void setImgPathString(String imgPathString) {
        this.imgPathString = imgPathString;
    }

    public Chantier(int id_chantier, String nom_chantier, int imgPathint, String imgPathString) {
        this.id_chantier = id_chantier;
   this.imgPathint = imgPathint;
        this.nom_chantier = nom_chantier;
        this.imgPathString = imgPathString;
    }

    public int getImgPath() {
        return imgPathint;
    }

    public void setImgPath(int imgPathint) {
        this.imgPathint = imgPathint;
    }

    public int getId_chantier() {
        return id_chantier;
    }

    public void setId_chantier(int id_chantier) {
        this.id_chantier = id_chantier;
    }

    public double getCoordonnees_lattitude_chantier() {
        return coordonnees_lattitude_chantier;
    }

    public void setCoordonnees_lattitude_chantier(double coordonnees_lattitude_chantier) {
        this.coordonnees_lattitude_chantier = coordonnees_lattitude_chantier;
    }

    public double getCoordonnees_longitude_chantier() {
        return coordonnees_longitude_chantier;
    }

    public void setCoordonnees_longitude_chantier(double coordonnees_longitude_chantier) {
        this.coordonnees_longitude_chantier = coordonnees_longitude_chantier;
    }

    public String getNom_chantier() {
        return nom_chantier;
    }

    public void setNom_chantier(String nom_chantier) {
        this.nom_chantier = nom_chantier;
    }

    public String getDate_de_debut_chantier() {
        return date_de_debut_chantier;
    }

    public void setDate_de_debut_chantier(String date_de_debut_chantier) {
        this.date_de_debut_chantier = date_de_debut_chantier;
    }

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    @Override
    public String toString()  {
        return this.nom_chantier+" (image path: "+ this.imgPathString + ")";
    }

}
