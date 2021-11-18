package com.example.omnivisionapplication;

import java.util.ArrayList;

public class ModelOmniVision {
    public ArrayList<Chantier> chantiers;

    public static class Chantier {
        int id_chantier;
        double coordonnees_lattitude_chantier;
        double coordonnees_longitude_chantier;
        String nom_chantier;
        String date_de_debut_chantier;
        int id_projet;

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
    }

    public ArrayList<Chantier> getChantiers() {
        return chantiers;
    }

    public void setChantiers(ArrayList<Chantier> chantiers) {
        this.chantiers = chantiers;
    }
}
