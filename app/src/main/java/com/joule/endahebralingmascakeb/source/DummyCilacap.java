package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyCilacap {

    private static String[][] ecoTourism = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Curug Mandala","Cilacap", "https://jou333.000webhostapp.com/CILACAP/ECOTOURISM/Curug%20Mandala/0.jpg", "Rp 5.000,00", "@munandar_tadlo\n" +
                    "Wisataidn.com\n" +
                    "Jukron.blogspot.com\n" +
                    "Jalanjalanenak.com\n" +
                    "Wisata-tanahair.com", "https://goo.gl/maps/3SQ8LH45zE69QhTE7", "Besides the beach, Cilacap also has a refreshing waterfall tour. The location is in the village\n" +
                    "of Mandala. To get here you have to be prepared with strong physical supplies because you have to\n" +
                    "pass a hill that is quite draining. But tired during the trip will be paid for with the freshness of the\n" +
                    "waterfall that radiates swiftly from between the rocks."},
    };

    private static String[][] curugMandalaSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/CILACAP/ECOTOURISM/Curug%20Mandala/0.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/ECOTOURISM/Curug%20Mandala/1.jpeg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/ECOTOURISM/Curug%20Mandala/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/ECOTOURISM/Curug%20Mandala/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/ECOTOURISM/Curug%20Mandala/4.jpg", "", "", "", ""}
    };

    private static String[][] cityTourism = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Benteng Pendem","Cilacap", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/0.jpg", "Rp 5.000,00", "Nativeindonesia.com\n" +
                    "News.detik.com\n" +
                    "Id.wikipedia.org\n" +
                    "Federaloil.co.id\n" +
                    "Indonesia.go.id", "https://goo.gl/maps/UYdnNXhRKrD2B1vaA", "According to history, the Dutch fort has been around since 1861. Pendem in Javanese\n" +
                    "means “pendam”. Fort Pendem was indeed buried by sand and neglected. Until 1986 the fort began\n" +
                    "to be excavated and maintained so that it becomes one of the interesting tourist attractions in\n" +
                    "Cilacap."},
    };

    private static String[][] bentengPendemSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/0.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/4.jpg", "", "", "", ""}
    };

    public static ArrayList<ModelDestination> getType(String Type){
        ArrayList<ModelDestination> list = new ArrayList<>();
        switch (Type){
            case "Eco Tourism":
                for (String[] adata :ecoTourism){
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
                for (String[] adata :cityTourism){
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

    public static ArrayList<ModelDestination> getsliderofCilacap(String destination){
        ArrayList<ModelDestination> list = new ArrayList<>();

        switch (destination){
            case "Curug Mandala":
                for (String[] adata :curugMandalaSlider){
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
            case "Benteng Pendem":
                for (String[] adata :bentengPendemSlider){
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
