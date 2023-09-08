package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		//model = CalculatoModel 가져오기
		CalculatorModel model1 = new CalculatorModel();
		
		//view = CalculatorView 가져오기
		CalculatorView view1 = new CalculatorView();
		
		//Controller CalculatController 가져오기
		CalculatorController controller = new CalculatorController(model1, view1);
		
		controller.run();
	}

}
