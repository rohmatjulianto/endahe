package com.joule.endahebralingmascakeb.source;

import com.joule.endahebralingmascakeb.model.ModelBtn;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.model.ModelEvent;

import java.util.ArrayList;

public class DummyEvent {
    private static String[][] dataEvent = new String[][]{
//            cover, name, desc1, desc2, photos
            {"https://jou333.000webhostapp.com/cowongan/1.jpg","Cowongan", "Cowongan is one type of rain asking ritual or ceremony carried out by the community in the\n" +
                    "Banyumas and surrounding areas. According to Banyumas community trust, the request for the rain to\n" +
                    "come through cowongan is done with the help of an angel, Dewi Sri who is a goddess of rice, a\n" +
                    "symbol of prosperity and prosperity. Through prayers that are carried out with conviction, Dewi Sri\n" +
                    "will come through the archway (rainbow) towards the earth to rain. The arrival of rain means the\n" +
                    "coming of the Divine Mercy who is the source of life for all earth creatures, including humans.",

                    "Cowongan comes from the word &quot;cowong&quot; plus the suffix &quot;an&quot; which in the banyumasan javanese\n" +
                    "can be equated with the word perong, cemong, or therok which is interpreted covering on the face (m.\n" +
                    "Koderi &amp; fadjar p. 1991: 47). Perong, cemong, and therok are more passive (unintentional). While\n" +
                    "cowongan is more active (intentional). So cowongan can be interpreted as something deliberately\n" +
                    "done by someone to decorate the face.",
                    "- Radarbanyumas.co.id\n" +
                    "- Antarafoto.com\n" +
                    "- Seputarbanjar.com"},

            {"https://jou333.000webhostapp.com/grebeg/1.jpg","GREBEG SURA Baturraden", "Grebeg sura baturraden originated from the traditions of the faithful who lived in the mountains.\n" +
                    "Their ancestors express gratitude and serve as a warning to always maintain the balance of nature.\n" +
                    "The elder of the Banyumas Tourism Alliance, Deskart Jatmiko described, in the past, this tradition\n" +
                    "was carried out by traders in the Lokawisata Baturraden area and the village community separately.\n" +
                    "But since 2000, the ritual was packaged into a tourist attraction. Grebeg sura location, centred in the\n" +
                    "Baturraden Lokawisata complex, Karangmangu Village, Baturraden District.",

                    "Because it has become a tourist attraction before the contested mountains are paraded by residents\n" +
                            "and tour operators. In the procession, there was a group carrying cones, tenong (a place for food\n" +
                            "made from bamboo) filled with rice and several arts such as ebeg, genjring and kentongan.\n" +
                            "visitors who are interested in fighting over crops are not only residents but also tourists who happen\n" +
                            "to come on vacation or residents from neighbouring districts. They also took part in eating fried rice\n" +
                            "in tenong which was brought to the Baturraden site.",

                    "- Tribunnews.com\n" +
                            "- Gatrra.com\n" +
                            "- Radarbanyumas.co.id\n" +
                            "- Matamatanews.com\n" +
                            "- Jalansajadulu.blogspot.com\n" +
                            "- Liputan6.com"},

            {"https://jou333.000webhostapp.com/kirab/1.jpg","KIRAB PUSAKA", "Four heirlooms in the form of Kiai Genjring&#39;s spear, Kiai Gajah Endro&#39;s kris, Kiai Nalapraja&#39;s kris, and\n" +
                    "the Stambul Book will be considered in the Kirab Pusaka Event. Hundreds of carnival support\n" +
                    "personnel consisting of students, students, artists and cultural figures who will be on duty later, held\n" +
                    "a rehearsal at the Deputy Regent&#39;s Hall and Sipanji Regency&#39;s Banyumas Hall. Kirab Pusaka\n" +
                    "Procession has become an annual cultural tourism agenda in Banyumas Regency.",

                    "The chronological sequence begins with Manggala Yudha, followed behind the regional symbol, then\n" +
                            "the spear of Kiai Genjring along with the banners and successive Kiai Gajah Endro kris, Keris Kiai\n" +
                            "Nalapraja, and the Stambul. Behind the music, a troupe is a group of photos of Banyumas regents\n" +
                            "from time to time. In the front row is Duke Mrapat Raden Joko Kaiman, played by Kakang Mbekayu\n" +
                            "Banyumas, while the Pelereman (relocation of relics) will be held by Deputy Regent Sadewo Tri\n" +
                            "Lastiono in the Si Panji Hall.",

                    "- JPPN.com\n" +
                            "- Unsoed.ac.id\n" +
                            "- Derap.id\n" +
                            "- Jatengprov.go.id\n" +
                            "- Radarbanyumas.com\n" +
                            "- Purwokerto.com"},

            {"https://jou333.000webhostapp.com/SEDEKAH/1.jpg","Sedekah Bumi", "The clean tradition of this village is the celebration of the Tambaknegara village&#39;s indigenous people\n" +
                    "before the earth alms ceremony. Not only members of Kasepuhan Adat, but also the entire population.\n" +
                    "They worked together to prepare all kinds of event trinkets. Starting from the tub, cone until the\n" +
                    "equipment to eat together. After completion, residents gathered in one of the houses, to enjoy the\n" +
                    "whole night puppet show.",

                    "The commemoration procession of the arrival of the first month of Java began with the tradition of\n" +
                            "salvation and kidungan in the local pavilion, cleansing the village and wayang ruwatan. Tens of rice\n" +
                            "cones and rice cookers and takir were brought by residents using tenong.\n" +
                            "After praying together, the elders of Kasepuhan started the tradition of planting goat heads along with\n" +
                            "flowers and food ingredients such as rice, vegetables, and side dishes in one corner of the intersection.\n" +
                            "this tradition is an opportunity for people to return as fully human beings. Always remember the\n" +
                            "guidelines for a comfortable and peaceful life.",

                    "- Suarabanyumas.com\n" +
                            "- Gatra.com\n" +
                            "- Kompasiana.com\n" +
                            "- Twitter.com"},

            {"https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/1.jpg","Sedekah Laut", "The title of the sedekah laut tradition of fishing communities on the coast of cilacap has come to the\n" +
                    "attention of various groups, because of the distribution of photo pamphlets in cilacap that read several\n" +
                    "messages containing a warning of disaster as a doom. This tradition originated from the orders of the\n" +
                    "3rd cilacap regent, tumenggung tjakrawerdaya iii who asked the pandanarang fisherman elders, ki arsa\n" +
                    "menawi, to forbid offerings to the southern sea.",

                    "On friday kliwon in the month of shura in 1875, sedekah laut were carried out by including other\n" +
                            "fishermen groups such as sidakaya, donan, sentolokawat, tegalkatilayu, lengkong and kemiren. Only\n" +
                            "in 1983, sedekah laut as a tourist attraction. Sea alms have become a tradition of fishermen groups in\n" +
                            "cilacap which have been carried down for generations. Sedekah laut was not related to certain creeds\n" +
                            "or beliefs. The essence is a manifestation of gratitude to god for the abundance of fortune in coastal\n" +
                            "communities.",

                    "- Serayunews.com\n" +
                            "- Selfyanaayu.blogspot.com\n" +
                            "- Netralnews.com\n" +
                            "- Jateng.tribunnews.com\n" +
                            "- Liputan6.com\n" +
                            "- Kabarnusa.com\n" +
                            "- News.detik.com\n" +
                            "- Simpatic.cilacapkab.go.id\n" +
                            "- Merahputih.com"},
    };

