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

