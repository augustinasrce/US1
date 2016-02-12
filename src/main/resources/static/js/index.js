    var app = angular.module('HomeScreen', []);


    app.controller('SimpleCtrl', function($scope, $http) {
    $http({
      method: 'GET',
      url: '/lt'
    }).then(function successCallback(response) {
        $scope.title = response.data.homeScreenNameList[0];
        $scope.register = response.data.homeScreenNameList[1];
        $scope.contacts = response.data.homeScreenNameList[2];
        document.title = $scope.title;
      });
    });