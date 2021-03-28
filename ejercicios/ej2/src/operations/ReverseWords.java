package operations;

import java.util.ArrayList;

public class ReverseWords {

	public static void reverseString(ArrayList<String> words){
		
		int i,j;
		String new_word;

		for (i = 0; i < words.size(); i++){
			
			new_word = "";

			for (j = words.get(i).length()-1; j >= 0 ; j--){
			
				new_word += (words.get(i)).charAt(j);

			}

			System.out.println(new_word);
		
		}
	
	}
	
}
