var app = angular.module('RegistrationScreen', ['ngMessages']);
var language = document.cookie;


 app.controller('RegistrationScreenController',  function($scope, $http) {
 $scope.step = 1;
 $scope.validValues = ['+','1','2','3','4','5','6','7','8','9','0'];
 $scope.plus = ['+'];

    $http({
        method: 'GET',
        url: '/sql'
      }).then(function successCallback(response) {
                        $scope.registrationInfo = response.data;
    });

    $(document).ready(function() {
             $.datetimepicker.setLocale('lt');

            var availableTimeList =  $http({
         method: 'GET',
         url: '/times'
    }).then(function successCallback(response) {

           $( "#inputDate" ).datetimepicker({
                                minDate: 0,
                                allowTimes: response.data,
                                format:	'Y-m-d H:i',
                             });
        });

    });



    $scope.remove = function (number){
        $http({
             method: 'DELETE',
             url: '/delete/' + number
        }).then(function successCallback(response) {
             $http({
                 method: 'GET',
                 url: '/sql'
             }).then(function successCallback(response) {
                $scope.registrationInfo = response.data;
             });

    })};

    $scope.preview = function (number){
        $http({
             method: 'GET',
             url: '/preview/' + number
        }).then(function successCallback(response) {
             $scope.stepDown();
             $scope.result = response.data;
             });

    };


    $scope.submitForm = function () {

        $http.put('/registration/'  +$('#inputName').val()+'/'
                                    +$('#inputSurname').val()+'/'
                                    +$('#inputPhone').val()+'/'
                                    +$('#inputEmail').val()+'/'
                                    +$('#inputBankDivision').val()+'/'
                                    +$('#inputDate').val()+'/'
                                    +$('#inputTopic').val()+'/'
                                    +$('#inputOther').val()+'/')
        .success(function (data, status, headers) {
            $scope.stepUp();
        })
    };

    $scope.stepUp = function(){
        $scope.step++;
    }

    $scope.stepDown = function(){
        $scope.step--;
    }

    $('#inputPhone').keypress(function(event) {
        var code = (event.keyCode ? event.keyCode : event.which);
        if(code == 8)
            return true;
        if (!(
                (code >= 48 && code <= 57) //numbers
                || (code == 43) //period
            )
            || (code == 43 && $(this).val().indexOf('+') != -1)
           )
            event.preventDefault();
    });

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
                    url: '/'+ language
                }).then(function successCallback(response) {
                    $scope.nameList = response.data.registrationNameTags;
                    $scope.topics = response.data.topics;
                    $scope.bankDivisions = response.data.bankDivisions;
                    $scope.confirmationNameList = response.data.registrationConfirmationNameList;
                    $scope.errorList = response.data.errorMessagesMap;
                    $scope.buttons = response.data.buttonsMap;
                    document.title =  response.data.registrationNameTags.title;
                });
        }

 });


