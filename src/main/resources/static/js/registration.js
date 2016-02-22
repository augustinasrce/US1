var app = angular.module('RegistrationScreen', ['ngMessages']);
var language = document.cookie;

 app.controller('RegistrationScreenController',  function($scope, $http) {

 $scope.validValues = ['+','1','2','3','4','5','6','7','8','9','0'];
 $scope.plus = ['+'];



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


    $http({
        method: 'GET',
        url: '/'+ language
    }).then(function successCallback(response) {
        $scope.nameList = response.data.registrationNameTags;
        $scope.topics = response.data.topicList;
        $scope.bankDivisions = response.data.bankDivisionList;
        $scope.confirmationNameList = response.data.registrationConfirmationNameList;
        $scope.errorList = response.data.errorMessagesList;

        document.title =  response.data.registrationNameTags.title;
    });



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
            $("#formDiv").addClass("hidden");
            $("#confirmDiv").removeClass("hidden");
        })
    };

    $scope.registration = function(){
        $("#overviewDiv").addClass("hidden");
        $("#formDiv").removeClass("hidden");
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

 });


