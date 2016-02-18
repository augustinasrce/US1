var app = angular.module('registrationScreenOverview', ['ngMessages']);

 app.controller('registrationScreenOverviewController',  function($scope, $http) {
       $http({
                method: 'GET',
                url: '/sql'
              }).then(function successCallback(response) {
                                $scope.registrationInfo = response.data;
                                  });

 });
