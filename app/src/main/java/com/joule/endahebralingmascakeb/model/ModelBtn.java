package com.joule.endahebralingmascakeb.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelBtn implements Parcelable {
    String name;
    String image;

    public ModelBtn() {
    }

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.image);
    }

    protected ModelBtn(Parcel in) {
        this.name = in.readString();
        this.image = in.readString();
    }

    public static final Parcelable.Creator<ModelBtn> CREATOR = new Parcelable.Creator<ModelBtn>() {
        @Override
        public ModelBtn createFromParcel(Parcel source) {
            return new ModelBtn(source);
        }

        @Override
        public ModelBtn[] newArray(int size) {
            return new ModelBtn[size];
        }
    };
}
