angular.module('ContactUs', []){


.service('fbAuth', function($q, $firebase, $firebaseAuth, fbRef) {
  var auth;
  return function () {
      if (auth) return $q.when(auth);
      var authObj = $firebaseAuth(fbRef);
      if (authObj.$getAuth()) {
        return $q.when(auth = authObj.$getAuth());
      }
      var deferred = $q.defer();
      authObj.$authAnonymously().then(function(authData) {
          auth = authData;
          deferred.resolve(authData);
      });
      return deferred.promise;
  }
})
















.submitInfo function(){
    $http({
      method: 'PUT',
      url: '/ContactUs'},


}


$http({
  method: 'PUT',
  url: '/ContactUs'
}).then(function successCallback(response) {

  }, function errorCallback(response) {
s.
  });