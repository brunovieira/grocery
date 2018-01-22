
<div class="container" style="padding-top: 60px;">

	<div class="alert alert-success" ng-show="successMessage != ''">
	  <strong>Success!</strong> {{successMessage}}
	</div>
	<div class="alert alert-danger" ng-show="errorMessage != ''">
	  <strong>Error!</strong> {{errorMessage}}
	</div>
	
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Grocery Items</span></div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>Title</th>
                        <th>Price</th>
                        <th width="100"></th>
                        <th width="100"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="item in groceryItems">
                        <td>{{item.title}}</td>
                        <td>{{item.value}}</td>
                        <td><button type="button" ng-click="addItem(item.id)" class="btn btn-success custom-width">Add</button></td>
                        <td><button type="button" ng-click="selectItem(item)" class="btn btn-primary custom-width"" data-toggle="modal" data-target="#itemModal">Detail</button></td>
                    </tr>
                    </tbody>
                </table>      
            </div>
        </div>
    </div>
    
    <div class="modal fade" id="itemModal" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">{{selectedItem.title}}</h4>
	      </div>
	      <div class="modal-body">
	        <p>{{selectedItem.notes}}</p>
	        <p><strong>Price: </string>{{selectedItem.value}}</p>
	      </div>
	      
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
</div>