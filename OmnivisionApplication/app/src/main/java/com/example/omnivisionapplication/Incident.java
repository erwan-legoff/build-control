package com.example.omnivisionapplication;

public class Incident {

    String nomIncident;
    String descriptionIncident;
    int graviteIncident;
    String dateCapture;
    String nomCapture;

    public Incident(String nomIncident, String descriptionIncident, int graviteIncident, String dateCapture, String nomCapture) {
        this.nomIncident = nomIncident;
        this.descriptionIncident = descriptionIncident;
        this.graviteIncident = graviteIncident;
        this.dateCapture = dateCapture;
        this.nomCapture = nomCapture;
    }

    public String getNomCapture() {
        return nomCapture;
    }

    public void setNomCapture(String nomCapture) {
        this.nomCapture = nomCapture;
    }

    public String getNomIncident() {
        return nomIncident;
    }

    public void setNomIncident(String nomIncident) {
        this.nomIncident = nomIncident;
    }

    public String getDescriptionIncident() {
        return descriptionIncident;
    }

    public void setDescriptionIncident(String descriptionIncident) {
        this.descriptionIncident = descriptionIncident;
    }

    public int getGraviteIncident() {
        return graviteIncident;
    }

    public void setGraviteIncident(int graviteIncident) {
        this.graviteIncident = graviteIncident;
    }

    public String getDateCapture() {
        return dateCapture;
    }

    public void setDateCapture(String dateCapture) {
        this.dateCapture = dateCapture;
    }
}
