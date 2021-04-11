package application;

import java.util.Scanner;

public class Input{
	
	private Scanner scan;	

	public Input(){
	
		scan = new Scanner(System.in);
		
	}

	public String setInputString(String text){
		
		System.out.print(text);
		
		String input = scan.nextLine();

		return input;

	}
	
	public int setInputInt(String text){
		
		boolean isWrong = true;
		
		int result = 0;
		
		while (isWrong) {
			
			try {
				
				System.out.print(text);
				
				result = Integer.parseInt(scan.nextLine());
				
				isWrong = false;
				
				
				
			} catch (Exception e) {
				
				System.out.println("Dato inválido. Inténtelo nuevamente...");
				
			}
			
		}
		

		return result;

	}
	
	/* Esto es redundante pero no tenía ganas de seguir con una versión nueva, pensaré uno luego :P */
	public double setInputDouble(String text){
		
		boolean isWrong = true;
		
		double result = 0;
		
		while (isWrong) {
			
			try {
				
				System.out.print(text);
				
				result = Double.parseDouble(scan.nextLine());
				
				isWrong = false;
				
				
				
			} catch (Exception e) {
				
				System.out.println("Dato inválido. Inténtelo nuevamente...");
				
			}
			
		}
		

		return result;

	}
	
	public void close(){
	
		scan.close();
	
	}

}