    private static String[][] Cowongan = new String[][]{
            {"","", "https://jou333.000webhostapp.com/cowongan/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/cowongan/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/cowongan/3.jpg", "", "", "", ""},
    };

    private static String[][] Grebeg = new String[][]{
            {"","", "https://jou333.000webhostapp.com/grebeg/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/4.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/5.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/6.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/7.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/8.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/grebeg/9.jpg", "", "", "", ""},
    };

    private static String[][] Kirab = new String[][]{
            {"","", "https://jou333.000webhostapp.com/kirab/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/kirab/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/kirab/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/kirab/4.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/kirab/5.jpg", "", "", "", ""},
    };

    private static String[][] sedekah = new String[][]{
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/3.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/4.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/5.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/6.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/7.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/8.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/9.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/SEDEKAH/10.jpg", "", "", "", ""},
    };
  private static String[][] sedekahl = new String[][]{
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/1.png", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/3.png", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/4.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/5.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/6.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/sedekahl/sedekah%20laut/8.jpeg", "", "", "", ""},
    };




    public static ArrayList<ModelEvent> getDataBtn(){
        ArrayList<ModelEvent> list = new ArrayList<>();
        for (String[] adata : dataEvent){
            ModelEvent modelEvent = new ModelEvent();
            modelEvent.setCover(adata[0]);
            modelEvent.setName(adata[1]);
            modelEvent.setDesc1(adata[2]);
            modelEvent.setDesc2(adata[3]);
            modelEvent.setPhotosby(adata[4]);
            list.add(modelEvent);
        }
        return list;
    }

