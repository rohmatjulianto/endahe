package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelBtn;
import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyData {

    private final static String URL_DOMAIN = "https://jou333.000webhostapp.com";

    public static String[][] dataSliderTop = new String[][]{
//            name, city, image, rating, type, mapUrl, about
            {"Alun Alun Kebumen","Kebumen", URL_DOMAIN+"/keb/alunalunkeb.jpg", "5", "", "https://goo.gl/maps/PuuDDqFhXT7umToA7", "blablasdasdasd"},
            {"Alun Alun Kebumen","Kebumen", URL_DOMAIN+"/keb/alunalunkeb.jpg", "5", "", "https://goo.gl/maps/PuuDDqFhXT7umToA7", "blablasdasdasd"},
            {"Alun Alun Kebumen","Kebumen", URL_DOMAIN+"/keb/alunalunkeb.jpg", "5", "", "https://goo.gl/maps/PuuDDqFhXT7umToA7", "blablasdasdasd"},
            {"Alun Alun Kebumen","Kebumen", URL_DOMAIN+"/keb/alunalunkeb.jpg", "5", "", "https://goo.gl/maps/PuuDDqFhXT7umToA7", "blablasdasdasd"}
    };

    private static String[][] dataButton = new String[][]{
//            name, logo
            {"Banjarnegara","https://upload.wikimedia.org/wikipedia/id/d/d4/Banjarnegara.png"},
            {"Purbalingga", "https://upload.wikimedia.org/wikipedia/id/9/9c/Kabupaten_purbalingga.png"},
            {"Banyumas", "https://upload.wikimedia.org/wikipedia/id/0/01/Kabupaten_Banyumas.png"},
            {"Cilacap", "https://upload.wikimedia.org/wikipedia/id/0/00/Logo-Cilacap.png"},
            {"Kebumen", "https://upload.wikimedia.org/wikipedia/id/c/c2/LOGO_KABUPATEN_KEBUMEN.png"}
    };

    public static ArrayList<ModelBtn> getDataBtn(){
        ArrayList<ModelBtn> list = new ArrayList<>();
        for (String[] adata : dataButton){
            ModelBtn modelBtn = new ModelBtn();
            modelBtn.setName(adata[0]);
            modelBtn.setImage(adata[1]);
            list.add(modelBtn);
        }
        return list;
    }

    public static ArrayList<ModelDestination> getDataSliderTop(){
        ArrayList<ModelDestination> list = new ArrayList<>();
        for (String[] adata : dataSliderTop){
            ModelDestination modelDestination = new ModelDestination();
            modelDestination.setName(adata[0]);
            modelDestination.setCity(adata[1]);
            modelDestination.setImage(adata[2]);
            modelDestination.setRating(adata[3]);
            modelDestination.setType(adata[4]);
            modelDestination.setMapUrl(adata[5]);
            modelDestination.setAbout(adata[6]);
            list.add(modelDestination);
        }
        return list;
    }
}
