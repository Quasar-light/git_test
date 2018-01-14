package array2;

public class A2 {
	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		System.out.println(words[2]);
		
		String[] fruits = {"apples", "banana", "mango" };
		
		for(String fruit: fruits) {
			
			System.out.println(fruit);
			//used fruit not fruits in the sysout for the loop
			
		}
	}

}
