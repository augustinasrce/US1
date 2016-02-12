package lt.swedbank.contactForm.beans;

import java.util.ArrayList;

/**
 * Created by Augustinas on 12 02 2016!
 */
public class FieldNames {
    ArrayList<String> homeScreenNameList;
    ArrayList<String> contactUsNameList;

    public FieldNames() {
        homeScreenNameList = new ArrayList<String>();
        contactUsNameList = new ArrayList<String>();
    }

    public void setupLanguageLT(){
        homeScreenNameList.add("Susisiekite su mumis");
        homeScreenNameList.add("Registruokitės konsultacijai internetu");
        homeScreenNameList.add("Parašykite mums");


    }

    public ArrayList<String> getHomeScreenNameList() {
        return homeScreenNameList;
    }
}
