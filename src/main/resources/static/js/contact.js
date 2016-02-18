    var app = angular.module('ContactUsScreen', ['ngMessages']);
    var language = document.cookie;

    app.controller('ContactUsScreenController', function($scope, $http) {
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
    });

    function hidePhoneField() {
        $("#phone").addClass("hidden");
        $("#email").removeClass("hidden");
    }

    function hideEmailField() {
        $("#email").addClass("hidden");
        $("#phone").removeClass("hidden");
    }
    function showEmailPhoneFields() {
        $("#phone").removeClass("hidden");
        $("#email").removeClass("hidden");
    }

    function submitForm() {
       $("#contactForm").addClass("hidden");
       $("#confirm").removeClass("hidden");
    }