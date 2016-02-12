package com.swedbankTeamC.beans;

import java.util.ArrayList;

/**
 * Created by Augustinas on 11 02 2016!
 */
public class Language {

    ArrayList<String> fieldName;

    public Language(){
        fieldName = new ArrayList<String>();
        fieldName.add("Labas");
        fieldName.add("Petrai");
    }

    public void getFieldNamesFromDB(){
// implement db field name list
    }

    public ArrayList<String> getFieldNameList() {
        return fieldName;
    }
}
