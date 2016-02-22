    var app = angular.module('ContactUsScreen', ['ngMessages']);
    var language = document.cookie;


    app.controller('ContactUsScreenController', function($scope, $http) {

    $scope.validValues = ['+','1','2','3','4','5','6','7','8','9','0'];
    $scope.isEmailRequired = true;
    $scope.isPhoneRequired = true;

    $scope.showPhoneEmailFields = function(){
        $("#inputPhoneDiv").removeClass("hidden");
        $("#inputEmailDiv").removeClass("hidden");
        $scope.isEmailRequired = true;
        $scope.isPhoneRequired = true;
    }

    $scope.hidePhoneField = function(){
        $("#inputPhoneDiv").addClass("hidden");
        $("#inputEmailDiv").removeClass("hidden");
        $scope.isPhoneRequired = false;
        $scope.isEmailRequired = true;
    }

    $scope.hideEmailField = function(){
        $("#inputEmailDiv").addClass("hidden");
        $("#inputPhoneDiv").removeClass("hidden");
        $scope.isEmailRequired = false;
    }

    $scope.UpdateData = function () {
        $http.put('/US1/'+$('#inputTopic').val()+'/'+$('#inputMessage').val()+'/'+$('#inputName').val()+'/'+$('#inputSurname').val()+'/'+$('#inputPhone').val()+'/'+$('#inputEmail').val()+'/'+$('#inputContactBy').val()+'/')
        .success(function (data, status, headers) {
            $("#formDiv").addClass("hidden");
            $("#confirmDiv").removeClass("hidden");
        })
    };

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
                 url: '/' + language
                }).then(function successCallback(response) {
                    $scope.nameList = response.data.contactUsNameMap;
                    $scope.topics = response.data.topics;
                    $scope.radioButtonList = response.data.contactUsRadioButtonMap;
                    $scope.confirmationNameList = response.data.contactUsConfirmationNameList;
                    $scope.errorList = response.data.errorMessagesMap;
                    $scope.buttons = response.data.buttonsMap;
                    document.title = response.data.contactUsNameMap.header;
                });
                 }
});



