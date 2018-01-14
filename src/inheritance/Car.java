package inheritance;

public class Car extends Machine{
	
public void wipers (){
	
	System.out.println("Wipers on");
}

//@Override put @override over override code to check if it actually is
public void start() {
	System.out.println("Car started");
}

public void showInfo(){
	System.out.println("Car name: " + name);
}



}
