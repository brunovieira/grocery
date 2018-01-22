'use strict';
 
angular.module('groceryApp').controller('UserItemsController',
    ['$scope', '$http', 'urls',  function( $scope, $http, urls) {
 
        $scope.userItems=[];
        $scope.selectedItem;
        getUserItems();
        
        $scope.successMessage = '';
        $scope.errorMessage = '';
        $scope.done = false;
        
        function getUserItems() {
	        $http.get(urls.USER_ITEMS_SERVICE_API)
	        .success(function(items) {
        			$scope.userItems = items;
        		}).error(function(error) {
        			$scope.errorMessage = error;
        		})
        }
        
        $scope.selectItem = function (item) {
	    		$scope.selectedItem = item;
	    }
        
        $scope.buyItem = function (item) {
        		item.bought = !item.bought;
        		
        		$http.put(urls.USER_ITEMS_SERVICE_API, item)
    	        		.success(function(itemUpdated) {
    	        			$scope.successMessage = item.groceryItem.title +" "+ (item.bought ? 'bought.' : 'not bought');
            		}).error(function(error) {
            			$scope.errorMessage = error;
            		})
	    }
        
        $scope.removeItem = function (item) {
	        $http.delete(urls.USER_ITEMS_SERVICE_API + item.id)
	        .success(function(response) {
	        		$scope.successMessage = item.groceryItem.title + ' removed from your list.';	        		
	        		$('#itemModal').modal({
        			  show: false
        			});
	        		$scope.userItems = $scope.userItems.filter(function(userItem) {
	        		    return userItem.id !== item.id;
	        		});
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