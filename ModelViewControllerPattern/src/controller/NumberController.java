package controller;

import model.NumberModel;
import service.NumberService;
import view.NumberView;

public class NumberController {

	protected NumberModel numberModel = new NumberModel();
	protected NumberView numberView = new NumberView();
	protected NumberService numberService = new NumberService();
	
	public void passData(){ 
		numberView.createView(numberService.formatData(numberModel.getNumbers()));
	}
	
	
	
	
}


 