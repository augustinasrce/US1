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

    public void setupLanguageEE() {
        homeScreenNameList.add("Kontakt");
        homeScreenNameList.add("Registreeri Interneti-arutelu");
        homeScreenNameList.add("Kirjuta meile");

        contactUsNameList.add("Kirjuta meile");
        contactUsNameList.add("Teema *");
        contactUsNameList.add("Tekstisõnumeid *");
        contactUsNameList.add("Nimi *");
        contactUsNameList.add("Perekonnanimi *");
        contactUsNameList.add("Telefon *");
        contactUsNameList.add("E-mail *");
        contactUsNameList.add("Kuidas teile meeldib saada vastus*");
        contactUsNameList.add("Vastused küsimustele tööpäeviti 8–20 h., " +
                "laupäeviti 9–16 tööaeg. Kui teil on vaja vahetu teave, " +
                "ootame teie kõnet num. 1884 (eraisikutele) ja 1633 (äriklientidele). " +
                "Välismaalt kõne num. +370 5 268 4444 (eraisikutele) " +
                "ja +370 5 268 4422 (äriklientidele).");
        contactUsNameList.add("Saatma");

        contactUsDropDownMenuList.add("Säästud ja investeeringud");
        contactUsDropDownMenuList.add("Pensionid ja kogunemine");
        contactUsDropDownMenuList.add("Elukindlustus");
        contactUsDropDownMenuList.add("Kahjukindlustus");
        contactUsDropDownMenuList.add("Laenud ja liisimisega");
        contactUsDropDownMenuList.add("Igapäevased finantsjuhtimine");

        contactUsRadioButtonList.add("telefoni");
        contactUsRadioButtonList.add("E-mail");
        contactUsRadioButtonList.add("E-mail ja telefoni");

        contactUsConfirmationNameList.add("Tere, ");
        contactUsConfirmationNameList.add("täname, et võtsite „Swedbank“.");
        contactUsConfirmationNameList.add("Vastused küsimustele tööpäeviti 8–20 h., " +
                "laupäeviti 9–16 tööaeg. Kui teil on vaja vahetu teave, " +
                "ootame teie telefonikõne 1884 või num. +370 5 268 4444, " +
                "kui helistate välismaalt. Soovime hea päev!");
        contactUsConfirmationNameList.add("Tagasi");

        bankDivisionList.add("Antakalnio g. 45");
        bankDivisionList.add("Ateities g. 91 (PC „Mandarinas\")");
        bankDivisionList.add("Gedimino pr. 56");
        bankDivisionList.add("Konstitucijos pr. 20A, töö Būsto Centras");
        bankDivisionList.add("Ozo g. 25 (PPC „Akropolis\")");

        topicList.add("Säästud ja investeeringud");
        topicList.add("Pensionid ja kogunemine");
        topicList.add("Elukindlustus");
        topicList.add("Kahjukindlustus");
        topicList.add("Laenud ja liisimisega");
        topicList.add("Igapäevased finantsjuhtimine");

        registrationNameTags.put("title","Registreerimine");
        registrationNameTags.put("header","Registreeri Interneti-arutelu");
        registrationNameTags.put("name","Nimi *");
        registrationNameTags.put("surname","Perekonnanimi *");
        registrationNameTags.put("phone","Telefon kontaktandmed *");
        registrationNameTags.put("email","E-mail");
        registrationNameTags.put("bankDivision","Bank Division *");
        registrationNameTags.put("date","Kuupäev *");
        registrationNameTags.put("topic","Teema *");
        registrationNameTags.put("other","Kommentaare");
        registrationNameTags.put("confirmButton","Saatma");

        registrationOverviewList.add("Registreerimine Internetis");
    }

    public void setupLanguageEN() {
        homeScreenNameList.add("Contact us");
        homeScreenNameList.add("Online registration for consultation");
        homeScreenNameList.add("Write to us");

        contactUsNameList.add("Write to us");
        contactUsNameList.add("Theme *");
        contactUsNameList.add("Text field *");
        contactUsNameList.add("Name *");
        contactUsNameList.add("Surname *");
        contactUsNameList.add("Telephone number *");
        contactUsNameList.add("E-mail *");
        contactUsNameList.add("How do you like to receive an answer *");
        contactUsNameList.add("We send feed backs into your questions on workdays 8–20 hours., " +
                "saturdays 9–16 hours. If you need immediate information, " +
                "waiting for your calls num. 1884 (private customers) also 1633 (business customer). " +
                "Call us from abroad num. +370 5 268 4444 (private customers) " +
                "also +370 5 268 4422 (business customers).");
        contactUsNameList.add("Send");

        contactUsDropDownMenuList.add("Savings and Investments");
        contactUsDropDownMenuList.add("Pensions and Savings");
        contactUsDropDownMenuList.add("Life insurance");
        contactUsDropDownMenuList.add("Non-life insurance");
        contactUsDropDownMenuList.add("Loans, leasing");
        contactUsDropDownMenuList.add("The daily financial management");

        contactUsRadioButtonList.add("by phone");
        contactUsRadioButtonList.add("by E-mail");
        contactUsRadioButtonList.add("by E-mail and phone");

        contactUsConfirmationNameList.add("Hello, ");
        contactUsConfirmationNameList.add("Thank you for contacting „Swedbank“.");
        contactUsConfirmationNameList.add("We send feed backs into your questions on workdays 8–20 hours., " +
                "saturdays 9–16 hours. If you need immediate information, " +
                "waiting for your calls num. 1884 or num. +370 5 268 4444, " +
                "if you call from abroad. Wish you all the best!");
        contactUsConfirmationNameList.add("< Back");

        bankDivisionList.add("Antakalnio st. 45");
        bankDivisionList.add("Ateities st. 91 (PC „Mandarinas\")");
        bankDivisionList.add("Gedimino ave. 56");
        bankDivisionList.add("Konstitucijos ave. 20A, works in Būsto Centras");
        bankDivisionList.add("Ozo st. 25 (PPC „Akropolis\")");

        topicList.add("Savings and Investments");
        topicList.add("Pensions and Savings");
        topicList.add("Life insurance");
        topicList.add("Non-life insurance");
        topicList.add("Loans, leasing");
        topicList.add("The daily financial management");

        registrationNameTags.put("title","Registration");
        registrationNameTags.put("header","Online registration for consultation");
        registrationNameTags.put("name","Name *");
        registrationNameTags.put("surname","Surname *");
        registrationNameTags.put("phone","Phone *");
        registrationNameTags.put("email","E-mail");
        registrationNameTags.put("bankDivision","Bank division *");
        registrationNameTags.put("date","Date *");
        registrationNameTags.put("topic","Theme *");
        registrationNameTags.put("other","Comments");
        registrationNameTags.put("confirmButton","Send");

        registrationOverviewList.add("Online registrations");
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
