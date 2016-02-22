    var language = 'lt';
    var app = angular.module('HomeScreen', []);
    document.cookie="";
    document.cookie="lt";


    app.controller('HomeScreenController', function($scope, $http) {

       get();
       $('#en').on('click', function(){
            $('#lv').removeClass('active');
            $('#ee').removeClass('active');
            $('#ru').removeClass('active');
            $('#lt').removeClass('active');
            $('#en').addClass('active');
            language = 'en';
            get();
            document.cookie="en";
       })

     $('#lt').on('click', function(){
          $('#lv').removeClass('active');
          $('#ee').removeClass('active');
          $('#ru').removeClass('active');
          $('#en').removeClass('active');
          $('#lt').addClass('active');
          language = 'lt';
          get();
          document.cookie="lt";
     })


       $('#ru').on('click', function(){
            $('#lv').removeClass('active');
            $('#ee').removeClass('active');
            $('#en').removeClass('active');
            $('#lt').removeClass('active');
            $('#ru').addClass('active');
            language = 'ru';
            get();
            document.cookie="ru";
          })

     $('#ee').on('click', function(){
          $('#lv').removeClass('active');
          $('#en').removeClass('active');
          $('#ru').removeClass('active');
          $('#lt').removeClass('active');
          $('#ee').addClass('active');
          language = 'ee';
          get();
          document.cookie="ee";
        })

     $('#lv').on('click', function(){
          $('#ee').removeClass('active');
          $('#en').removeClass('active');
          $('#ru').removeClass('active');
          $('#lt').removeClass('active');
          $('#lv').addClass('active');
          language = 'lv';
          get();
          document.cookie="lv";
        })

    function get(){
    $http({
         method: 'GET',
         url: '/'+language
         }).then(function successCallback(response) {
            $scope.title = response.data.homeScreenNameMap.header;
            $scope.register = response.data.homeScreenNameMap.registrationLink;
            $scope.contacts = response.data.homeScreenNameMap.contactUsLink;
            document.title = $scope.title;
         });
         }
    });
