<!DOCTYPE html>
 
<html lang="en" ng-app="groceryApp">
    <head>
        <title>${title}</title>
        <link href="css/bootstrap.css" rel="stylesheet"/>
        <link href="css/app.css" rel="stylesheet"/>
    </head>
    <body>
    		
    		<nav class="navbar navbar-default navbar-fixed-top">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#">Grocery</a>
		    </div>
		    
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li><a ui-sref="home" ui-sref-active="active" >Home</a></li>
		        <li><a ui-sref="myList" ui-sref-active="active">My List</a></li>
		      </ul>
		    </div>
		  </div>
		</nav>
 
        <div ui-view></div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/lib/angular.min.js" ></script>
        <script src="js/lib/angular-ui-router.min.js" ></script>
        <script src="js/lib/bootstrap.min.js" ></script>
        <script src="js/app/app.js"></script>
        <script src="js/app/controller/GroceryItemsController.js"></script>
        <script src="js/app/controller/UserItemsController.js"></script>
        
    </body>
</html>