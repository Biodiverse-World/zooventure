package com.josehinojo.zooverse.POJOS;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Animal {

    private String name;
    private String threats;
    private String taxon;
    private String source;
    private String scientificName;
    private String habitat;
    private String geoRange;
    private String conservationStatus;
    private String commonName;
    private String Citation;

    public Animal(){

    }

    public Animal(String name, String threats, String taxon, String source, String scientificName, String habitat, String geoRange, String conservationStatus, String commonName, String citation) {
        this.name = name;
        this.threats = threats;
        this.taxon = taxon;
        this.source = source;
        this.scientificName = scientificName;
        this.habitat = habitat;
        this.geoRange = geoRange;
        this.conservationStatus = conservationStatus;
        this.commonName = commonName;
        Citation = citation;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThreats() {
        return threats;
    }

    public void setThreats(String threats) {
        this.threats = threats;
    }

    public String getTaxon() {
        return taxon;
    }

    public void setTaxon(String taxon) {
        this.taxon = taxon;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGeoRange() {
        return geoRange;
    }

    public void setGeoRange(String geoRange) {
        this.geoRange = geoRange;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getCitation() {
        return Citation;
    }

    public void setCitation(String citation) {
        Citation = citation;
    }
}
