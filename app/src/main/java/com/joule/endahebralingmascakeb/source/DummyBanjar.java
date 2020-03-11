package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyBanjar {
    private final static String URL_DOMAIN = "https://jou333.000webhostapp.com";
    private final static String KOTA = "BANJARNEGARA";

    private static String[][] cityTurismData = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Surya Yudha Park Banjarnegara","Banjarnegara", "https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/1.jpg", "Rp 25.000,00", "@ratnaamaharanii\n" +
                    "Travelspromo.com\n" +
                    "Macamtiket.com\n" +
                    "Tripjalanjalan.com\n" +
                    "Beritagar.id\n" +
                    "Wisatajateng.id",
                    "https://goo.gl/maps/R8RPG4vFdbde8GLE6", "Taking a photo in front of the Singaporean and American mascots simultaneously without\n" +
                    "the photo editing application can only be done in this one place. Surya Yudha Park has a Merlion\n" +
                    "statue and a Statue of Liberty which stand next to each other. Not having the opportunity to go to\n" +
                    "the two developed countries, they can first visit Surya Yudha Park. This tourist spot is the most\n" +
                    "complete water recreation park in Banjarnegara. This tourist attraction in Banjarnegara carries the\n" +
                    "concept of integrated tourism with a variety of amenities such as star hotels, sports arenas, rafting,\n" +
                    "as well as outbound tourism. Is one of the attractive alternative family tours."}
    };

    private static String[][] ecoTurismData = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Waduk Merica Banjarnegara","Banjarnegara", "https://jou333.000webhostapp.com/BANJARNEGARA/ECOTOURISM/wadukmerica/1.jpg", "Rp 2.000,00",

                    "@eko_juliadi\n" +
                    "Jateng.tribunews.com\n" +
                    "Aroengbinang.com\n" +
                    "Ksmtour.com\n" +
                    "Ihtgreenjello.com",

                    "https://goo.gl/maps/jb9M7d6nFEMtyuK37", "In the Mrica Reservoir, you can enjoy the vast expanse of the water surface. if you want to\n" +
                    "see the largest artificial lake in Southeast Asia, then this is the lake. This reservoir is a reservoir that\n" +
                    "dams the Serayu River. The natural panorama certainly doesn&#39;t need to be asked, you can enjoy the\n" +
                    "natural charm around this reservoir especially with the various tourist facilities. Family tourism will\n" +
                    "feel comfortable in this Banjarnegara tourist attraction. Fun activities can be done such as fishing,\n" +
                    "boat rides, to play golf."}
    };

    private static String[][] dataSliderSuryaYudha = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/1.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/2.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/3.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/4.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/5.jpeg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CITYTOURISM/SuryaYudhaParkBanjarnegara/6.jpg","","","",""},
    };

    private static String[][] dataSliderMrica = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/ECOTOURISM/wadukmerica/1.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/ECOTOURISM/wadukmerica/2.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/ECOTOURISM/wadukmerica/3.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/ECOTOURISM/wadukmerica/4.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/ECOTOURISM/wadukmerica/5.png","","","",""},
    };

    public static ArrayList<ModelDestination> getType( String Type){
        ArrayList<ModelDestination> list = new ArrayList<>();
        switch (Type){
            case "Eco Tourism":
                for (String[] adata :ecoTurismData){
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
                break;
            case "City Tourism":
                for (String[] adata :cityTurismData){
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
                break;
            case "Culinary":
                break;
        }
        return list;
    }

    public static ArrayList<ModelDestination> getsliderofBanjar(String destination){
        ArrayList<ModelDestination> list = new ArrayList<>();

        switch (destination){
            case "Surya Yudha Park Banjarnegara":
                for (String[] adata :dataSliderSuryaYudha){
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
                break;
            case "Waduk Merica Banjarnegara":
                for (String[] adata :dataSliderMrica){
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
                break;
        }

        return list;
    }
}
