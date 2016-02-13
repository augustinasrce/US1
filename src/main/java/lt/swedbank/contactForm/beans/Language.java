package lt.swedbank.contactForm.beans;

/**
 * Created by Augustinas on 11 02 2016!
 */
public class Language {

    FieldNames fieldNames;

    public Language(){
        fieldNames = new FieldNames();
    }

    public FieldNames getFieldNamesLT(){
        fieldNames.setupLanguageLT();
        return fieldNames;
    }




    public FieldNames getFieldNamesEN(){
    //   fieldNames.setupLanguageEN();
        return fieldNames;
    }
    public FieldNames getFieldNamesRU(){
    //    fieldNames.setupLanguageRU();
        return fieldNames;
    }
}
