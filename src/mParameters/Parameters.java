package mParameters;

class Robot {
	
	public void speak(String samSpeak) {

		System.out.println(samSpeak);
	}
	
	public void jump(int height){
		System.out.println("jumping: " + height);
		
	}
	
	public void move(String direction, double distance){
		System.out.println("moving " + distance + " in direction " + direction);
	}

}

public class Parameters {
	public static void main(String[] args) {
		
		Robot sam = new Robot();
		sam.speak("hi, i'm sam."); 
		
		sam.jump(177);
		
		sam.move("left", 1.3);
		
		String greeting = "hello";
			sam.speak("greeting");	
			
			sam.speak("blahblah");
			
			sam.jump(2);
			sam.move("up", 1.9);
	}
}
