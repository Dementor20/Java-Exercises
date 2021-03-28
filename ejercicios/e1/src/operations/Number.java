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

}
