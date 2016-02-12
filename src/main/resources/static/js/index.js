function Hello($scope, $http) {
    $http.get('http://localhost:8080/lt/').
        success(function(data) {
            $scope.lt = data;
        });
}