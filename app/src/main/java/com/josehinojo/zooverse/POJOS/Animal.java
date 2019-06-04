package com.josehinojo.zooverse.POJOS;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Animal implements Parcelable {

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.threats);
        dest.writeString(this.taxon);
        dest.writeString(this.source);
        dest.writeString(this.scientificName);
        dest.writeString(this.habitat);
        dest.writeString(this.geoRange);
        dest.writeString(this.conservationStatus);
        dest.writeString(this.commonName);
        dest.writeString(this.Citation);
    }

    protected Animal(Parcel in) {
        this.name = in.readString();
        this.threats = in.readString();
        this.taxon = in.readString();
        this.source = in.readString();
        this.scientificName = in.readString();
        this.habitat = in.readString();
        this.geoRange = in.readString();
        this.conservationStatus = in.readString();
        this.commonName = in.readString();
        this.Citation = in.readString();
    }

    public static final Parcelable.Creator<Animal> CREATOR = new Parcelable.Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel source) {
            return new Animal(source);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };
}


