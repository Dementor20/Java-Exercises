package application;

public class Menu {

	private String title;
	private String description;
	private Input input;
	
	public Menu() {
	
		title = null;
		description = null;
		input = new Input();
	
	}
	
	private void setTitle(String title) {
		
		this.title = title;
		
	}
	
	private void setDescription(String description) {
		
		this.description = description;
		
	}
	
	private void showTitle() {
		
		setTitle("BASURA 05");
		
		System.out.println(title);
		
	}
	
	private void showDescription() {
		
		setDescription("Programa de mierda número 4...");
		
		System.out.println(description);
		
	}

	public void display() {
		
		String option;
		
		do {

			showTitle();
			showDescription();
			
			option = input.setInputString("Ej4(module/superMejoradoxd)> ");

			if (option.equals("start")){
				
				start();

			} else if (!option.equals("exit")) {
				
				System.out.println("No existe tal opción");

			}
			
		} while(!option.equals("exit"));

		input.close();

	}
	
	private void start() {
		
		int SIZE = 3;
		
		int mainNumber = input.setInputInt("Número principal: ");
		int arrayNumbers[] = setNumbers(SIZE);
		
		saveGreaters(mainNumber,arrayNumbers);
		
	}
	
	private int[] setNumbers(int size) {
		
		int index,number;
		int arrayNumbers[] = new int[size];
		
		for (index = 0; index < arrayNumbers.length; index++) {
			
			number = input.setInputInt("Número[" + index + "]: ");
			arrayNumbers[index] = number; 
			
		}
		
		return arrayNumbers;
		
	}
	
	private void saveGreaters(int magicNumber,int array[]) {
		
		int index;
		
		for (index = 0; index < array.length; index++) {
			
			showMagicNumber(magicNumber,array[index]);
			
		}
		
	}
	
	private void showMagicNumber(int magicNumber, int special) {
		
		if (special > magicNumber) {
			
			System.out.println(special);
			
		}
		
	}


}
