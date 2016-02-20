    var app = angular.module('ContactUsScreen', ['ngMessages']);
    var language = document.cookie;


    app.controller('ContactUsScreenController', function($scope, $http) {

    //document.getElementById("inputPhone").value = "+";
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

    $http({
     method: 'GET',
     url: '/' + language
    }).then(function successCallback(response) {
        $scope.nameList = response.data.contactUsNameList;
        $scope.dropDownListName = response.data.dropDownListName;
        $scope.dropDownList = response.data.contactUsDropDownMenuList;
        $scope.radioButtonList = response.data.contactUsRadioButtonList;
        $scope.confirmationNameList = response.data.contactUsConfirmationNameList;
        $scope.errorList = response.data.errorMessagesList;

        document.title = $scope.nameList[0];
    });

    $scope.UpdateData = function () {
        $http.put('/US1/'+$('#inputTopic').val()+'/'+$('#inputMessage').val()+'/'+$('#inputName').val()+'/'+$('#inputSurname').val()+'/'+$('#inputPhone').val()+'/'+$('#inputEmail').val()+'/'+$('#inputContactBy').val()+'/')
        .success(function (data, status, headers) {
            $("#formDiv").addClass("hidden");
            $("#confirmDiv").removeClass("hidden");
        })
    };
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


