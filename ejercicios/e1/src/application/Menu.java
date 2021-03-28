package application;

import operations.Number;

public class Menu {

	String text;

	public Menu() {
	
		text = null;
	
	}

	public void display() {
		
		Input input = new Input();
		Number number = new Number();
		String option;
		
		do {

			showText();
			option = (input.setInput("Ej1> ")).strip();

			if (option.equals("1")){
			
				number.showIntegerNumbers();

			} else if (option.equals("2")){
			
			} else if (!option.equals("exit")) {
				
				System.out.println("No existe tal opción");

			}
			
		}while(!option.equals("exit"));

		input.close();

	}
	
	private void showText() {
		
		text = "";
		text += "1) Mostrar enteros\n";
		text += "2) Mostrar impares\n";
		
		System.out.println(text);
		
	}

}
