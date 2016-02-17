    var language = 'lt';
    var app = angular.module('HomeScreen', []);


    app.controller('HomeScreenController', function($scope, $http) {
    $http({
      method: 'GET',
      url: '/'+language
    }).then(function successCallback(response) {
        $scope.title = response.data.homeScreenNameList[0];
        $scope.register = response.data.homeScreenNameList[1];
        $scope.contacts = response.data.homeScreenNameList[2];
        document.title = $scope.title;
      });



          $('.nav li').on('click', function(){
              $('.nav li').removeClass('active');
              $(this).addClass('active');
              checkLanguage();
          });

    });


    function checkLanguage(){
        language = 'lt';
        $('#lt').addClass("active");
        $("#en").removeClass("active");
        $("#ru").removeClass("active");
        $("#ee").removeClass("active");
        $("#lv").removeClass("active");
    }