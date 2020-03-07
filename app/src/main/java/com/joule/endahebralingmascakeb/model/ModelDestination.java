package com.joule.endahebralingmascakeb.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.recyclerview.widget.RecyclerView;

public class ModelDestination implements Parcelable {

    String name;
    String city;
    String image;
    String rating;
    String type;
    String mapUrl;
    String about;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModelDestination() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.city);
        dest.writeString(this.image);
        dest.writeString(this.rating);
        dest.writeString(this.type);
        dest.writeString(this.mapUrl);
        dest.writeString(this.about);
    }

    protected ModelDestination(Parcel in) {
        this.name = in.readString();
        this.city = in.readString();
        this.image = in.readString();
        this.rating = in.readString();
        this.type = in.readString();
        this.mapUrl = in.readString();
        this.about = in.readString();
    }

    public static final Creator<ModelDestination> CREATOR = new Creator<ModelDestination>() {
        @Override
        public ModelDestination createFromParcel(Parcel source) {
            return new ModelDestination(source);
        }

        @Override
        public ModelDestination[] newArray(int size) {
            return new ModelDestination[size];
        }
    };
}
