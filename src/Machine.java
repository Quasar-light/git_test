import java.util.Scanner;


public class Machine {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, My name is Tee and I love Simen");
		
		String FirstTry = "I'm so in love with Simen, I want to live out the rest of my life with him\n";
		System.out.println(FirstTry);
		
		Scanner gamble = new Scanner(System.in);
		System.out.println("Try your luck!\n \nEnter a number");
		int hearts = gamble.nextInt();
		
		/*int hearts = 2;
		while(hearts <= 6 ){
			System.out.println("He loves me" + hearts);
			hearts ++;
		
			int breaks = 1;
			if(breaks <= 3){
				System.out.println("He loves me not" + breaks );
			}
		}*/
		
		while(hearts %2 == 0){
			System.out.println("He loves me " + hearts);
			hearts++;
		}
		while (hearts %2 ==1){
			System.out.println("He loves me not" + h);
			
		}
		
	}
	
}
