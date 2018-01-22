'use strict';
 
angular.module('groceryApp').controller('GroceryItemsController',
    ['$scope', '$http', 'urls',  function( $scope, $http, urls) {
 
        $scope.groceryItems=[];
        $scope.selectedItem;
        
        getGroceryItems();
        
        $scope.successMessage = '';
        $scope.errorMessage = '';
        $scope.done = false;
        
        $scope.addItem = function (id) {
        		$http.post(urls.USER_ITEMS_SERVICE_API, id)
	        .success(function(items) {
        			$scope.successMessage = 'Item added to your list.';
        		}).error(function(error) {
        			$scope.errorMessage = error;
        		})
        }
        
        $scope.selectItem = function (item) {
        		$scope.selectedItem = item;
        }
        
        function getGroceryItems() {
	        $http.get(urls.GROCERY_ITEMS_SERVICE_API)
	        .success(function(items) {
        			$scope.groceryItems = items;
        		}).error(function(error) {
        			$scope.errorMessage = error;
        		})
        }
 
        function reset(){
            self.successMessage='';
            self.errorMessage='';
            self.user={};
            $scope.myForm.$setPristine(); //reset Form
        }
    }
    ]);