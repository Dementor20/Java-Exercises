package operations;

public class Number {
	
	public void showIntegerNumbers() {

		int index; 
		
		String line = "";	

		for (index = 0; index < 10; index++) {
		
			line += Integer.toString(index) + " ";
		
		}

		System.out.println(line);

	}

	public void showOddNumbers(){
	
		int index;
		String line = "";

		for (index = 1; index < 20; index = index + 2){
			
			line += Integer.toString(index) + " ";
		
		}

		System.out.println(line);
	
	}

}
