var app = angular.module('RegistrationScreen', ['ngMessages']);
var language = document.cookie;

 app.controller('RegistrationScreenController',  function($scope, $http) {

 $scope.validValues = ['+','1','2','3','4','5','6','7','8','9','0'];

    $http({
            method: 'GET',
            url: '/sql'
          }).then(function successCallback(response) {
                            $scope.registrationInfo = response.data;
                              });


    $http({
        method: 'GET',
        url: '/'+ language
    }).then(function successCallback(response) {
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

    $scope.registration = function(){
        $("#formDiv").addClass("hidden");
        $("#overviewDiv").removeClass("hidden");
    }
 });

 app.directive('myValidator', function ($parse) {
     return {
         scope: {
           validValues: '=validValues'
         },
         link: function(scope, elm, attrs) {
               elm.bind('keypress', function(e) {
               var key = e.keyCode || e.charCode;

         if(key == 8)
             return true;

                 var char = String.fromCharCode(e.which || e.charCode || e.keyCode),
                   matches = [];
                 angular.forEach(scope.validValues, function(value, key) {
                   if (char === value) matches.push(char);
                 }, matches);
                 if (matches.length == 0) {
                   e.preventDefault();
                   return false;
                 }
               });
         }
     }
 });



