package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class DummyBms {
    private static String[][] ecoTourism = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
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

            {"Telaga Sunyi","Banyumas", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/0.jpg", "Rp 10.000,00", "Camerawisata.com\n" +
                    "Merdeka.com\n" +
                    "Goodnewsfromindonesia.com\n" +
                    "Travelingyuk.com\n" +
                    "Inibaru.id\n" +
                    "Purwokertoguidance.com", "https://goo.gl/maps/uDNTbT4zmQVsraFi8", "From the name, you must have imagined that this tourist spot is very quiet and far from the crowd.\n" +
                    "It is not wrong, the quiet Lake Telaga tourism object is indeed far from the crowd and not as busy as\n" +
                    "the Baturraden Lokawisata. Approximately 2.8 KM from Lokawisata Baturraden / Terminal to the\n" +
                    "east and can be reached by car or motorbike about 10-15 minutes." +
                    "you will not get it anywhere else."},
    };

    private static String[][] baturSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/0.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/1.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/2.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/3.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/4.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/5.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/LOKAWISATA%20BATURRADEN/6.JPG", "", "", "", ""},
    };

    private static String[][] telagaSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/0.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/4.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/5.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/6.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/ECO%20TOURISM/TELAGA%20SUNYI/7.jpg", "", "", "", ""},
    };


    //////////////////////////////////////////////////////////////////////////////////////////////////////
    private static String[][] cityTourism = new String[][]{
//            name, city, image, rating as harga, type as photo, mapUrl, about
            {"Alun-Alun Banyumas","Banyumas", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/8.JPG", "Rp 0", "JATENGPROV.GO.ID\n" +
                    "MILITERMETER.COM\n" +
                    "CHEAPER-TOUR.BLOGSPOT.COM\n" +
                    "JATENG.IDNTIMES.COM\n" +
                    "TWITTER.COM", "https://goo.gl/maps/gEZ84JXAKqWW9t7k9", "Alun-alun Banyumas is located at Pramuka Street, Desa Sudagaran, Banyumas. A legendary\n" +
                    "aircraft belonging to the Indonesian Air Force, MIG 17 Fresco, is on display at Banyumas Square,\n" +
                    "Central Java. This aircraft was used by the Air Force in 1960-1969. Alun-Alun Banyumas opens 24\n" +
                    "hours."},
            {"Alun-Alun Purwokerto","Banyumas", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/1.JPG", "Rp 0", "Wikimedia.org\n" +
                    "Tripadvisor.com\n" +
                    "Kabarkabaru.blogspot.co.id\n" +
                    "Rutemu.com\n" +
                    "Liputan6.com\n" +
                    "C.mi.com\n" +
                    "Flickr.com\n" +
                    "Infopurwokerto.com", "https://goo.gl/maps/S94TafkpJHpKUWT4A", "Alun-Alun Purwokerto is located on Jenderal Soedirman street, Sokanegara, Purwokerto\n" +
                    "Timur, Banyumas 53116. If generally a family recreation area is only opened at certain hours for\n" +
                    "example at 8AM until 5PM, in family recreation places such as Alun-Alun Purwokerto there are no\n" +
                    "open time closing hours, here 24 hours are open to the public because this is a publicly owned asset.\n" +
                    "\n" +
                    "If during the day you are busy with your daily routine, try taking a moment to enjoy the peaceful\n" +
                    "atmosphere of the night in Alun-Alun Purwokerto.\n" +
                    "\n" +
                    "At night, say, starting at 8 pm you visit Alun-Alun, you will find a lot of snack vendors around there as\n" +
                    "well as children&#39;s toy vendors suitable for those of you who already have a baby.\n" +
                    "\n" +
                    "Because not only young people often gather here, there are also many families, even some who are\n" +
                    "sometimes playing with their children who are still the age of a toddler"},

            {"Museum Wayang Sendang Mas","Banyumas", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/0.JPG", "Rp 1000,00", "Jannatin Aliyah", "https://goo.gl/maps/S94TafkpJHpKUWT4A", "Right behind the former residence of the Banyumas Regent who is now used as a Banyumas\n" +
                    "subdistrict office, there is an old well measuring 15 cm in diameter which is still maintained.\n" +
                    "The old well is called Sendang Mas. In Javanese, spring means well, while gold is a gold colour. This\n" +
                    "well witnessed the history of the displacement of the Banyumas government centre during the\n" +
                    "leadership of the seventh Banyumas Regent, Raden Malik Ganda Kusuma or commonly known as\n" +
                    "Yudanegara II.\n" +
                    "Around 1708, Yudanegara II wanted to retreat to meditate in a very quiet forest which at that time\n" +
                    "was named Wanasepi, which is now thought to be Binangun Village, Banyumas."},

            {"The Village Purwokerto","Banyumas", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/0.JPG", "Rp 10.000,00", "Olipeoile.wordpress.com\n" +
                    "Mgriyahotel.com\n" +
                    "Inionline.id\n" +
                    "Piknikasyik.com\n" +
                    "Jejekpiknik.com\n" +
                    "Phinemo.com\n" +
                    "Jago-trip.blogspot.com\n" +
                    "Purwokertoguidance.com",
                    "https://g.page/thevillage_purwokerto?share",
                    "The Village is one of the attractions in the city of Purwokerto, this is a building with a unique\n" +
                            "European style. A very different building design looks striking if passing the Baturraden highway.\n" +
                            "From the front, a tall, tall building with brick walls gives the impression of a classic and is second to\n" +
                            "none in Purwokerto, and I think this concept is only in the Central Java region."},
    };

    private static String[][] alunbmsSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/8.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/6.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/7.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/9.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/0.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/1.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/2.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/3.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/4.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20BANYUMAS/5.JPG", "", "", "", ""},
    };

    private static String[][] alunpwtSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/1.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/0.PNG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/2.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/3.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/4.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/5.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/6.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/7.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/8.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/ALUN-ALUN%20PURWOKERTO/9.JPG", "", "", "", ""}
    };

    private static String[][] wayangSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/0.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/1.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/2.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/3.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/4.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/5.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/6.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/MUSEUM%20WAYANG%20SENDANG%20MAS/7.JPG", "", "", "", ""},
    };
    private static String[][] vilageSlider = new String[][]{
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/0.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/1.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/2.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/3.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/4.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/5.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/6.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/7.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/8.JPG", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/BANYUMAS/CITY%20TOURISM/THE%20VILLAGE%20PURWOKERTO/9.JPG", "", "", "", ""},
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

    public static ArrayList<ModelDestination> getsliderofBms(String destination){
        ArrayList<ModelDestination> list = new ArrayList<>();

        switch (destination){
            case "Lokawisata Baturraden":
                for (String[] adata :baturSlider){
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
            case "Telaga Sunyi":
                for (String[] adata :telagaSlider){
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
            case "Alun-Alun Banyumas":
                for (String[] adata :alunbmsSlider){
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
            case "Alun-Alun Purwokerto":
                for (String[] adata :alunpwtSlider){
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
            case "Museum Wayang Sendang Mas":
                for (String[] adata :wayangSlider){
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

            case "The Village Purwokerto":
                for (String[] adata :vilageSlider){
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
