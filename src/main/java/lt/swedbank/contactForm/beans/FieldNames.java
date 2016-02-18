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
    ArrayList<String> bankDivisionList;
    ArrayList<String> topicList;
    ArrayList<String> registrationOverviewList;
    Map<String, String> registrationNameTags;

    public FieldNames() {
        homeScreenNameList = new ArrayList<String>();
        contactUsNameList = new ArrayList<String>();
        contactUsDropDownMenuList = new ArrayList<String>();
        contactUsRadioButtonList = new ArrayList<String>();
        contactUsConfirmationNameList = new ArrayList<String>();
        bankDivisionList = new ArrayList<String>();
        topicList = new ArrayList<String>();
        registrationNameTags = new HashMap<String, String>();
        registrationOverviewList = new ArrayList<String>();

    }

    public void setupLanguageLT() {
        homeScreenNameList.add("Susisiekite su mumis");
        homeScreenNameList.add("Registruokitės konsultacijai internetu");
        homeScreenNameList.add("Parašykite mums");

        contactUsNameList.add("Parašykite mums");
        contactUsNameList.add("Tema *");
        contactUsNameList.add("Žinutės tekstas *");
        contactUsNameList.add("Vardas *");
        contactUsNameList.add("Pavardė *");
        contactUsNameList.add("Telefonas *");
        contactUsNameList.add("El. Paštas *");
        contactUsNameList.add("Kaip pageidaujate gauti atsakymą *");
        contactUsNameList.add("Į pateiktus klausimus atsakome darbo dienomis 8–20 val., " +
                "šeštadieniais 9–16 valandomis. Jeigu Jums reikalinga skubi informacija, " +
                "laukiame jūsų skambučių tel. 1884 (privatiems klientams) bei 1633 (verslo klientams). " +
                "Iš užsienio skambinkite tel. +370 5 268 4444 (privatiems klientams) " +
                "bei +370 5 268 4422 (verslo klientams).");
        contactUsNameList.add("Siųsti");

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

        bankDivisionList.add("Antakalnio g. 45");
        bankDivisionList.add("Ateities g. 91 (PC „Mandarinas\")");
        bankDivisionList.add("Gedimino pr. 56");
        bankDivisionList.add("Konstitucijos pr. 20A, dirba Būsto Centras");
        bankDivisionList.add("Ozo g. 25 (PPC „Akropolis\")");

        topicList.add("Taupymas ir investavimas");
        topicList.add("Pensijos ir kaupimas");
        topicList.add("Gyvybės draudimas");
        topicList.add("Ne gyvybės draudimas");
        topicList.add("Paskolos, lizingas");
        topicList.add("Kasdienių finansų valdymas");

        registrationNameTags.put("title","Registracija");
        registrationNameTags.put("header","Registruokitės konsultacijai internetu");
        registrationNameTags.put("name","Vardas *");
        registrationNameTags.put("surname","Pavardė *");
        registrationNameTags.put("phone","Telefonas susisiekti *");
        registrationNameTags.put("email","El. Paštas");
        registrationNameTags.put("bankDivision","Banko skyrius *");
        registrationNameTags.put("date","Data *");
        registrationNameTags.put("topic","Tema *");
        registrationNameTags.put("other","Pastabos, komentarai");
        registrationNameTags.put("confirmButton","Siųsti");

        registrationOverviewList.add("Registracijos internetu");
    }

    public void setupLanguageEN(){
        homeScreenNameList.add("shit we just got international interface :)");
        homeScreenNameList.add("damn !!");
        homeScreenNameList.add("WeeeeHoooo");

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

    public ArrayList<String> getTopicList(){return topicList;}

    public ArrayList<String> getBankDivisionList(){return bankDivisionList;}

    public Map<String,String> getRegistrationNameTags(){return registrationNameTags;}

    public ArrayList<String> getRegistrationOverviewList(){return registrationOverviewList;}

}
