    var app = angular.module('ContactUsConfirmationScreen', []);

    app.controller('ContactUsConfirmationScreenController', function($scope, $http) {
           $http({
             method: 'GET',
             url: '/lt'
           }).then(function successCallback(response) {
               $scope.confirmationNameList = response.data.contactUsConfirmationNameList;
             });
           });