    var app = angular.module('ContactUsScreen', []);

    app.controller('ContactUsScreenController', function($scope, $http) {
           $http({
             method: 'GET',
             url: '/lt'
           }).then(function successCallback(response) {
               $scope.title = response.data.contactUsNameList[0];
               $scope.topic = response.data.contactUsNameList[1];
               $scope.message = response.data.contactUsNameList[2];
               $scope.name = response.data.contactUsNameList[3];
               $scope.surname = response.data.contactUsNameList[4];
               $scope.phone = response.data.contactUsNameList[5];
               $scope.email = response.data.contactUsNameList[6];
               $scope.answer = response.data.contactUsNameList[7];
               $scope.info = response.data.contactUsNameList[8];

               document.title = $scope.title;
             });
           });