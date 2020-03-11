package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyPbg {
    private static String[][] ecoTourism = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Bukit Mertelu","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Bukit%20Mertelu/1.jpg", "Rp 5.000,00", "Yofieart\n" +
                    "Aam_riyanto, Devinaayudia\n" +
                    "Irmspt", "https://goo.gl/maps/ofHXR8CSTee8cQwM6", "Not only can you see the natural beauty of Purbalingga from a height and take a selfie\n" +
                    "photo, but you can also swing with extreme swings on Bukit Mertelu. Beautiful nature Purbalingga\n" +
                    "you can see free from here, but the mainstay is the selfie spot.\n" +
                    "\n" +
                    "There is a bridge that ends at a stretch of nature in the hills of Purbalingga, as well as exotic\n" +
                    "treehouses from tree branches, and the most challenging is hanging on extreme swings.\n" +
                    "Not too high indeed, but the sensation of swinging on the horizon, with a background of green hills,\n" +
                    "you will not get it anywhere else."},

            {"Jembatan Cinta Pring Wulung","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Cinta%20Pring%20Wulung/1.jpg", "Rp 5.000,00", "Nanouceper_ncphoto\n" +
                    "Fiyan_aryanto\n" +
                    "Hanydimas\n" +
                    "Rista_may", "https://goo.gl/maps/phYmqP44XqP3fnK47", "This tourist spot seemed to be a symbol of your closeness and your partner. Taking pictures\n" +
                    "here must be done. The spot is quite exciting. The bridge made of wood and bamboo is made in a\n" +
                    "circle, and in the middle is a hat. This place opens everysay at 7AM until 6PM"},

            {"Jembatan Lampion Desa Bawahan","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Lampion%20Desa%20Bawahan/1.jpg", "Rp 5.000,00", "Helena_hidayati\n" +
                    "Puputsningsih",
                    "https://goo.gl/maps/bMm2e248FTo4HXnK9", "The location is in Bawahan Hamlet, Gunungwuled Tourism Village. So if you visit Sibarat\n" +
                    "Peak, make a stop at this intragenic place. The concept is night tours. With beautiful lanterns\n" +
                    "burning colourful, the impression hit. However, taking cool pictures at night, of course, there are\n" +
                    "challenges. If you want to come when the day is still bright, it doesn&#39;t matter. The 80-meter bridge\n" +
                    "which is above the rice field also offers a cool view,"},

            {"Kampung Kurcaci","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kampung%20Kurcaci/0.jpg", "Rp 5.000,00", "Galihriansyah\n" +
                    "Rini_keep_smile, Nia.hidayat\n" +
                    "Instapurwokerto\n" +
                    "Wisatakphbanyumastimur",
                    "https://goo.gl/maps/eJLgkccztUbgWth27", "Serang, Karangreja, Purbalingga, Jawa Tengah. Located at the foot of Mount Slamet, the\n" +
                    "spot called Kampung Dwarf displays two houses of small size and unique, also striking colours. The\n" +
                    "shape is almost the same as the house inhabited by Bilbo and Frodo Baggins, the Hobbits in the\n" +
                    "Lords of the Ring trilogy."},

            {"Kutabawa Flower Garden","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kutabawa%20Flower%20Garden/0.jpg", "Rp 5.000,00", "Beby.72\n" +
                    "Yudishrl\n" +
                    "Ciciwidy\n" +
                    "Rozaosaki",
                    "https://goo.gl/maps/XVGQh9Rh2EGyj1zc7", "Kutabawa Flower Garden is a new tourist spot in Purbalingga. The flagship, of course, is a\n" +
                    "row of flowers and plants with extraordinary colours.\n" +
                    "Some spots are made attractive through landscape development. So you, the hunter a good place to\n" +
                    "take pictures, can capture it with a camera. Various beautiful flowers scattered in a number of\n" +
                    "places. There are at least 18 types of flowers with beautiful colours."},
    };

    private static String[][] bukitMerteluSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Bukit%20Mertelu/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Bukit%20Mertelu/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Bukit%20Mertelu/3.jpg", "", "", "", ""},
    };

    private static String[][] jembatanCintaSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Cinta%20Pring%20Wulung/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Cinta%20Pring%20Wulung/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Cinta%20Pring%20Wulung/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Cinta%20Pring%20Wulung/4.jpg", "", "", "", ""}
    };

    private static String[][] jembatanLampionSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Lampion%20Desa%20Bawahan/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Jembatan%20Lampion%20Desa%20Bawahan/2.jpg", "", "", "", ""}
    };

    private static String[][] kampungKurcaciSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kampung%20Kurcaci/0.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kampung%20Kurcaci/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kampung%20Kurcaci/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kampung%20Kurcaci/3.jpg", "", "", "", ""}

    };

    private static String[][] flowerSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kutabawa%20Flower%20Garden/0.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kutabawa%20Flower%20Garden/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kutabawa%20Flower%20Garden/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kutabawa%20Flower%20Garden/3.jpg", "", "", "", ""},

    };

//////////////////////////////////////////////////////////////////////////////////////////////////////
    private static String[][] cityTourism = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Desa Wisata Serang","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/CITY%20TOURISM/Desa%20Wisata%20Serang/1.jpg", "Rp 5.000,00", "Nikenfaradilau, Rumputijo\n" +
                    "Ahmad.farkhan.988, Aam_riyanto\n" +
                    "Aam_riyanto\n" +
                    "Afrii_dwip, Ostara_gaharu_himalaya\n" +
                    "Akmallyanuar23", "https://goo.gl/maps/JaVSDbMi1t85af8e6", "The variety of choices for fun in Serang is guaranteed to make you and your family at home. Want to\n" +
                    "stay overnight is no problem because there is a homestay ready to live. You can pick strawberries\n" +
                    "directly in the garden if it&#39;s harvest time. Want to fly fox or ride an ATV motorbike can also."},
    };

    private static String[][] desaWisataSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/CITY%20TOURISM/Desa%20Wisata%20Serang/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/CITY%20TOURISM/Desa%20Wisata%20Serang/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/CITY%20TOURISM/Desa%20Wisata%20Serang/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/CITY%20TOURISM/Desa%20Wisata%20Serang/4.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/PURBALINGGA/CITY%20TOURISM/Desa%20Wisata%20Serang/5.jpg", "", "", "", ""}
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

    public static ArrayList<ModelDestination> getsliderofPbg(String destination){
        ArrayList<ModelDestination> list = new ArrayList<>();

        switch (destination){
            case "Bukit Mertelu":
                for (String[] adata :bukitMerteluSlider){
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
            case "Jembatan Cinta Pring Wulung":
                for (String[] adata :jembatanCintaSlider){
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
            case "Jembatan Lampion Desa Bawahan":
                for (String[] adata :jembatanLampionSlider){
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
            case "Kampung Kurcaci":
                for (String[] adata :kampungKurcaciSlider){
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
            case "Kutabawa Flower Garden":
                for (String[] adata :flowerSlider){
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

            case "Desa Wisata Serang":
                for (String[] adata :desaWisataSlider){
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
