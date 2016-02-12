var contactUs = angular.module('ContactUs', []);


    contactUs.controller('ContactUsController', function($scope){
        $scope.titleTag = "Parašykite mums";
        $scope.themeTag = "Tema";
        $scope.themeDefaultMessage = "Pasirinkite";
        $scope.themeOptions= ["Taupymas ir investavimas","Pensijos ir kaupimas","Gyvybės draudimas","Ne gyvybės draudimas",
                               "Paskolos, lizingas","Kasdienių finansų valdymas"];
        $scope.responseWayChoices = ["Telefonu","El.paštu","Telefonu ir El.paštu"];
        $scope.messageTag = "Žinutės tekstas";
        $scope.client = {
            name: "Vardas",
            surname: "Pavardė",
            phone: "Telefonas",
            email: "El.paštas",
            responseWay: "Kaip pageidaujate gauti atsakymą"};
        });