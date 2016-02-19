    var app = angular.module('ContactUsScreen', ['ngMessages']);
    var language = document.cookie;


    app.controller('ContactUsScreenController', function($scope, $http) {

            $scope.isEmailRequired = true;

            $scope.hideEmailField = function(){
                                $("#inputEmailDiv").addClass("hidden");
                                $("#inputPhoneDiv").removeClass("hidden");
                                $scope.isEmailRequired = false;
                                }

           $http({
             method: 'GET',
             url: '/' + language
           }).then(function successCallback(response) {
               $scope.nameList = response.data.contactUsNameList;
               $scope.dropDownListName = response.data.dropDownListName;
               $scope.dropDownList = response.data.contactUsDropDownMenuList;
               $scope.radioButtonList = response.data.contactUsRadioButtonList;
               $scope.confirmationNameList = response.data.contactUsConfirmationNameList;

               document.title = $scope.nameList[0];
           });

     $scope.UpdateData = function () {
           $http.put('/US1/'+$('#inputTopic').val()+'/'+$('#inputMessage').val()+'/'+$('#inputName').val()+'/'+$('#inputSurname').val()+'/'+$('#inputPhone').val()+'/'+$('#inputEmail').val()+'/'+$('#inputContactBy').val()+'/')
           .success(function (data, status, headers) {
                $scope.ServerResponse = data;
            })
        };




    });