    private static String[][] datamusic = new String[][]{
            {"https://jou333.000webhostapp.com/bonang/bonang/1.jpg","Bonang", "The second traditional musical instrument in Central Java, Bonang. Bonang is a traditional\n" +
                    "musical instrument that is played by hitting it using a special bat for boning. This instrument is made\n" +
                    "of iron, brass and bronze. Bonang can be divided into two namely bonang barung and successor\n" +
                    "bonang. For bonang barung, the size is getting bigger with the middle to high octaves. For a moment\n" +
                    "the successor bonang has a smaller size and the pace of playing has 2 times more speed than the\n" +
                    "bonang barung.",
                    "",
                    "- Romadecade.org\n" +
                            "- Infopublik.id"},

            {"https://jou333.000webhostapp.com/calung/calung/2.jpg","Calung", "Calung, is a musical instrument made from bamboo pieces that are placed transversely and\n" +
                    "played by being hit. Banyumas music instrument made of wulung bamboo is similar to Javanese\n" +
                    "gamelan, consisting of the barung xylophone, successor xylophone, dhendhem, kenong, gong and\n" +
                    "drum. Besides, there is also a Sebul Gong so named because the sound issued is similar to a gong but\n" +
                    "played by blowing (Javanese: called), this tool is also made of bamboo with large size. In the\n" +
                    "presentation, Calung was accompanied by a vocalist who is commonly called Sinden. Musical\n" +
                    "arrangements are presented in the form of Banyumasan music, Banyumasan style music, Surakarta-\n" +
                    "Yogyakarta and often also re-arranged pop songs.",
                    "",
                    "- coursehero.com\n" +
                            "- inibaru.id\n" +
                            "- budayajawa.id"},

            {"https://jou333.000webhostapp.com/demung/demung/1.jpg","Demung", "Demung is a traditional musical instrument from Central Java which has a shape like saron,\n" +
                    "but with increasingly large size. Generally, in one gamelan performance, it is divided into a minimum\n" +
                    "of 2 sets of demung, namely slendro barrel demung and pelog barrel demung. Inequality in both is in\n" +
                    "the size and sound produced. To play this traditional musical instrument that is with a step hit. The\n" +
                    "instrument is also special so that the sound produced is suitable.",
                    "",
                    "- Nusantaraindonesia.net\n" +
                            "- Nesabamedia.com"},

            {"https://jou333.000webhostapp.com/gong/gong/1.jpeg","Gong", "This Central Javanese traditional musical instrument named gong is made of copper and lead\n" +
                    "which is played by being hit. In the gamelan alley, the main act acts sufficiently to realize the\n" +
                    "combination of musical instruments to accompany the song being played.",
                    "",
                    "- medium.com\n" +
                            "- review.bukalapak.com"},
    };
    private static String[][] bonang = new String[][]{
            {"","", "https://jou333.000webhostapp.com/bonang/bonang/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/bonang/bonang/2.jpg", "", "", "", ""},
    };

    private static String[][] calung = new String[][]{
            {"","", "https://jou333.000webhostapp.com/calung/calung/2.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/calung/calung/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/calung/calung/3.jpg", "", "", "", ""},
    };

    private static String[][] demung = new String[][]{
            {"","", "https://jou333.000webhostapp.com/demung/demung/1.jpg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/demung/demung/2.jpg", "", "", "", ""},
    };

    private static String[][] gong = new String[][]{
            {"","", "https://jou333.000webhostapp.com/gong/gong/1.jpeg", "", "", "", ""},
            {"","", "https://jou333.000webhostapp.com/gong/gong/2.jpg", "", "", "", ""},
    };


    public static ArrayList<ModelDestination> getDataSliderTop(String name){
        ArrayList<ModelDestination> list = new ArrayList<>();
        String[][] datasa = null;
        switch (name){
            case "Cowongan":
                datasa = Cowongan;
                break;
            case "GREBEG SURA Baturraden":
                datasa = Grebeg;
                break;
            case "KIRAB PUSAKA":
                datasa = Kirab;
                break;
            case "Sedekah Bumi":
                datasa = sedekah;
                break;
            case "Sedekah Laut":
                datasa = sedekahl;
                break;
            case "Bonang":
                datasa = bonang;
                break;
            case "Calung":
                datasa = calung;
                break;
            case "Demung":
                datasa = demung;
                break;
            case "Gong":
                datasa = gong;
                break;
        }

        for (String[] adata : datasa){
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

    public static ArrayList<ModelEvent> getDataBtnMusic(){
        ArrayList<ModelEvent> list = new ArrayList<>();
        for (String[] adata : datamusic){
            ModelEvent modelEvent = new ModelEvent();
            modelEvent.setCover(adata[0]);
            modelEvent.setName(adata[1]);
            modelEvent.setDesc1(adata[2]);
            modelEvent.setDesc2(adata[3]);
            modelEvent.setPhotosby(adata[4]);
            list.add(modelEvent);
        }
        return list;
    }
}
