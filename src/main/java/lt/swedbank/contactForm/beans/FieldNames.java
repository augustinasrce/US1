package lt.swedbank.contactForm.beans;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldNames {
    
    Map<String, String> homeScreenNameMap;
    Map<String, String> contactUsNameMap;
    Map<String, String> contactUsRadioButtonMap;
    Map<String, String> errorMessagesMap;
    Map<String, String> registrationNameTags;
    Map<String, String> buttonsMap;

    List<String> registrationConfirmationNameList;
    List<String> registrationOverviewList;
    List<String> contactUsConfirmationNameList;
    List<String> bankDivisions;
    List<String> topics;


    public FieldNames() {
        homeScreenNameMap = new HashMap<String, String>();
        contactUsNameMap = new HashMap<String, String>();
        contactUsRadioButtonMap = new HashMap<String, String>();
        contactUsConfirmationNameList = new ArrayList<String>();
        bankDivisions = new ArrayList<String>();
        topics = new ArrayList<String>();
        buttonsMap = new HashMap<String, String>();
        registrationNameTags = new HashMap<String, String>();
        registrationOverviewList = new ArrayList<String>();
        registrationConfirmationNameList = new ArrayList<String>();
        errorMessagesMap = new HashMap<String, String>();
    }

    public void setupHomeScreenNameMapLT() {
        homeScreenNameMap.put("header", "Susisiekite su mumis");
        homeScreenNameMap.put("registrationLink", "Registruokitės konsultacijai internetu");//
        homeScreenNameMap.put("contactUsLink", "Parašykite mums");
    }
    public void setupHomeScreenNameMapRU() {
        homeScreenNameMap.put("header", "Свяжитесь с нами");
        homeScreenNameMap.put("registrationLink", "Регистрация по интернету");
        homeScreenNameMap.put("contactUsLink", "Напишите нам");
    }
    public void setupHomeScreenNameMapEE() {
        homeScreenNameMap.put("header", "Kontakt");
        homeScreenNameMap.put("registrationLink", "Registreeri Interneti-arutelu");
        homeScreenNameMap.put("contactUsLink", "Kirjuta meile");
    }
    public void setupHomeScreenNameMapEN() {
        homeScreenNameMap.put("header", "Contact us");
        homeScreenNameMap.put("registrationLink", "Online registration for consultation");
        homeScreenNameMap.put("contactUsLink", "Contact us");
    }
    public void setupHomeScreenNameMapLV() {
        homeScreenNameMap.put("header", "Sazinies ar mums");
        homeScreenNameMap.put("registrationLink", "Reģistrēties tiešsaistes konsultācijas");
        homeScreenNameMap.put("contactUsLink", "Rakstiet mums");
    }
    
    public void setupContactUsNameMapLT() {
        contactUsNameMap.put("header", "Parašykite mums");
        contactUsNameMap.put("topic", "Tema *");
        contactUsNameMap.put("message", "Žinutės tekstas *");
        contactUsNameMap.put("name", "Vardas *");
        contactUsNameMap.put("surname", "Pavardė ");
        contactUsNameMap.put("phone", "Telefonas *");
        contactUsNameMap.put("email", "El. Paštas *");
        contactUsNameMap.put("responseType", "Kaip pageidaujate gauti atsakymą *");
        contactUsNameMap.put("info", "Į pateiktus klausimus atsakome darbo dienomis 8–20 val., " +
                "šeštadieniais 9–16 valandomis. Jeigu Jums reikalinga skubi informacija, " +
                "laukiame jūsų skambučių tel. 1884 (privatiems klientams) bei 1633 (verslo klientams). " +
                "Iš užsienio skambinkite tel. +370 5 268 4444 (privatiems klientams) " +
                "bei +370 5 268 4422 (verslo klientams).");
    }
    public void setupContactUsNameMapRU() {
        contactUsNameMap.put("header", "Напишите нам");
        contactUsNameMap.put("topic", "Тема *");
        contactUsNameMap.put("message", "Текст сообщения *");
        contactUsNameMap.put("name", "Имя *");
        contactUsNameMap.put("surname", "Фамилия");
        contactUsNameMap.put("phone", "Телефон *");
        contactUsNameMap.put("email", "Адрес электронной почты *");
        contactUsNameMap.put("responseType", "Каким образом предпочитаете получить ответ *");
        contactUsNameMap.put("info", "На заданые вопроса отвечаем по рабочим дням с 8 до 20 ч., " +
                "по субботам с 9 до 16 часов. Если информация Вам нужна срочно, " +
                "ждем ваших звонков по тел. 1884(для частных клиентов), 1663(для бизнес клиентов). " +
                "Из заграницы звоните по тел. +370 5 268 4444(для частных клиентов), " +
                " +370 5 268 4422 (для бизнес клиентов).");

    }
    public void setupContactUsNameMapEE() {
        contactUsNameMap.put("header", "Kirjuta meile");
        contactUsNameMap.put("topic", "Teema *");
        contactUsNameMap.put("message", "Tekstisõnumeid *");
        contactUsNameMap.put("name", "Nimi *");
        contactUsNameMap.put("surname", "Perekonnanimi");
        contactUsNameMap.put("phone", "Telefon *");
        contactUsNameMap.put("email", "E-mail *");
        contactUsNameMap.put("responseType", "Kuidas teile meeldib saada vastus*");
        contactUsNameMap.put("info", "Vastused küsimustele tööpäeviti 8–20 h., " +
                "laupäeviti 9–16 tööaeg. Kui teil on vaja vahetu teave, " +
                "ootame teie kõnet num. 1884 (eraisikutele) ja 1633 (äriklientidele). " +
                "Välismaalt kõne num. +370 5 268 4444 (eraisikutele) " +
                "ja +370 5 268 4422 (äriklientidele).");
    }
    public void setupContactUsNameMapEN() {

        contactUsNameMap.put("header", "Contact us");
        contactUsNameMap.put("topic", "Topic *");
        contactUsNameMap.put("message", "Text field *");
        contactUsNameMap.put("name", "Name *");
        contactUsNameMap.put("surname", "Surname");
        contactUsNameMap.put("phone", "Telephone number *");
        contactUsNameMap.put("email", "E-mail *");
        contactUsNameMap.put("responseType", "How would you like to receive an answer *");
        contactUsNameMap.put("info", "We answer your questions on workdays 8–20 hours., " +
                "saturdays 9–16 hours. If you need immediate information, " +
                "you can call us 1884 (private customers) also 1633 (business customer). " +
                "Call us from abroad +370 5 268 4444 (private customers) " +
                "also +370 5 268 4422 (business customers).");
    }
    public void setupContactUsNameMapLV() {
        contactUsNameMap.put("header", "Rakstiet mums");
        contactUsNameMap.put("topic", "Tēma *");
        contactUsNameMap.put("message", "Dokuments ziņojuma *");
        contactUsNameMap.put("name", "Vārds *");
        contactUsNameMap.put("surname", "Uzvārds");
        contactUsNameMap.put("phone", "Tālrunis *");
        contactUsNameMap.put("email", "El-pasts *");
        contactUsNameMap.put("responseType", "Kā jūs vēlaties saņemt atbildi *");
        contactUsNameMap.put("info", "Atbildes uz uzdotajiem darbdienās 8-20 am jautājumiem., " +
                "Sestdienās 9-16 stundas. Ja jums nepieciešama tūlītēja informācija, " +
                "Mēs gaidām jūsu telefona zvanu. 1884 (privātajiem klientiem) un 1633 (biznesa klientiem). " +
                "Ārvalstu zvans tel. +370 5 268 4444 (privātajiem klientiem) " +
                "Un +370 5 268 4422 (biznesa klientiem).");
    }

    public void setupContactUsRadioButtonMapLT() {
        contactUsRadioButtonMap.put("phone", "telefonu");
        contactUsRadioButtonMap.put("email", "el. paštu");
        contactUsRadioButtonMap.put("phoneAndEmail", "el. paštu ir telefonu");
    }
    public void setupContactUsRadioButtonMapRU() {
        contactUsRadioButtonMap.put("phone", "по телефону");
        contactUsRadioButtonMap.put("email", "по электронной почте");
        contactUsRadioButtonMap.put("phoneAndEmail", "по электронной почте и по телефону");
    }
    public void setupContactUsRadioButtonMapEE() {
        contactUsRadioButtonMap.put("phone", "telefoni");
        contactUsRadioButtonMap.put("email", "E-mail");
        contactUsRadioButtonMap.put("phoneAndEmail", "E-mail ja telefoni");
    }
    public void setupContactUsRadioButtonMapEN() {
        contactUsRadioButtonMap.put("phone","by phone");
        contactUsRadioButtonMap.put("email","by E-mail");
        contactUsRadioButtonMap.put("phoneAndEmail","by E-mail and phone");
    }
    public void setupContactUsRadioButtonMapLV() {
        contactUsRadioButtonMap.put("phone","pa tālruni");
        contactUsRadioButtonMap.put("email","pa e-pastu");
        contactUsRadioButtonMap.put("phoneAndEmail","pa e-pastu un tālruni");
    }
    
    public void setupBankDivisionsLT(){
        bankDivisions.add("Antakalnio g. 45");
        bankDivisions.add("Ateities g. 91 (PC „Mandarinas\")");
        bankDivisions.add("Gedimino pr. 56");
        bankDivisions.add("Konstitucijos pr. 20A, dirba Būsto Centras");
        bankDivisions.add("Ozo g. 25 (PPC „Akropolis\")");
    }
    public void setupBankDivisionsRU(){
        bankDivisions.add("Antakalnio ул. 45");
        bankDivisions.add("Ateities ул. 91 (PC „Mandarinas\")");
        bankDivisions.add("Gedimino пр. 56");
        bankDivisions.add("Konstitucijos пр. 20A, работает Жилищный Центр");
        bankDivisions.add("Ozo ул. 25 (PPC „Akropolis\")");
    }
    public void setupBankDivisionsEE(){
        bankDivisions.add("Antakalnio g. 45");
        bankDivisions.add("Ateities g. 91 (PC „Mandarinas\")");
        bankDivisions.add("Gedimino pr. 56");
        bankDivisions.add("Konstitucijos pr. 20A, töö Būsto Centras");
        bankDivisions.add("Ozo g. 25 (PPC „Akropolis\")");
    }
    public void setupBankDivisionsEN(){
        bankDivisions.add("Antakalnio st. 45");
        bankDivisions.add("Ateities st. 91 (PC „Mandarinas\")");
        bankDivisions.add("Gedimino ave. 56");
        bankDivisions.add("Konstitucijos ave. 20A, works in Būsto Centras");
        bankDivisions.add("Ozo st. 25 (PPC „Akropolis\")");
    }
    public void setupBankDivisionsLV(){
        bankDivisions.add("Antakalnio iela 45");
        bankDivisions.add("Ateities iela 91 (T/C „Mandarinas\")");
        bankDivisions.add("Gedimino iela 56");
        bankDivisions.add("Konstitucijos iela 20A, strādā Būsto Centras");
        bankDivisions.add("Ozo iela 25 (T/C „Akropolis\")");
    }
    
    public void setupTopicsLT(){
        topics.add("Taupymas ir investavimas");
        topics.add("Pensijos ir kaupimas");
        topics.add("Gyvybės draudimas");
        topics.add("Ne gyvybės draudimas");
        topics.add("Paskolos, lizingas");
        topics.add("Kasdienių finansų valdymas");
    }
    public void setupTopicsRU(){
        topics.add("Экономия и инвестиции");
        topics.add("Пенсии и сбережения");
        topics.add("Страхование жизни");
        topics.add("Страхование не связаное со здоровьем или жизнью");
        topics.add("Кредиты, лизинг");
        topics.add("Управление каждодневными финансами");
    }
    public void setupTopicsEE(){
        topics.add("Säästud ja investeeringud");
        topics.add("Pensionid ja kogunemine");
        topics.add("Elukindlustus");
        topics.add("Kahjukindlustus");
        topics.add("Laenud ja liisimisega");
        topics.add("Igapäevased finantsjuhtimine");
    }
    public void setupTopicsEN(){
        topics.add("Savings and Investments");
        topics.add("Pensions and Savings");
        topics.add("Life insurance");
        topics.add("Non-life insurance");
        topics.add("Loans, leasing");
        topics.add("The daily financial management");
    }
    public void setupTopicsLV(){
        topics.add("Uzkrājumi un investīcijas");
        topics.add("Pensijas un uzkrāšanu");
        topics.add("Dzīvības apdrošināšana");
        topics.add("Nedzīvības apdrošināšana");
        topics.add("Kredīti, līzings");
        topics.add("Dienas finanšu vadība");
    }
    
    public void setupRegistrationNameTagsLT(){
        registrationNameTags.put("title", "Registracija");
        registrationNameTags.put("header", "Registruokitės konsultacijai internetu");
        registrationNameTags.put("name", "Vardas *");
        registrationNameTags.put("surname", "Pavardė *");
        registrationNameTags.put("phone", "Telefonas susisiekti *");
        registrationNameTags.put("email", "El. Paštas");
        registrationNameTags.put("bankDivision", "Banko skyrius *");
        registrationNameTags.put("date", "Data *");
        registrationNameTags.put("topic", "Tema *");
        registrationNameTags.put("other", "Pastabos, komentarai");
    }
    public void setupRegistrationNameTagsRU(){
        registrationNameTags.put("title", "Регистрация");
        registrationNameTags.put("header", "Регистрация по интернету");
        registrationNameTags.put("name", "Имя *");
        registrationNameTags.put("surname", "Фамилия *");
        registrationNameTags.put("phone", "Телефон *");
        registrationNameTags.put("email", "Адрес электронной почты");
        registrationNameTags.put("bankDivision", "Отдел банка *");
        registrationNameTags.put("date", "Дата *");
        registrationNameTags.put("topic", "Тема *");
        registrationNameTags.put("other", "Замечания и коментарии");
    }
    public void setupRegistrationNameTagsEE(){
        registrationNameTags.put("title", "Registreerimine");
        registrationNameTags.put("header", "Registreeri Interneti-arutelu");
        registrationNameTags.put("name", "Nimi *");
        registrationNameTags.put("surname", "Perekonnanimi *");
        registrationNameTags.put("phone", "Telefon kontaktandmed *");
        registrationNameTags.put("email", "E-mail");
        registrationNameTags.put("bankDivision", "Bank Division *");
        registrationNameTags.put("date", "Kuupäev *");
        registrationNameTags.put("topic", "Teema *");
        registrationNameTags.put("other", "Kommentaare");}
    public void setupRegistrationNameTagsEN(){
        registrationNameTags.put("title", "Registration");
        registrationNameTags.put("header", "Online registration for consultation");
        registrationNameTags.put("name", "Name *");
        registrationNameTags.put("surname", "Surname *");
        registrationNameTags.put("phone", "Phone *");
        registrationNameTags.put("email", "E-mail");
        registrationNameTags.put("bankDivision", "Bank division *");
        registrationNameTags.put("date", "Date *");
        registrationNameTags.put("topic", "Theme *");
        registrationNameTags.put("other", "Comments");
    }
    public void setupRegistrationNameTagsLV(){
        registrationNameTags.put("title", "Reģistrācija");
        registrationNameTags.put("header", "Reģistrēties apspriešanu tiešsaistē");
        registrationNameTags.put("name", "Vārds *");
        registrationNameTags.put("surname", "Uzvārds *");
        registrationNameTags.put("phone", "Tālrunis *");
        registrationNameTags.put("email", "El-pasts");
        registrationNameTags.put("bankDivision", "Bankas nodaļa *");
        registrationNameTags.put("date", "Datums *");
        registrationNameTags.put("topic", "Tēma *");
        registrationNameTags.put("other", "Piezīmes, komentāri");
    }
    
    public void setupErrorMessagesMapLT(){
        errorMessagesMap.put("nameTooShort","Jūsų vardas per trumpas!");
        errorMessagesMap.put("nameTooLong","Jūsų vardas per ilgas!");
        errorMessagesMap.put("enterName","Įveskite savo vardą!");

        errorMessagesMap.put("surnameTooShort","Jūsų pavardė per trumpa!");
        errorMessagesMap.put("surnameTooLong","Jūsų pavardė per ilga!");
        errorMessagesMap.put("enterSurname","Įveskite savo pavardę!");

        errorMessagesMap.put("messageTooShort","Įvestas žinutės tekstas per trumpas!");
        errorMessagesMap.put("messageTooLong","Įvestas žinutės tekstas per ilgas!");
        errorMessagesMap.put("enterMessage","Įveskite žinutės tekstą!");

        errorMessagesMap.put("phoneTooShort","Jūsų telefono numeris per trumpas!");
        errorMessagesMap.put("phoneTooLong","Jūsų telefono numeris per ilgas!");
        errorMessagesMap.put("enterPhone","Įveskite telefono numerį!");

        errorMessagesMap.put("enterEmail","Įveskite elektroninio pašto adresą!");
        errorMessagesMap.put("emailTooShort","Jūsų elektroninio pašto adresas per trumpas!");
        errorMessagesMap.put("emailTooLong","Jūsų elektroninio pašto adresas per ilgas!");
        errorMessagesMap.put("wrongEmailFormat","Neteisingai įvestas elektroninio pašto adresas!");

        errorMessagesMap.put("dateTooShort","Įvesta data per trumpa!");
        errorMessagesMap.put("dateTooLong","Įvesta data per ilga!");
        errorMessagesMap.put("enterDate","Įveskite datą!");
        errorMessagesMap.put("wrongDateFormat","Neteisingai įvesta data!");
        
    }
    public void setupErrorMessagesMapRU(){
        errorMessagesMap.put("nameTooShort","Ваше имя слишком короткое!");
        errorMessagesMap.put("nameTooLong","Ваше имя слишком длинное!");
        errorMessagesMap.put("enterName","Введите свое имя!");

        errorMessagesMap.put("surnameTooShort","Ваша фамилия слишком короткая!");
        errorMessagesMap.put("surnameTooLong","Ваша фамилия слишком длинная!");
        errorMessagesMap.put("enterSurname","Введите свою фамилию!");

        errorMessagesMap.put("messageTooShort","Текст введеного сообщения слишком короткий!");
        errorMessagesMap.put("messageTooLong","Текст введеного сообщения слишком длинный!");
        errorMessagesMap.put("enterMessage","Введите текст сообщения!");

        errorMessagesMap.put("phoneTooShort","Номер вашего телефона слишком короткий!");
        errorMessagesMap.put("phoneTooLong","Номер вашего телефона слишком длинный!");
        errorMessagesMap.put("enterPhone","Введите номер телефона!");

        errorMessagesMap.put("enterEmail","Введите адрес электронной почты!");
        errorMessagesMap.put("emailTooShort","Адрес вашей электронной почты слишком короткий!");
        errorMessagesMap.put("emailTooLong","Адрес вашей электронной почты слишком длинный!");
        errorMessagesMap.put("wrongEmailFormat","Неверно введен адрес электронной почты!");

        errorMessagesMap.put("dateTooShort","Введеная дата слишком короткая!");
        errorMessagesMap.put("dateTooLong","Введеная дата слишком длинная!");
        errorMessagesMap.put("enterDate","Введите дату!");
        errorMessagesMap.put("wrongDateFormat","Дата введена неверно!");
        
    }
    public void setupErrorMessagesMapEE(){
        errorMessagesMap.put("nameTooShort","Teie nimi on liiga lühike!");
        errorMessagesMap.put("nameTooLong","Teie nimi on liiga pikk!");
        errorMessagesMap.put("enterName","Sisestama oma nimi!");

        errorMessagesMap.put("surnameTooShort","Teie perekonnanimi on liiga lühike!");
        errorMessagesMap.put("surnameTooLong","Teie perekonnanimi on liiga pikk!");
        errorMessagesMap.put("enterSurname","Sisestama oma perekonnanimi!");

        errorMessagesMap.put("messageTooShort","Sisenenud sõnumi teksti on liiga lühike!");
        errorMessagesMap.put("messageTooLong","Sisenenud sõnumi teksti on liiga pikk!");
        errorMessagesMap.put("enterMessage","Sisestama oma sõnum!");

        errorMessagesMap.put("phoneTooShort","Teie telefoni number on liiga lühike!");
        errorMessagesMap.put("phoneTooLong","Teie telefoni number on liiga pikk!");
        errorMessagesMap.put("enterPhone","Sisestama telefoninumber!");

        errorMessagesMap.put("enterEmail","Sisesta e-posti aadress!");
        errorMessagesMap.put("emailTooShort","Teie e-posti aadress on liiga lühike!");
        errorMessagesMap.put("emailTooLong","Teie e-posti aadress on liiga pikk!");
        errorMessagesMap.put("wrongEmailFormat","Vale e-posti aadress!");

        errorMessagesMap.put("dateTooShort","Kuupäev kantakse liiga lühike!");
        errorMessagesMap.put("dateTooLong","Kuupäev Sisestatud on liiga pikk!");
        errorMessagesMap.put("enterDate","Sisestage kuupäev!");
        errorMessagesMap.put("wrongDateFormat","Valesti sisestatud kuupäeva!");
    }
    public void setupErrorMessagesMapEN(){
        errorMessagesMap.put("nameTooShort","Name to short!");
        errorMessagesMap.put("nameTooLong","Name to long!");
        errorMessagesMap.put("enterName","Enter your name!");

        errorMessagesMap.put("surnameTooShort","Surname to short!");
        errorMessagesMap.put("surnameTooLong","Surname to long!");
        errorMessagesMap.put("enterSurname","Enter your surname!");

        errorMessagesMap.put("messageTooShort","Length of your message is to short!");
        errorMessagesMap.put("messageTooLong","Length of your message is to long!");
        errorMessagesMap.put("enterMessage","Enter your message!");

        errorMessagesMap.put("phoneTooShort","Phone number to short!");
        errorMessagesMap.put("phoneTooLong","Phone number to long!");
        errorMessagesMap.put("enterPhone","Enter your phone number!");

        errorMessagesMap.put("enterEmail","Enter your e-mail!");
        errorMessagesMap.put("emailTooShort","E-mail to short!");
        errorMessagesMap.put("emailTooLong","E-mail to long!");
        errorMessagesMap.put("wrongEmailFormat","Incorrect e-mail!");

        errorMessagesMap.put("dateTooShort","Date to short!");
        errorMessagesMap.put("dateTooLong","Date to long!");
        errorMessagesMap.put("enterDate","Enter date!");
        errorMessagesMap.put("wrongDateFormat","Incorrect date!");
    }
    public void setupErrorMessagesMapLV(){
        errorMessagesMap.put("nameTooShort","Tavs vārds ir pārāk īss!");
        errorMessagesMap.put("nameTooLong","Tavs vārds ir pārāk garš!");
        errorMessagesMap.put("enterName","Ievadiet savu vārdu!");

        errorMessagesMap.put("surnameTooShort","Tavs uzvārds ir pārāk īss!");
        errorMessagesMap.put("surnameTooLong","Tavs uzvārds ir pārāk garš!");
        errorMessagesMap.put("enterSurname","Ievadiet savu uzvārdu!");

        errorMessagesMap.put("messageTooShort","Ievadīta ziņojuma teksts ir pārāk īss!");
        errorMessagesMap.put("messageTooLong","Ievadīta ziņojuma teksts ir pārāk garš!");
        errorMessagesMap.put("enterMessage","Ievadiet savu ziņu");

        errorMessagesMap.put("phoneTooShort","Jūsu tālruņa numurs ir pārāk īss!");
        errorMessagesMap.put("phoneTooLong","Jūsu tālruņa numurs ir pārāk garš!");
        errorMessagesMap.put("enterPhone","Ievadiet tālruņa numuru!");

        errorMessagesMap.put("enterEmail","Ievadiet e-pasta adresi!");
        errorMessagesMap.put("emailTooShort","Jūsu e-pasta adrese ir pārāk īss!");
        errorMessagesMap.put("emailTooLong","Jūsu e-pasta adrese ir pārāk gara!");
        errorMessagesMap.put("wrongEmailFormat","Nepareizi e-pasta adresi!");

        errorMessagesMap.put("dateTooShort","Datums ievadīta ir pārāk īss!");
        errorMessagesMap.put("dateTooLong","Datums ievadīta ir pārāk garš!");
        errorMessagesMap.put("enterDate","Ievadiet datumu!");
        errorMessagesMap.put("wrongDateFormat","Nepareizi ievadīts datums!");
    }
    
    public void setupButtonsLT(){
        buttonsMap.put("send","Siųsti");
        buttonsMap.put("back","< Atgal");
        buttonsMap.put("registration","Registruotis");
    }
    public void setupButtonsRU(){
        buttonsMap.put("send","Отправить");
        buttonsMap.put("back","< Назад");
        buttonsMap.put("registration","Registruotis");
    }
    public void setupButtonsEE(){
        buttonsMap.put("send","Saatma");
        buttonsMap.put("back","< Tagasi");
        buttonsMap.put("registration","Registruotis");
    }
    public void setupButtonsEN(){
        buttonsMap.put("send","Send");
        buttonsMap.put("back","< Back");
        buttonsMap.put("registration","Register");
    }
    public void setupButtonsLV(){
        buttonsMap.put("send","Sūtīt");
        buttonsMap.put("back","< atpakaļ");
        buttonsMap.put("registration","Registruotis");
        
    }
    
    public void setupLanguageLT() {

        setupHomeScreenNameMapLT();
        setupContactUsNameMapLT();
        setupContactUsRadioButtonMapLT();
        setupBankDivisionsLT();
        setupTopicsLT();
        setupRegistrationNameTagsLT();
        setupErrorMessagesMapLT();
        setupButtonsLT();

        contactUsConfirmationNameList.add("Sveiki, ");
        contactUsConfirmationNameList.add("dėkojame, kad kreipiatės į „Swedbank“.");
        contactUsConfirmationNameList.add("Į pateiktus klausimus atsakome darbo dienomis 8–20 val., " +
                "šeštadieniais 9–16 valandomis. Jeigu Jums reikalinga skubi informacija, " +
                "laukiame Jūsų skambučių telefonu 1884 arba tel. +370 5 268 4444, " +
                "jei skambinate iš užsienio. Linkime geros dienos!");


        registrationConfirmationNameList.add("Registracijos Patvirtinimas");
        registrationConfirmationNameList.add("Ačiū, kad domitės banko paslaugomis.");
        registrationConfirmationNameList.add("Jeigu Jums reikalinga skubi informacija, laukiame Jūsų skambučių telefonu 1884, " +
                "darbo dienomis 8-20 val., šeštadieniais 9-16 val.");


        registrationOverviewList.add("Registracijos internetu");


    }
    public void setupLanguageRU() {
        
        setupHomeScreenNameMapRU();
        setupContactUsNameMapRU();
        setupContactUsRadioButtonMapRU();
        setupBankDivisionsRU();
        setupTopicsRU();
        setupRegistrationNameTagsRU();
        setupErrorMessagesMapRU();
        setupButtonsRU();

        contactUsConfirmationNameList.add("Здравствуйте, ");
        contactUsConfirmationNameList.add("благодарим, за пользование „Swedbank“.");
        contactUsConfirmationNameList.add("На заданые вопроса отвечаем по рабочим дням с 8 до 20 ч., " +
                "по субботам с 9 до 16 часов. Если информация Вам нужна срочно, " +
                "ждем ваших звонков по тел. 1884(для частных клиентов), 1663(для бизнес клиентов). " +
                "Из заграницы звоните по тел. +370 5 268 4444(для частных клиентов), " +
                " +370 5 268 4422 (для бизнес клиентов).");


        registrationOverviewList.add("Регистрации по интернету");

       
    }
    public void setupLanguageEE() {
        
        setupHomeScreenNameMapEE();
        setupContactUsNameMapEE();
        setupContactUsRadioButtonMapEE();
        setupBankDivisionsEE();
        setupTopicsEE();
        setupRegistrationNameTagsEE();
        setupErrorMessagesMapEE();
        setupButtonsEE();

        contactUsConfirmationNameList.add("Tere, ");
        contactUsConfirmationNameList.add("täname, et võtsite „Swedbank“.");
        contactUsConfirmationNameList.add("Vastused küsimustele tööpäeviti 8–20 h., " +
                "laupäeviti 9–16 tööaeg. Kui teil on vaja vahetu teave, " +
                "ootame teie telefonikõne 1884 või num. +370 5 268 4444, " +
                "kui heMapate välismaalt. Soovime hea päev!");


        registrationOverviewList.add("Registreerimine Internetis");


    }
    public void setupLanguageEN() {
        
        setupHomeScreenNameMapEN();
        setupContactUsNameMapEN();
        setupContactUsRadioButtonMapEN();
        setupBankDivisionsEN();
        setupTopicsEN();
        setupRegistrationNameTagsEN();
        setupErrorMessagesMapEN();
        setupButtonsEN();
        
        registrationOverviewList.add("Online registrations");

        contactUsConfirmationNameList.add("Hello, ");
        contactUsConfirmationNameList.add("Thank you for contacting „Swedbank“.");
        contactUsConfirmationNameList.add("We answer your questions on workdays 8–20 hours., " +
                "saturdays 9–16 hours. If you need immediate information, " +
                "you can call us 1884 (private customers) also 1633 (business customer). " +
                "Call us from abroad +370 5 268 4444 (private customers) " +
                "also +370 5 268 4422 (business customers). Wish you all the best!");


    }
    public void setupLanguageLV() {
        
        setupHomeScreenNameMapLV();
        setupContactUsNameMapLV();
        setupContactUsRadioButtonMapLV();
        setupBankDivisionsLV();
        setupTopicsLV();
        setupRegistrationNameTagsLV();
        setupErrorMessagesMapLV();
        setupButtonsLV();

        contactUsConfirmationNameList.add("Sveiki, ");
        contactUsConfirmationNameList.add("Paldies, kas attiecas uz Swedbank“.");
        contactUsConfirmationNameList.add("Atbildes uz uzdotajiem darbdienās 8-20 am jautājumiem., " +
                "Sestdienās 9-16 stundas. Ja jums nepieciešama tūlītēja informācija, " +
                "Mēs gaidām jūsu telefona zvanu 1884 vai tel. +370 5 268 4444, " +
                "Ja jūs zvanāt no ārzemēm Novēlam laba diena!");
        
        registrationOverviewList.add("Reģistrācijas online");


    }


    public Map<String, String> getHomeScreenNameMap() {
        return homeScreenNameMap;
    }

    public Map<String, String> getContactUsNameMap() {
        return contactUsNameMap;
    }

    public Map<String, String> getContactUsRadioButtonMap() {
        return contactUsRadioButtonMap;
    }

    public List<String> getcontactUsConfirmationNameList() {
        return contactUsConfirmationNameList;
    }

    public List<String> gettopics() {
        return topics;
    }

    public List<String> getbankDivisions() {
        return bankDivisions;
    }

    public Map<String, String> getRegistrationNameTags() {
        return registrationNameTags;
    }

    public List<String> getRegistrationOverviewMap() {
        return registrationOverviewList;
    }

    public Map<String, String> getErrorMessagesMap() {
        return errorMessagesMap;
    }

    public Map<String, String> getButtonsMap() {
        return buttonsMap;
    }

    public List<String> getRegistrationConfirmationNameList() {
        return registrationConfirmationNameList;
    }



}

