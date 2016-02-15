package lt.swedbank.contactForm.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldNames {
    ArrayList<String> homeScreenNameList;
    ArrayList<String> contactUsNameList;
    ArrayList<String> contactUsDropDownMenuList;
    ArrayList<String> contactUsRadioButtonList;
    ArrayList<String> contactUsConfirmationNameList;
    ArrayList<String> bankDivisions;
    ArrayList<String> topics;
    Map<String, String> registrationNameTags;

    public FieldNames() {
        homeScreenNameList = new ArrayList<String>();
        contactUsNameList = new ArrayList<String>();
        contactUsDropDownMenuList = new ArrayList<String>();
        contactUsRadioButtonList = new ArrayList<String>();
        contactUsConfirmationNameList = new ArrayList<String>();
        bankDivisions = new ArrayList<String>();
        topics = new ArrayList<String>();
        registrationNameTags = new HashMap<String, String>();

    }

    public void setupLanguageLT() {
        homeScreenNameList.add("Susisiekite su mumis");
        homeScreenNameList.add("Registruokitės konsultacijai internetu");
        homeScreenNameList.add("Parašykite mums");

        contactUsNameList.add("Parašykite mums");
        contactUsNameList.add("Tema");
        contactUsNameList.add("Žinutės tekstas");
        contactUsNameList.add("Vardas");
        contactUsNameList.add("Pavardė");
        contactUsNameList.add("Telefonas");
        contactUsNameList.add("El. Paštas");
        contactUsNameList.add("Kaip pageidaujate gauti atsakymą");
        contactUsNameList.add("Į pateiktus klausimus atsakome darbo dienomis 8–20 val., " +
                "šeštadieniais 9–16 valandomis. Jeigu Jums reikalinga skubi informacija, " +
                "laukiame jūsų skambučių tel. 1884 (privatiems klientams) bei 1633 (verslo klientams). " +
                "Iš užsienio skambinkite tel. +370 5 268 4444 (privatiems klientams) " +
                "bei +370 5 268 4422 (verslo klientams).");
        contactUsNameList.add("Siųsti");

        contactUsDropDownMenuList.add("Pasirinkite");
        contactUsDropDownMenuList.add("Taupymas ir investavimas");
        contactUsDropDownMenuList.add("Pensijos ir kaupimas");
        contactUsDropDownMenuList.add("Gyvybės draudimas");
        contactUsDropDownMenuList.add("Ne gyvybės draudimas");
        contactUsDropDownMenuList.add("Paskolos, lizingas");
        contactUsDropDownMenuList.add("Kasdienių finansų valdymas");

        contactUsRadioButtonList.add("telefonu");
        contactUsRadioButtonList.add("el. paštu");
        contactUsRadioButtonList.add("el. paštu ir telefonu");

        contactUsConfirmationNameList.add("Sveiki, ");
        contactUsConfirmationNameList.add("dėkojame, kad kreipiatės į „Swedbank“.");
        contactUsConfirmationNameList.add("Į pateiktus klausimus atsakome darbo dienomis 8–20 val., " +
                "šeštadieniais 9–16 valandomis. Jeigu Jums reikalinga skubi informacija, " +
                "laukiame Jūsų skambučių telefonu 1884 arba tel. +370 5 268 4444, " +
                "jei skambinate iš užsienio. Linkime geros dienos!");
        contactUsConfirmationNameList.add("< Atgal");

        bankDivisions.add("Antakalnio g. 45");
        bankDivisions.add("Ateities g. 91 (PC „Mandarinas\")");
        bankDivisions.add("Gedimino pr. 56");
        bankDivisions.add("Konstitucijos pr. 20A, dirba Būsto Centras");
        bankDivisions.add("Ozo g. 25 (PPC „Akropolis\")");

        topics.add("Taupymas ir investavimas");
        topics.add("Pensijos ir kaupimas");
        topics.add("Gyvybės draudimas");
        topics.add("Ne gyvybės draudimas");
        topics.add("Paskolos, lizingas");
        topics.add("Kasdienių finansų valdymas");

        registrationNameTags.put("title","Registracija");
        registrationNameTags.put("header","Registruokitės konsultacijai internetu");
        registrationNameTags.put("name","Vardas *");
        registrationNameTags.put("surname","Pavardė *");
        registrationNameTags.put("phone","Telefonas susisiekti *");
        registrationNameTags.put("email","El.Paštas");
        registrationNameTags.put("bankDivision","Banko skyrius *");
        registrationNameTags.put("date","Data *");
        registrationNameTags.put("topic","Tema *");
        registrationNameTags.put("other","Pastabos, komentarai");
        registrationNameTags.put("confirmButton","Siųsti");
    }


    public ArrayList<String> getHomeScreenNameList() {
        return homeScreenNameList;
    }

    public ArrayList<String> getContactUsNameList() {
        return contactUsNameList;
    }

    public ArrayList<String> getContactUsDropDownMenuList() {
        return contactUsDropDownMenuList;
    }

    public ArrayList<String> getContactUsRadioButtonList() {
        return contactUsRadioButtonList;
    }

    public ArrayList<String> getContactUsConfirmationNameList() {
        return contactUsConfirmationNameList;
    }

    public ArrayList<String> getTopicList(){return topics;}

    public ArrayList<String> getBankDivisionList(){return bankDivisions;}

    public Map<String,String> getRegistrationNameTags(){return registrationNameTags;}

}
