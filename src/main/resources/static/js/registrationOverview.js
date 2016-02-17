var app = angular.module('registrationScreenOverview', ['ngMessages']);

 app.controller('registrationScreenOverviewController',  function($scope, $http) {
       $http({
         method: 'GET',
         url: '/sql'
       }).then(function successCallback(response) {
        $scope.nameList = response.data.registrationOverviewList;
        $scope.registrationInfo = response.data.variables;

        document.title =  $scope.nameList[0];
          });

 });
