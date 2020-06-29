package com.joule.endahebralingmascakeb.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelEvent implements Parcelable {
    String cover;
    String name;
    String desc1;
    String desc2;
    String photosby;

    public ModelEvent() {
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getPhotosby() {
        return photosby;
    }

    public void setPhotosby(String photosby) {
        this.photosby = photosby;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cover);
        dest.writeString(this.name);
        dest.writeString(this.desc1);
        dest.writeString(this.desc2);
        dest.writeString(this.photosby);
    }

    protected ModelEvent(Parcel in) {
        this.cover = in.readString();
        this.name = in.readString();
        this.desc1 = in.readString();
        this.desc2 = in.readString();
        this.photosby = in.readString();
    }

    public static final Parcelable.Creator<ModelEvent> CREATOR = new Parcelable.Creator<ModelEvent>() {
        @Override
        public ModelEvent createFromParcel(Parcel source) {
            return new ModelEvent(source);
        }

        @Override
        public ModelEvent[] newArray(int size) {
            return new ModelEvent[size];
        }
    };
}
