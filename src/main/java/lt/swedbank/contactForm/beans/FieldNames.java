package lt.swedbank.contactForm.beans;

import java.util.ArrayList;

public class FieldNames {
    ArrayList<String> homeScreenNameList;
    ArrayList<String> contactUsNameList;
    ArrayList<String> contactUsDropDownMenuList;
    ArrayList<String> contactUsRadioButtonList;

    public FieldNames() {
        homeScreenNameList = new ArrayList<String>();
        contactUsNameList = new ArrayList<String>();
        contactUsDropDownMenuList = new ArrayList<String>();
        contactUsRadioButtonList = new ArrayList<String>();
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

}
