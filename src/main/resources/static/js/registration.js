var app = angular.module('RegistrationScreen', []);

 app.controller('RegistrationScreenController',  function($scope, $http) {
       $http({
         method: 'GET',
         url: '/lt'
       }).then(function successCallback(response) {
            $scope.nameList = response.data.registrationNameTags;
            $scope.topics = response.data.topicList;
            $scope.bankDivisions = response.data.bankDivisionList;

            document.title =  response.data.registrationNameTags.title;
           });
 });
