
<div class="container" style="padding-top: 60px;">

	<div class="alert alert-success" ng-show="successMessage != ''">
	  <strong>Success!</strong> {{successMessage}}
	</div>
	<div class="alert alert-danger" ng-show="errorMessage != ''">
	  <strong>Error!</strong> {{errorMessage}}
	</div>
	
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">My Items</span></div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>Title</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th width="100"></th>
                        <th width="100"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="item in userItems" ng-style="{'background-color': item.bought ? '#eef586b3' : ''}">
                        <td>{{item.groceryItem.title}}</td>
                        <td>{{item.groceryItem.value}}</td>
                        <td>{{item.quantity}}</td>
                        <td><button type="button" ng-click="selectItem(item)" class="btn btn-primary custom-width"" data-toggle="modal" data-target="#itemModal">Detail</button></td>
                        <td><button type="button" ng-click="buyItem(item)" class="btn btn-success custom-width"" >Bought</button></td>
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
	        <h4 class="modal-title">{{selectedItem.groceryItem.title}}</h4>
	      </div>
	      <div class="modal-body">
	        <p>{{selectedItem.groceryItem.notes}}</p>
	        <p><strong>Price: </string>{{selectedItem.groceryItem.value}}</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-toggle="modal" data-target="#confirmationModal" data-dismiss="modal">Remove Item</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	<div class="modal fade" id="confirmationModal" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">{{selectedItem.groceryItem.title}}</h4>
	      </div>
	      <div class="modal-body">
	      	<p>Do you want to remove this item from your list?</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-success" ng-click="removeItem(selectedItem)" data-dismiss="modal">Yes</button>
	        <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
</div>