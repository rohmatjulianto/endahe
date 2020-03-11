package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelBtn;
import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyData {

    private final static String URL_DOMAIN = "https://jou333.000webhostapp.com";

    private static String[][] dataSliderTop = new String[][]{
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
                    "as well as outbound tourism. Is one of the attractive alternative family tours."},

            {"Kampung Kurcaci","Purbalingga", "https://jou333.000webhostapp.com/PURBALINGGA/ECO%20TOURISM/Kampung%20Kurcaci/0.jpg", "Rp 5.000,00", "Galihriansyah\n" +
                    "Rini_keep_smile, Nia.hidayat\n" +
                    "Instapurwokerto\n" +
                    "Wisatakphbanyumastimur",
                    "https://goo.gl/maps/eJLgkccztUbgWth27", "Serang, Karangreja, Purbalingga, Jawa Tengah. Located at the foot of Mount Slamet, the\n" +
                    "spot called Kampung Dwarf displays two houses of small size and unique, also striking colours. The\n" +
                    "shape is almost the same as the house inhabited by Bilbo and Frodo Baggins, the Hobbits in the\n" +
                    "Lords of the Ring trilogy."},

            {"Lokawisata Baturraden","Banyumas", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/0.JPG", "Rp 14.000,00", "Travelspromo.com\n" +
                    "Commons.wikimedia.org\n" +
                    "Radarpena.id\n" +
                    "Sanjayatour.com\n" +
                    "Gatra.com\n" +
                    "Medianasional.id", "https://goo.gl/maps/ofHXR8CSTee8cQwM6", "One of the tourist attractions that must be visited while in the City of Purwokerto is Baturraden\n" +
                    "Lokawisata. Baturraden Tourism Object is currently one of the tourist locations in the Baturraden\n" +
                    "District, Banyumas Regency, which has the most complete facilities. The location is also quite close\n" +
                    "to Purwokerto city centre, only around 15km, about 15 minutes away by motorized vehicle. This\n" +
                    "tourist spot is suitable for all ages from children to adults with a variety of amenities." +
                    "you will not get it anywhere else."},
            {"Benteng Pendem","Cilacap", "https://jou333.000webhostapp.com/CILACAP/CITYTOURISM/Benteng%20Pendem/0.jpg", "Rp 5.000,00", "Nativeindonesia.com\n" +
                    "News.detik.com\n" +
                    "Id.wikipedia.org\n" +
                    "Federaloil.co.id\n" +
                    "Indonesia.go.id", "https://goo.gl/maps/UYdnNXhRKrD2B1vaA", "According to history, the Dutch fort has been around since 1861. Pendem in Javanese\n" +
                    "means “pendam”. Fort Pendem was indeed buried by sand and neglected. Until 1986 the fort began\n" +
                    "to be excavated and maintained so that it becomes one of the interesting tourist attractions in\n" +
                    "Cilacap."},

            {"Menganti Beach","Kebumen", "https://jou333.000webhostapp.com/KEBUMEN/ECO%20TOURISM/Menganti%20Beach/1.jpg", "Rp 5.000,00", "1. @s_rufiyadi\n" +
                    "2. @kebumentoday\n" +
                    "3. @pantaikebumen.info\n" +
                    "4. @irfa.senja\n" +
                    "5. @ulfamaruapey82\n" +
                    "6. voinews.id", "https://goo.gl/maps/ofHXR8CSTee8cQwM6", "This beach is located in the Karangduwur area, Ayah District which is still included in the Kebumen\n" +
                    "Regency, Central Java.\n" +
                    "It is located approximately 42 kilometers when taken from Kebumen City. While from Gombong\n" +
                    "District the distance is around 35 kilometers. Along the road that goes to Menganti Beach, you will\n" +
                    "be treated to a beautiful view because there are many hills. Besides, the cool weather of the\n" +
                    "Kebumen area will spoil your body and soul that thirst for comfort and tranquility.\n" +
                    "If you are from the center of Kebumen City, the distance is around 40 kilometers. Take the south\n" +
                    "direction for about 60 minutes. The route followed is Kebumen-Petanahan-Puring-Karangbolong-\n" +
                    "Menganti. Traveling on this beach is not expensive. You only need 10 thousand rupiahs per person\n" +
                    "to buy the ticket. The price of 10 thousand rupiahs paid was included with the parking fee. So you\n" +
                    "don&#39;t have to pay again for parking. Menganti Beach is open 24 hours non-stop so you can freely visit\n" +
                    "it anytime."},


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
