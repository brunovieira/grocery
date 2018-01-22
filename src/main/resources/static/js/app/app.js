var app = angular.module('groceryApp',['ui.router']);
 
app.constant('urls', {
    BASE: 'http://localhost:8080',
    GROCERY_ITEMS_SERVICE_API : 'http://localhost:8080/api/grocery-items/',
    USER_ITEMS_SERVICE_API : 'http://localhost:8080/api/user-items/',
});
 
app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
 
        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'partials/groceryItems',
                controller:'GroceryItemsController',
                controllerAs:'ctrlGrocery'
            });
        $stateProvider
        		.state('myList', {
            url: '/my-list',
            templateUrl: 'partials/userItems',
            controller:'UserItemsController',
            controllerAs:'ctrlUser'
        });
        
        $urlRouterProvider.otherwise('/');
    }]);

