    var app = angular.module('RegistrationScreen', ['ngMessages']);
    var language = document.cookie;

 app.controller('RegistrationScreenController',  function($scope, $http) {
       $http({
         method: 'GET',
         url: '/'+ language
       }).then(function successCallback(response) {

        $scope.nameList = response.data.registrationNameTags;
        $scope.topics = response.data.topicList;
        $scope.bankDivisions = response.data.bankDivisionList;

        document.title =  response.data.registrationNameTags.title;

          });

 });



