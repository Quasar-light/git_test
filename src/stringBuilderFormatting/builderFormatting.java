package stringBuilderFormatting;

public class builderFormatting {
	public static void main(String[] args) {
		
		//inefficient
		String info = "";
		info += "Hi, my name is Tee.";
		info += " ";
		info += "I'm a string builder.";
		
		System.out.println(info);
		
		//this process is more efficient
		//dnt have to provide initial value between () but can
		StringBuilder sb = new StringBuilder("");
		
		sb.append("I need to lose weight.");
		sb.append(" ");
		sb.append("Workout, eat less, you can lose weight");
		
		System.out.println(sb.toString());
		
		//another simpler way
		StringBuilder t = new StringBuilder();
		
		t.append("I'm awesome.")
		.append(" ")
		.append("I want to be a programmer");
		System.out.println(t.toString());
		
		////Formatting/////////////////
		System.out.println("Here is some text.\tThat was a tab\nNow we have a new line");
		//\t =tab \n =new line
		
		System.out.printf("Total cost %10d; quantity of %d\n", 5, 120);
		//%d will be replaced by the arg numb
		//numb between %d = how many spaces
		
		for(int i=0; i <20; i++){
			System.out.printf("%-2d: %s\n", i, "here is some text" );
			//%s is for string args
		}
		//formatting floating point value
		System.out.printf("Total value: %.2f\n", 5.6859);
		
		System.out.printf("Total value: %6.1f\n", 345.6785);
				
				

	}
}
