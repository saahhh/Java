package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		//model = CalculatoModel ��������
		CalculatorModel model1 = new CalculatorModel();
		
		//view = CalculatorView ��������
		CalculatorView view1 = new CalculatorView();
		
		//Controller CalculatController ��������
		CalculatorController controller = new CalculatorController(model1, view1);
		
		controller.run();
	}

}
