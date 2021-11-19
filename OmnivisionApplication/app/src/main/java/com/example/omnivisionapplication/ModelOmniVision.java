package com.example.omnivisionapplication;

import com.google.gson.annotations.SerializedName;

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
        @SerializedName("incident")
        ArrayList<Chantier.Incident> incidents;

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

        public ArrayList<Incident> getIncidents() {
            return incidents;
        }

        public void setIncidents(ArrayList<Incident> incidents) {
            this.incidents = incidents;
        }

        public static class Incident {
            int id_capture;
            String url_capture;
            String type_capture;
            String date_capture;
            double longitude_capture;
            double lattitude_capture;
            String reference_gantt;
            String description_incident;
            int gravite_incident;
            int forceRecord_incident;
            String nom_incident;

            public String getNom_incident() {
                return nom_incident;
            }

            public void setNom_incident(String nom_incident) {
                this.nom_incident = nom_incident;
            }

            public int getId_capture() {
                return id_capture;
            }

            public void setId_capture(int id_capture) {
                this.id_capture = id_capture;
            }

            public String getUrl_capture() {
                return url_capture;
            }

            public void setUrl_capture(String url_capture) {
                this.url_capture = url_capture;
            }

            public String getType_capture() {
                return type_capture;
            }

            public void setType_capture(String type_capture) {
                this.type_capture = type_capture;
            }

            public String getDate_capture() {
                return date_capture;
            }

            public void setDate_capture(String date_capture) {
                this.date_capture = date_capture;
            }

            public double getLongitude_capture() {
                return longitude_capture;
            }

            public void setLongitude_capture(double longitude_capture) {
                this.longitude_capture = longitude_capture;
            }

            public double getLattitude_capture() {
                return lattitude_capture;
            }

            public void setLattitude_capture(double lattitude_capture) {
                this.lattitude_capture = lattitude_capture;
            }

            public String getReference_gantt() {
                return reference_gantt;
            }

            public void setReference_gantt(String reference_gantt) {
                this.reference_gantt = reference_gantt;
            }

            public String getDescription_incident() {
                return description_incident;
            }

            public void setDescription_incident(String description_incident) {
                this.description_incident = description_incident;
            }

            public int getGravite_incident() {
                return gravite_incident;
            }

            public void setGravite_incident(int gravite_incident) {
                this.gravite_incident = gravite_incident;
            }

            public int getForceRecord_incident() {
                return forceRecord_incident;
            }

            public void setForceRecord_incident(int forceRecord_incident) {
                this.forceRecord_incident = forceRecord_incident;
            }
        }
    }

    public ArrayList<Chantier> getChantiers() {
        return chantiers;
    }

    public void setChantiers(ArrayList<Chantier> chantiers) {
        this.chantiers = chantiers;
    }
}
