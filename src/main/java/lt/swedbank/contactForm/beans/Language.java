package lt.swedbank.contactForm.beans;

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
        fieldNames.setupLanguageEN();
        return fieldNames;
    }

    public FieldNames getFieldNamesRU(){
        fieldNames.setupLanguageRU();
        return fieldNames;
    }

    public FieldNames getFieldNamesEE(){
        fieldNames.setupLanguageEE();
        return fieldNames;
    }

    public FieldNames getFieldNamesLV(){
        fieldNames.setupLanguageLV();
        return fieldNames;
    }
}
