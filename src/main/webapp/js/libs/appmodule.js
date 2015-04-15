(function () {
    var app = angular.module('modone', ['ngRoute']);

    app.config(function ($routeProvider) {
        $routeProvider

                // route for the about page
                .when('/new', {
                    templateUrl: 'registro.html'

                })

                // route for the contact page
                .when('/list', {
                    templateUrl: 'catalogo.html'

                });

    });



})();





