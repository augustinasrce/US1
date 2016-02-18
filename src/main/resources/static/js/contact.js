    var app = angular.module('ContactUsScreen', ['ngMessages']);

    app.controller('ContactUsScreenController', function($scope, $http) {
           $http({
             method: 'GET',
             url: '/lt'
           }).then(function successCallback(response) {
               $scope.nameList = response.data.contactUsNameList;
               $scope.dropDownListName = response.data.dropDownListName;
               $scope.dropDownList = response.data.contactUsDropDownMenuList;
               $scope.radioButtonList = response.data.contactUsRadioButtonList;

               document.title = $scope.nameList[0];
                    });

     $scope.UpdateData = function () {
           var data = $.param({
           dropDownItem: $scope.dropDownItem,
           textMessage: $scope.textMessage,
           name: $scope.name,
           surname: $scope.surname,
           phoneNr: $scope.phoneNr,
           email: $scope.email,
           answerType: $scope.answerType
           });

           $http.put('/US1')
           .success(function (data, status, headers) {
           $scope.ServerResponse = data;
           })
//           .error(function (data, status, header, config) {
//           $scope.ServerResponse =  htmlDecode("Data: " + data +
//           "\n\n\n\nstatus: " + status +
//           "\n\n\n\nheaders: " + header +
//           "\n\n\n\nconfig: " + config);
//           });
                };
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