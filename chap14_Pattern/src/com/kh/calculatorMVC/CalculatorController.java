package com.kh.calculatorMVC;

public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
}

	public void run() {
		int userInput = view.getUserInput();
		model.setNumer(userInput);
		int result = model.calculateSquare();
		view.displayResult(result);
		//System.out.println(result);

	}

}
