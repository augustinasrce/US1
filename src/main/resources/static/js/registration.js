    var app = angular.module('RegistrationScreen', ['ngMessages']);
    var language = document.cookie;

 app.controller('RegistrationScreenController',  function($scope, $http) {
    $http({
        method: 'GET',
        url: '/'+ language
    }).then(function successCallback(response) {
        document.getElementById("inputPhone").value = "+";
        $scope.nameList = response.data.registrationNameTags;
        $scope.topics = response.data.topicList;
        $scope.bankDivisions = response.data.bankDivisionList;
        $scope.errorList = response.data.errorMessagesList;

        document.title =  response.data.registrationNameTags.title;
    });


    $scope.submitForm = function () {
        $http.put('/registration/')
        //+$('#inputTopic').val()+'/'+$('#inputMessage').val()+'/'+$('#inputName').val()+'/'+$('#inputSurname').val()+'/'+$('#inputPhone').val()+'/'+$('#inputEmail').val()+'/'+$('#inputContactBy').val()+'/')
        .success(function (data, status, headers) {
            $("#formDiv").addClass("hidden");
            $("#confirmDiv").removeClass("hidden");
        })
    };

 });



