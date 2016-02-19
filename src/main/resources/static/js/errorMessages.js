var app = angular.module('errorMessages', ['ngMessages']);
var language = document.cookie;
 app.controller('errorMessagesController',  function($scope, $http) {
       $http({
                method: 'GET',
                url: '/' + language
              }).then(function successCallback(response) {
                                $scope.errorList = response.data.errorMessagesList;
                                  });

 });