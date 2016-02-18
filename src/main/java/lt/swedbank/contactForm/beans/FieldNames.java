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

    public void setupLanguageLV() {

        homeScreenNameList.add("Sazinies ar mums");
        homeScreenNameList.add("Reģistrēties tiešsaistes konsultācijas");
        homeScreenNameList.add("Rakstiet mums");

        contactUsNameList.add("Rakstiet mums");
        contactUsNameList.add("Tēma *");
        contactUsNameList.add("Dokuments ziņojuma *");
        contactUsNameList.add("Vārds *");
        contactUsNameList.add("Uzvārds *");
        contactUsNameList.add("Tālrunis *");
        contactUsNameList.add("El-pasts *");
        contactUsNameList.add("Kā jūs vēlaties saņemt atbildi *");
        contactUsNameList.add("Atbildes uz uzdotajiem darbdienās 8-20 am jautājumiem., " +
                "Sestdienās 9-16 stundas. Ja jums nepieciešama tūlītēja informācija, " +
                "Mēs gaidām jūsu telefona zvanu. 1884 (privātajiem klientiem) un 1633 (biznesa klientiem). " +
                "Ārvalstu zvans tel. +370 5 268 4444 (privātajiem klientiem) " +
                "Un +370 5 268 4422 (biznesa klientiem).");
        contactUsNameList.add("Sūtīt");

        contactUsDropDownMenuList.add("Uzkrājumi un investīcijas");
        contactUsDropDownMenuList.add("Pensijas un uzkrāšanu");
        contactUsDropDownMenuList.add("Dzīvības apdrošināšana");
        contactUsDropDownMenuList.add("Nedzīvības apdrošināšana");
        contactUsDropDownMenuList.add("Kredīti, līzings");
        contactUsDropDownMenuList.add("Dienas finanšu vadība");

        contactUsRadioButtonList.add("pa tālruni");
        contactUsRadioButtonList.add("pa e-pastu");
        contactUsRadioButtonList.add("pa e-pastu un tālruni");


        contactUsConfirmationNameList.add("Sveiki, ");
        contactUsConfirmationNameList.add("Paldies, kas attiecas uz Swedbank“.");
        contactUsConfirmationNameList.add("Atbildes uz uzdotajiem darbdienās 8-20 am jautājumiem., " +
                "Sestdienās 9-16 stundas. Ja jums nepieciešama tūlītēja informācija, " +
                "Mēs gaidām jūsu telefona zvanu 1884 vai tel. +370 5 268 4444, " +
                "Ja jūs zvanāt no ārzemēm Novēlam laba diena!");
        contactUsConfirmationNameList.add("<atpakaļ");

        bankDivisionList.add("Antakalnio iela 45");
        bankDivisionList.add("Ateities iela 91 (T/C „Mandarinas\")");
        bankDivisionList.add("Gedimino iela 56");
        bankDivisionList.add("Konstitucijos iela 20A, strādā Būsto Centras");
        bankDivisionList.add("Ozo iela 25 (T/C „Akropolis\")");

        topicList.add("Uzkrājumi un investīcijas");
        topicList.add("Pensijas un uzkrāšanu");
        topicList.add("Dzīvības apdrošināšana");
        topicList.add("Nedzīvības apdrošināšana");
        topicList.add("Kredīti, līzings");
        topicList.add("Dienas finanšu vadība");

        registrationNameTags.put("title","Reģistrācija");
        registrationNameTags.put("header","Reģistrēties apspriešanu tiešsaistē");
        registrationNameTags.put("name","Vārds *");
        registrationNameTags.put("surname","Uzvārds *");
        registrationNameTags.put("phone","Tālrunis *");
        registrationNameTags.put("email","El-pasts");
        registrationNameTags.put("bankDivision", "Bankas nodaļa *");
        registrationNameTags.put("date","Datums *");
        registrationNameTags.put("topic","Tēma *");
        registrationNameTags.put("other","Piezīmes, komentāri");
        registrationNameTags.put("confirmButton","Sūtīt");




        registrationOverviewList.add("Reģistrācijas online");
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
