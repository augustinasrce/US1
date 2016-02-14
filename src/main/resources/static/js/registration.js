var app = angular.module('RegistrationScreen', []);

 app.controller('RegistrationScreenController',  function($scope, $http) {
       $http({
         method: 'GET',
         url: '/registration'
       }).then(function successCallback(response) {
        $scope.nameList = response.data.registrationNameTags;
        $scope.topics = response.data.topics;
        $scope.bankDivisions = response.data.bankDivisions;

        document.title = nameTags.get("title");
          });
 });

     /*

        ArrayList<String> bankDivisions = new ArrayList<>();
        bankDivisions.add("Antakalnio g. 45");
        bankDivisions.add("Ateities g. 91 (PC „Mandarinas")");
        bankDivisions.add("Gedimino pr. 56");
        bankDivisions.add("Konstitucijos pr. 20A, dirba Būsto Centras");
        bankDivisions.add("Ozo g. 25 (PPC „Akropolis")");

        ArrayList<String> topics = new ArrayList<>();
        topics.add("Taupymas ir investavimas");
        topics.add("Pensijos ir kaupimas");
        topics.add("Gyvybės draudimas");
        topics.add("Ne gyvybės draudimas");
        topics.add("Paskolos, lizingas");
        topics.add("Kasdienių finansų valdymas");




        registrationNameTags.put("title","Registracija");
         registrationNameTags.put("header","Registruokitės konsultacijai internetu");
         registrationNameTags.put("name","Vardas *");
         registrationNameTags.put("surname","Pavardė *");
         registrationNameTags.put("phone","Telefonas susisiekti *");
         registrationNameTags.put("email","El.Paštas");
         registrationNameTags.put("bankDivision","Banko skyrius *");
         registrationNameTags.put("date","Data *");
         registrationNameTags.put("topic","Tema *");
         registrationNameTags.put("other","Pastabos, komentarai");
         registrationNameTags.put("confirmButton","Siųsti");


           */