package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyCulinary {

    private static String[][] dataSlderBanjar = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CULINARY/1.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CULINARY/2.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CULINARY/3.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANJARNEGARA/CULINARY/4.jpg","","","",""}
    };

    private static String[][] dataBanjar = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"Banjarnegara","","","1. Dawet Ayu Hj. Munardjo (jalanjalanenak.com)\n" +
                    "2. Buntil Bu Yani (agrowindo.com)\n" +
                    "3. Soto Pak Aping, Kradengan (imadea.wordpress.com)\n" +
                    "4. Sate Ayam Pak Waji (ellafitria.com)\n" +
                    "5. Dapoer Central (DC) (deskgram.net)"
                    ,"","There are some typical food of Banjarnegara"},
    };


    private static String[][] dataCilacap = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"Cilacap","","","1. Lanting (tokopedia.com/bintangbimo)\n" +
                    "2. Rempeyek Yutuk (winphotoblog.com)\n" +
                    "3. Templeng (olehcilacap.blogspot.com)\n" +
                    "4. Brekecek (warungsna.blogspot.com)\n" +
                    "5. Lepet Ketan (bikinmasakandankue.blogspot.com)\n" +
                    "6. Kerupuk Ikan Tenggiri (rumahmesin.com)\n" +
                    "7. Abon Ikan Tuna (zafamaqsqhuroh.blogspot.com)"
                    ,"","There are some typical food of Cilacap."},
    };
    private static String[][] dataPbg = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"Purbalingga","","","https://zonamakan.com/makanan-khas-purbalingga/\n" +
                    "1. Sroto Kriyik\n" +
                    "2. Buntil\n" +
                    "3. Mendoan\n" +
                    "4. Sate Blater\n" +
                    "5. Gulai Melung\n" +
                    "6. Nopia\n" +
                    "7. Es Durian"
                    ,"","There are some typical food of Purbalingga."},
    };
    private static String[][] dataBms = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"Banyumas","","","1. Gethuk Goreng (resepkoki.id)\n" +
                    "2. Mendoan (info.st3telkom.ac.id)\n" +
                    "3. Jenang Jaket (enangnya.blogspot.co.id)\n" +
                    "4. Nopia (bagi-in.com)\n" +
                    "5. Kripik Tempe (rumahmesin.com)\n" +
                    "6. Lanting (budaya-indonesia.org)\n" +
                    "7. Soto Sokaraja (zonamakan.blogspot.co.id)\n" +
                    "8. Kraca (cookpad.com)\n" +
                    "9. Intil (visitjateng.id)"
                    ,"","There are some typical food of Banyumas."},
    };

    private static String[][] dataKeb = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"Kebumen","","","1. Lanting Kebumenhow.com\n" +
                    "2. Kethek Cookpad.com\n" +
                    "3. Jipang kacang Bukalapak.com\n" +
                    "4. Golak @wo2go7\n" +
                    "5. Sate ambal @petualanganduogendut\n" +
                    "6. Soto petanahan @ngapakfoodgram"
                    ,"","There are some typical food of Kebumen."},
    };



    private static String[][] dataSlderCilacap = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/1.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/2.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/3.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/4.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/5.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/6.jpeg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/CILACAP/CULINARY/7.jpg","","","",""}
    };
    private static String[][] dataSlderPbg = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/0.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/1.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/2.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/3.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/4.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/5.png","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/PURBALINGGA/CULINARY/6.png","","","",""}
    };

    private static String[][] dataSlderBms = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/1.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/2.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/3.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/4.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/5.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/6.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/7.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/8.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/BANYUMAS/CULINARY/9.jpg","","","",""}
    };

    private static String[][] dataSlderKeb = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/0.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/1.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/2.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/3.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/4.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/5.jpg","","","",""},
            {"" ,"","https://jou333.000webhostapp.com/KEBUMEN/CULINARY/6.jpg","","","",""},
    };



    public static ArrayList<ModelDestination> getSider(String kab){
        ArrayList<ModelDestination> list = new ArrayList<>();
        switch (kab){
            case "Banjarnegara":
                for (String[] adata : dataSlderBanjar){
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
            case "Cilacap" :
                for (String[] adata : dataSlderCilacap){
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
            case "Purbalingga":
                for (String[] adata : dataSlderPbg){
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
            case "Banyumas" :
                for (String[] adata : dataSlderBms){
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
            case "Kebumen":
                for (String[] adata : dataSlderKeb){
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

    public static ModelDestination getData(String kab){
        ModelDestination modelDestinations = new ModelDestination();
        switch (kab){
            case "Banjarnegara":
                for (String[] adata : dataBanjar){
                    ModelDestination modelDestination = new ModelDestination();
                    modelDestination.setName(adata[0]);
                    modelDestination.setCity(adata[1]);
                    modelDestination.setImage(adata[2]);
                    modelDestination.setRating(adata[3]);
                    modelDestination.setType(adata[4]);
                    modelDestination.setMapUrl(adata[5]);
                    modelDestination.setAbout(adata[6]);
                    modelDestinations = modelDestination;
                }
                break;
            case "Cilacap" :
                for (String[] adata : dataCilacap){
                    ModelDestination modelDestination = new ModelDestination();
                    modelDestination.setName(adata[0]);
                    modelDestination.setCity(adata[1]);
                    modelDestination.setImage(adata[2]);
                    modelDestination.setRating(adata[3]);
                    modelDestination.setType(adata[4]);
                    modelDestination.setMapUrl(adata[5]);
                    modelDestination.setAbout(adata[6]);
                    modelDestinations = modelDestination;
                }
                break;
            case "Purbalingga":
                for (String[] adata : dataPbg){
                    ModelDestination modelDestination = new ModelDestination();
                    modelDestination.setName(adata[0]);
                    modelDestination.setCity(adata[1]);
                    modelDestination.setImage(adata[2]);
                    modelDestination.setRating(adata[3]);
                    modelDestination.setType(adata[4]);
                    modelDestination.setMapUrl(adata[5]);
                    modelDestination.setAbout(adata[6]);
                    modelDestinations = modelDestination;
                }
                break;
            case "Banyumas":
                for (String[] adata : dataBms){
                    ModelDestination modelDestination = new ModelDestination();
                    modelDestination.setName(adata[0]);
                    modelDestination.setCity(adata[1]);
                    modelDestination.setImage(adata[2]);
                    modelDestination.setRating(adata[3]);
                    modelDestination.setType(adata[4]);
                    modelDestination.setMapUrl(adata[5]);
                    modelDestination.setAbout(adata[6]);
                    modelDestinations = modelDestination;
                }
                break;
            case "Kebumen":
                for (String[] adata : dataKeb){
                    ModelDestination modelDestination = new ModelDestination();
                    modelDestination.setName(adata[0]);
                    modelDestination.setCity(adata[1]);
                    modelDestination.setImage(adata[2]);
                    modelDestination.setRating(adata[3]);
                    modelDestination.setType(adata[4]);
                    modelDestination.setMapUrl(adata[5]);
                    modelDestination.setAbout(adata[6]);
                    modelDestinations = modelDestination;
                }
                break;
        }

        return modelDestinations;
    }
}
