package lt.swedbank.contactForm.beans;

import java.lang.reflect.Array;
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
    ArrayList<String> errorMessagesList;
    ArrayList<String> registrationConfirmationNameList;
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
        errorMessagesList = new ArrayList<String>();
        registrationConfirmationNameList = new ArrayList<String>();

    }

    public void setupLanguageRU() {
        homeScreenNameList.add("Свяжитесь с нами");
        homeScreenNameList.add("Регистрация по интернету");
        homeScreenNameList.add("Напишите нам");

        contactUsNameList.add("Напишите нам");
        contactUsNameList.add("Тема *");
        contactUsNameList.add("Текст сообщения *");
        contactUsNameList.add("Имя *");
        contactUsNameList.add("Фамилия");
        contactUsNameList.add("Телефон *");
        contactUsNameList.add("Адрес электронной почты *");
        contactUsNameList.add("Каким образом предпочитаете получить ответ *");
        contactUsNameList.add("На заданые вопроса отвечаем по рабочим дням с 8 до 20 ч., " +
                "по субботам с 9 до 16 часов. Если информация Вам нужна срочно, " +
                "ждем ваших звонков по тел. 1884(для частных клиентов), 1663(для бизнес клиентов). " +
                "Из заграницы звоните по тел. +370 5 268 4444(для частных клиентов), " +
                " +370 5 268 4422 (для бизнес клиентов).");
        contactUsNameList.add("Отправить");

        contactUsDropDownMenuList.add("Экономия и инвестиции");
        contactUsDropDownMenuList.add("Пенсии и сбережения");
        contactUsDropDownMenuList.add("Страхование жизни");
        contactUsDropDownMenuList.add("Страхование не связаное со здоровьем или жизнью");
        contactUsDropDownMenuList.add("Кредиты, лизинг");
        contactUsDropDownMenuList.add("Управление каждодневными финансами");

        contactUsRadioButtonList.add("по телефону");
        contactUsRadioButtonList.add("по электронной почте");
        contactUsRadioButtonList.add("по электронной почте и по телефону");

        contactUsConfirmationNameList.add("Здравствуйте, ");
        contactUsConfirmationNameList.add("благодарим, за пользование „Swedbank“.");
        contactUsConfirmationNameList.add("На заданые вопроса отвечаем по рабочим дням с 8 до 20 ч., " +
                "по субботам с 9 до 16 часов. Если информация Вам нужна срочно, " +
                "ждем ваших звонков по тел. 1884(для частных клиентов), 1663(для бизнес клиентов). " +
                "Из заграницы звоните по тел. +370 5 268 4444(для частных клиентов), " +
                " +370 5 268 4422 (для бизнес клиентов).");
        contactUsConfirmationNameList.add("< Назад");

        bankDivisionList.add("Antakalnio ул. 45");
        bankDivisionList.add("Ateities ул. 91 (PC „Mandarinas\")");
        bankDivisionList.add("Gedimino пр. 56");
        bankDivisionList.add("Konstitucijos пр. 20A, работает Жилищный Центр");
        bankDivisionList.add("Ozo ул. 25 (PPC „Akropolis\")");

        topicList.add("Экономия и инвестиции");
        topicList.add("Пенсии и сбережения");
        topicList.add("Страхование жизни");
        topicList.add("Страхование не связаное со здоровьем или жизнью");
        topicList.add("Кредиты, лизинг");
        topicList.add("Управление каждодневными финансами");

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
        registrationNameTags.put("confirmButton", "Отправить");

        registrationOverviewList.add("Регистрации по интернету");

        errorMessagesList.add("Ваше имя слишком короткое!");
        errorMessagesList.add("Ваше имя слишком длинное!");
        errorMessagesList.add("Введите свое имя!");

        errorMessagesList.add("Ваша фамилия слишком короткая!");
        errorMessagesList.add("Ваша фамилия слишком длинная!");
        errorMessagesList.add("Введите свою фамилию!");

        errorMessagesList.add("Текст введеного сообщения слишком короткий!");
        errorMessagesList.add("Текст введеного сообщения слишком длинный!");
        errorMessagesList.add("Введите текст сообщения!");

        errorMessagesList.add("Номер вашего телефона слишком короткий!");
        errorMessagesList.add("Номер вашего телефона слишком длинный!");
        errorMessagesList.add("Введите номер телефона!");

        errorMessagesList.add("Введите адрес электронной почты!");
        errorMessagesList.add("Адрес вашей электронной почты слишком короткий!");
        errorMessagesList.add("Адрес вашей электронной почты слишком длинный!");
        errorMessagesList.add("Неверно введен адрес электронной почты!");

        errorMessagesList.add("Введеная дата слишком короткая!");
        errorMessagesList.add("Введеная дата слишком длинная!");
        errorMessagesList.add("Введите дату!");
        errorMessagesList.add("Дата введена неверно!");
    }

    public void setupLanguageLT() {
        homeScreenNameList.add("Susisiekite su mumis");
        homeScreenNameList.add("Registruokitės konsultacijai internetu");
        homeScreenNameList.add("Parašykite mums");

        contactUsNameList.add("Parašykite mums");
        contactUsNameList.add("Tema *");
        contactUsNameList.add("Žinutės tekstas *");
        contactUsNameList.add("Vardas *");
        contactUsNameList.add("Pavardė ");
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


        registrationConfirmationNameList.add("Sveiki, ");
        registrationConfirmationNameList.add("dėkojame, kad kreipiatės į „Swedbank“.");
        registrationConfirmationNameList.add("Į pateiktus klausimus atsakome darbo dienomis 8–20 val., " +
                "šeštadieniais 9–16 valandomis. Jeigu Jums reikalinga skubi informacija, " +
                "laukiame Jūsų skambučių telefonu 1884 arba tel. +370 5 268 4444, " +
                "jei skambinate iš užsienio. Linkime geros dienos!");
        registrationConfirmationNameList.add("< Atgal");




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
        registrationNameTags.put("confirmButton", "Siųsti");

        registrationOverviewList.add("Registracijos internetu");

        errorMessagesList.add("Jūsų vardas per trumpas!");
        errorMessagesList.add("Jūsų vardas per ilgas!");
        errorMessagesList.add("Įveskite savo vardą!");

        errorMessagesList.add("Jūsų pavardė per trumpa!");
        errorMessagesList.add("Jūsų pavardė per ilga!");
        errorMessagesList.add("Įveskite savo pavardę!");

        errorMessagesList.add("Įvestas žinutės tekstas per trumpas!");
        errorMessagesList.add("Įvestas žinutės tekstas per ilgas!");
        errorMessagesList.add("Įveskite žinutės tekstą!");

        errorMessagesList.add("Jūsų telefono numeris per trumpas!");
        errorMessagesList.add("Jūsų telefono numeris per ilgas!");
        errorMessagesList.add("Įveskite telefono numerį!");

        errorMessagesList.add("Įveskite elektroninio pašto adresą!");
        errorMessagesList.add("Jūsų elektroninio pašto adresas per trumpas!");
        errorMessagesList.add("Jūsų elektroninio pašto adresas per ilgas!");
        errorMessagesList.add("Neteisingai įvestas elektroninio pašto adresas!");

        errorMessagesList.add("Įvesta data per trumpa!");
        errorMessagesList.add("Įvesta data per ilga!");
        errorMessagesList.add("Įveskite datą!");
        errorMessagesList.add("Neteisingai įvesta data!");


    }

    public void setupLanguageEE() {
        homeScreenNameList.add("Kontakt");
        homeScreenNameList.add("Registreeri Interneti-arutelu");
        homeScreenNameList.add("Kirjuta meile");

        contactUsNameList.add("Kirjuta meile");
        contactUsNameList.add("Teema *");
        contactUsNameList.add("Tekstisõnumeid *");
        contactUsNameList.add("Nimi *");
        contactUsNameList.add("Perekonnanimi");
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

        registrationNameTags.put("title", "Registreerimine");
        registrationNameTags.put("header", "Registreeri Interneti-arutelu");
        registrationNameTags.put("name", "Nimi *");
        registrationNameTags.put("surname", "Perekonnanimi *");
        registrationNameTags.put("phone", "Telefon kontaktandmed *");
        registrationNameTags.put("email", "E-mail");
        registrationNameTags.put("bankDivision", "Bank Division *");
        registrationNameTags.put("date", "Kuupäev *");
        registrationNameTags.put("topic", "Teema *");
        registrationNameTags.put("other", "Kommentaare");
        registrationNameTags.put("confirmButton", "Saatma");

        registrationOverviewList.add("Registreerimine Internetis");

        errorMessagesList.add("Teie nimi on liiga lühike!");
        errorMessagesList.add("Teie nimi on liiga pikk!");
        errorMessagesList.add("Sisestama oma nimi!");

        errorMessagesList.add("Teie perekonnanimi on liiga lühike!");
        errorMessagesList.add("Teie perekonnanimi on liiga pikk!");
        errorMessagesList.add("Sisestama oma perekonnanimi!");

        errorMessagesList.add ("Sisenenud sõnumi teksti on liiga lühike!");
        errorMessagesList.add ("Sisenenud sõnumi teksti on liiga pikk!");
        errorMessagesList.add ("Sisestama oma sõnum!");

        errorMessagesList.add("Teie telefoni number on liiga lühike!");
        errorMessagesList.add("Teie telefoni number on liiga pikk!");
        errorMessagesList.add("Sisestama telefoninumber!");

        errorMessagesList.add("Sisesta e-posti aadress!");
        errorMessagesList.add("Teie e-posti aadress on liiga lühike!");
        errorMessagesList.add("Teie e-posti aadress on liiga pikk!");
        errorMessagesList.add("Vale e-posti aadress!");

        errorMessagesList.add ("Kuupäev kantakse liiga lühike!");
        errorMessagesList.add ("Kuupäev Sisestatud on liiga pikk!");
        errorMessagesList.add ("Sisestage kuupäev!");
        errorMessagesList.add ("Valesti sisestatud kuupäeva!");
    }

    public void setupLanguageEN() {
        homeScreenNameList.add("Contact us");
        homeScreenNameList.add("Online registration for consultation");
        homeScreenNameList.add("Contact us");

        contactUsNameList.add("Contact us");
        contactUsNameList.add("Topic *");
        contactUsNameList.add("Text field *");
        contactUsNameList.add("Name *");
        contactUsNameList.add("Surname");
        contactUsNameList.add("Telephone number *");
        contactUsNameList.add("E-mail *");
        contactUsNameList.add("How would you like to receive an answer *");
        contactUsNameList.add("We answer your questions on workdays 8–20 hours., " +
                "saturdays 9–16 hours. If you need immediate information, " +
                "you can call us 1884 (private customers) also 1633 (business customer). " +
                "Call us from abroad +370 5 268 4444 (private customers) " +
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
        contactUsConfirmationNameList.add("We answer your questions on workdays 8–20 hours., " +
                "saturdays 9–16 hours. If you need immediate information, " +
                "you can call us 1884 (private customers) also 1633 (business customer). " +
                "Call us from abroad +370 5 268 4444 (private customers) " +
                "also +370 5 268 4422 (business customers). Wish you all the best!");
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
        registrationNameTags.put("confirmButton", "Send");

        errorMessagesList.add("Name to short!");
        errorMessagesList.add("Name to long!");
        errorMessagesList.add("Enter your name!");

        errorMessagesList.add("Surname to short!");
        errorMessagesList.add("Surname to long!");
        errorMessagesList.add("Enter your surname!");

        errorMessagesList.add("Length of your message is to short!");
        errorMessagesList.add("Length of your message is to long!");
        errorMessagesList.add("Enter your message!");

        errorMessagesList.add("Phone number to short!");
        errorMessagesList.add("Phone number to long!");
        errorMessagesList.add("Enter your phone number!");

        errorMessagesList.add("Enter your e-mail!");
        errorMessagesList.add("E-mail to short!");
        errorMessagesList.add("E-mail to long!");
        errorMessagesList.add("Incorrect e-mail!");

        errorMessagesList.add("Date to short!");
        errorMessagesList.add("Date to long!");
        errorMessagesList.add("Enter date!");
        errorMessagesList.add("Incorrect date!");

    }

    public void setupLanguageLV() {
        homeScreenNameList.add("Sazinies ar mums");
        homeScreenNameList.add("Reģistrēties tiešsaistes konsultācijas");
        homeScreenNameList.add("Rakstiet mums");

        contactUsNameList.add("Rakstiet mums");
        contactUsNameList.add("Tēma *");
        contactUsNameList.add("Dokuments ziņojuma *");
        contactUsNameList.add("Vārds *");
        contactUsNameList.add("Uzvārds");
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

        registrationOverviewList.add("Online registrations");
        contactUsRadioButtonList.add("pa tālruni");
        contactUsRadioButtonList.add("pa e-pastu");
        contactUsRadioButtonList.add("pa e-pastu un tālruni");


        contactUsConfirmationNameList.add("Sveiki, ");
        contactUsConfirmationNameList.add("Paldies, kas attiecas uz Swedbank“.");
        contactUsConfirmationNameList.add("Atbildes uz uzdotajiem darbdienās 8-20 am jautājumiem., " +
                "Sestdienās 9-16 stundas. Ja jums nepieciešama tūlītēja informācija, " +
                "Mēs gaidām jūsu telefona zvanu 1884 vai tel. +370 5 268 4444, " +
                "Ja jūs zvanāt no ārzemēm Novēlam laba diena!");
        contactUsConfirmationNameList.add("< atpakaļ");

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
        registrationNameTags.put("confirmButton", "Sūtīt");

        registrationOverviewList.add("Reģistrācijas online");

        errorMessagesList.add("Tavs vārds ir pārāk īss!");
        errorMessagesList.add("Tavs vārds ir pārāk garš!");
        errorMessagesList.add("Ievadiet savu vārdu!");

        errorMessagesList.add("Tavs uzvārds ir pārāk īss!");
        errorMessagesList.add("Tavs uzvārds ir pārāk garš!");
        errorMessagesList.add("Ievadiet savu uzvārdu!");

        errorMessagesList.add("Ievadīta ziņojuma teksts ir pārāk īss!");
        errorMessagesList.add("Ievadīta ziņojuma teksts ir pārāk garš!");
        errorMessagesList.add("Ievadiet savu ziņu");

        errorMessagesList.add("Jūsu tālruņa numurs ir pārāk īss!");
        errorMessagesList.add("Jūsu tālruņa numurs ir pārāk garš!");
        errorMessagesList.add("Ievadiet tālruņa numuru!");

        errorMessagesList.add("Ievadiet e-pasta adresi!");
        errorMessagesList.add("Jūsu e-pasta adrese ir pārāk īss!");
        errorMessagesList.add ("Jūsu e-pasta adrese ir pārāk gara!");
        errorMessagesList.add ("Nepareizi e-pasta adresi!");

        errorMessagesList.add("Datums ievadīta ir pārāk īss!");
        errorMessagesList.add("Datums ievadīta ir pārāk garš!");
        errorMessagesList.add("Ievadiet datumu!");
        errorMessagesList.add("Nepareizi ievadīts datums!");
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

    public ArrayList<String> getTopicList() {
        return topicList;
    }

    public ArrayList<String> getBankDivisionList() {
        return bankDivisionList;
    }

    public Map<String, String> getRegistrationNameTags() {
        return registrationNameTags;
    }

    public ArrayList<String> getRegistrationOverviewList() {
        return registrationOverviewList;
    }

    public ArrayList<String> getErrorMessagesList() {
        return errorMessagesList;
    }

}
