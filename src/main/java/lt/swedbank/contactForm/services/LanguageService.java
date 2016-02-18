package lt.swedbank.contactForm.services;

import lt.swedbank.contactForm.beans.FieldNames;
import lt.swedbank.contactForm.beans.Language;
import lt.swedbank.contactForm.beans.SqlConnection;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by p998ueh on 2016.02.11.
 */
@RestController
public class LanguageService {

    Language language = null;

    String testas = null;
    @PostConstruct
    public void init() {
    }


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

    @RequestMapping(value = "/US1/{dropDownItem}/{textMessage}/{name}/{surname}/{phoneNr}/{email}/{answerType}", method = RequestMethod.PUT)
    public void putContactUs(@PathVariable String dropDownItem,
                             @PathVariable String textMessage,
                             @PathVariable String name,
                             @PathVariable String surname,
                             @PathVariable String phoneNr,
                             @PathVariable String email,
                             @PathVariable String answerType)
    {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();

        sqlConnection.insertClient(10, name, surname, phoneNr, email);
        sqlConnection.insertIContactUs(10, answerType, textMessage, 10, dropDownItem);

        sqlConnection.closeConnection();;
    }

    @RequestMapping("/sql")
    public Map<String, ArrayList<String>> getAllRegistrations() {
        SqlConnection sqlConnection = new SqlConnection();
        sqlConnection.connect();

        ArrayList<String> result; // = new ArrayList<String>();
        result = sqlConnection.selectRegistations("");

        ArrayList<String> databaseValues;
        Map<String, ArrayList<String>> dataFromDatabase = new HashMap<>();
        for (String s : result) {
            String[] split = s.split(";");
            databaseValues = new ArrayList<>();
            databaseValues.add(split[1]);
            databaseValues.add(split[2]);
            databaseValues.add(split[3]);
            databaseValues.add(split[4]);
            databaseValues.add(split[5]);

            dataFromDatabase.put(split[0], databaseValues);

        }

        sqlConnection.closeConnection();
        return dataFromDatabase;
    }
    /*
    @RequestMapping("/lt/contact")
    public FieldNames getLanguageForContactUsScreenLT() {
        language = new Language();
        return language.getFieldNamesForContactUsScreenLT();
    }

/*
    @RequestMapping("lt/index.html")
    public Language getLTLanguage() {
        return language;
    }


        @RequestMapping("/peanuts/sorted")
        public PeanutList sortedList() {
            Collections.sort(peanutList.getPeanuts());
            return peanutList;
        }

        @RequestMapping("/two")
        public List<Peanut> two() {
            List<Peanut> list = new ArrayList<Peanut>();
            list.add(peanutList.getPeanuts().get(0));
            list.add(peanutList.getPeanuts().get(1));
            return list;
        }

        @RequestMapping("/peanuts/withO")
        public List<Peanut> peanutsWithO() {
            List<Peanut> list = new ArrayList<Peanut>();
            for(Peanut peanut : peanutList.getPeanuts())
            {
                if(peanut.getName().contains("o"))
                    list.add(peanut);
            }

            return list;
        }


        @RequestMapping("/peanuts/dividableby3")
        public PeanutList dividableBy3List() {

            PeanutList dividableBy3List = new PeanutList();
            for (Peanut peanut : peanutList.getPeanuts()) {
                if (peanut.getId() % 3 == 0)
                    dividableBy3List.addPeanut(peanut,peanut.getId());
            }
            return dividableBy3List;
        }


        @RequestMapping(value = "/peanuts", method = RequestMethod.PUT)
        public void create(String name) {
            peanutList.addPeanut(new Peanut(name));
        }


        @RequestMapping(value = "/peanuts/{id}", method = RequestMethod.GET)
        public Peanut getPeanut(@PathVariable Long id) {
            for (Peanut peanut : peanutList.getPeanuts()) {
                if (peanut.getId() == id.intValue())
                    return peanut;
            }
            return null;
        }


        @RequestMapping(value = "/peanuts/{id}", method = RequestMethod.DELETE)
        public void removePeanut(@PathVariable Long id) {

        }
*/


}
