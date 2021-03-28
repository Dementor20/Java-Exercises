package application;

import java.util.ArrayList;
import operations.ReverseWords;

public class Menu {

	String text;
	Input input;
	
	public Menu() {
	
		text = null;
		input = new Input();
	
	}

	public void display() {
		
		String option;
		
		do {

			showText();

			option = (input.setInput("Ej2> ")).strip();

			if (option.equals("inverse")){
				
				reverse();

			} else if (!option.equals("exit")) {
				
				System.out.println("No existe tal opción");

			}
			
		} while(!option.equals("exit"));

		input.close();

	}
	
	private void showText() {
		
		text = "Palabras inversas\n\n";
		
		System.out.println(text);
		
	}
	
	private void reverse() {
		
		int x;
		ArrayList<String> words = new ArrayList<String>();
		String word;
	
		System.out.println("Ingrese palabras: \n");

		for (x = 0; x < 2; x++){
			
			word = input.setInput("> ");
			
			words.add(word);

		} 
		
		ReverseWords.reverseString(words);
		
	}

}
