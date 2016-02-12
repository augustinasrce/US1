    var app = angular.module('HomeScreen', []);


    app.controller('SimpleCtrl', function($scope) {
        $scope.title = "Susisiekite su mumis";
        $scope.register = "Registruokitės konsultacijai internetu";
        $scope.contacts = "Parašykite mums";
        document.title = $scope.title;
    });