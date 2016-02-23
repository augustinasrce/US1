package lt.swedbank.contactForm.services;

import lt.swedbank.contactForm.beans.FieldNames;
import lt.swedbank.contactForm.beans.Language;
import lt.swedbank.contactForm.beans.SqlConnection;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by p998ueh on 2016.02.11.
 */
@RestController
public class Service {

    Language language = null;

    @RequestMapping("/lt")
    public FieldNames getLanguageLT() {
        language = new Language();
        return language.getFieldNamesLT();
    }
    @RequestMapping("/en")
    public FieldNames getLanguageEN() {
        language = new Language();
        return language.getFieldNamesEN();
    }
    @RequestMapping("/ru")
    public FieldNames getLanguageRU() {
        language = new Language();
        return language.getFieldNamesRU();
    }
    @RequestMapping("/ee")
    public FieldNames getLanguageEE() {
        language = new Language();
        return language.getFieldNamesEE();
    }
    @RequestMapping("/lv")
    public FieldNames getLanguageLV() {
        language = new Language();
        return language.getFieldNamesLV();
    }

    @RequestMapping(value = "/US1/{dropDownItem}/{textMessage}/{name}/{surname}/{phoneNr}/{email}/{answerType}/", method = RequestMethod.PUT)
    public void putContactUs(@PathVariable String dropDownItem,
                             @PathVariable String textMessage,
                             @PathVariable String name,
                             @PathVariable String surname,
                             @PathVariable String phoneNr,
                             @PathVariable String email,
                             @PathVariable String answerType) {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();
        sqlConnection.insertContactUsBigTable(dropDownItem, textMessage, answerType, name, surname, phoneNr, email);
        sqlConnection.closeConnection();
    }

    @RequestMapping(value = "/US1/{dropDownItem}/{textMessage}/{name}/{phoneNr}/{email}/{answerType}/", method = RequestMethod.PUT)
    public void putContactUs(@PathVariable String dropDownItem,
                             @PathVariable String textMessage,
                             @PathVariable String name,
                             @PathVariable String phoneNr,
                             @PathVariable String email,
                             @PathVariable String answerType) {
        putContactUs(   dropDownItem,
                        textMessage,
                        name,
                        "",
                        phoneNr,
                        email,
                        answerType);
        //
    }

    @RequestMapping(value = "/registration/{name}/{surname}/{phoneNr}/{email}/{bankDivision}/{date}/{topic}/{others}/", method = RequestMethod.PUT)
    public void putRegistrations(@PathVariable String name,
                             @PathVariable String surname,
                             @PathVariable String phoneNr,
                             @PathVariable String email,
                             @PathVariable String bankDivision,
                             @PathVariable String date,
                             @PathVariable String topic,
                             @PathVariable String others) {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();
        sqlConnection.insertRegistrationBigTable(name, surname, phoneNr, email, bankDivision, date, topic,others);
        sqlConnection.closeConnection();
    }



    @RequestMapping("/sql")
    public Map<String, ArrayList<String>> getAllRegistrations() {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();

        ArrayList<String> result; // = new ArrayList<String>();
        result = sqlConnection.selectRegistrationBigTable("");

        ArrayList<String> databaseValues;
        Map<String, ArrayList<String>> dataFromDatabase = new HashMap<String, ArrayList<String>>();
        for (String s : result) {
            String[] split = s.split(";");
            databaseValues = new ArrayList<String>();
            databaseValues.add(split[1]);
            databaseValues.add(split[2]);
            databaseValues.add(split[3]);
            databaseValues.add(split[4]);
            databaseValues.add(split[5]);
            databaseValues.add(split[6]);
            databaseValues.add(split[7]);
            databaseValues.add(split[8]);
            databaseValues.add(split[0]);

            dataFromDatabase.put(split[0], databaseValues);

        }

        sqlConnection.closeConnection();
        return dataFromDatabase;
    }

    @RequestMapping("/times")
    public  ArrayList<String> getTimes(){
        ArrayList<String> times = new ArrayList<String>();
        for(Integer i=8; i<20 ; i++) {
            times.add(i.toString() + ":00");
            times.add(i.toString() + ":30");
        }
        return times;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void removeRegistration(@PathVariable int id) {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();
        sqlConnection.delete("Registrations",id);
        sqlConnection.closeConnection();
    }

    @RequestMapping(value = "/preview/{id}", method = RequestMethod.GET)
    public ArrayList<String> previewRegistration(@PathVariable int id) {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();
        ArrayList<String> rez = sqlConnection.selectRegistrationById(id);
        sqlConnection.closeConnection();
        return rez;
    }
}
