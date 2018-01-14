package setters;

class Duck {
	//private makes variables inaccessible outside of class
	//string and int here are instance variables
	//the error is because they are private
	
	 private String name;
	 private int age;
	
	public void setName(String name){
		
		//this.name is class variable = to local variable in (String name)
		this.name = name;
	}
	
	public void setAge(int newAge){
		age = newAge; 
	}
	
	public String getName() {
		return name;
	} 
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}

public class settersThis {
	public static void main(String[] args) {
		
	
	
	Duck duck1 = new Duck(); 
	
	//here setting the instance variable with equal sign
	//duck1.name = "delicious";
	//duck1.age = 20;
	//System.out.println(duck1.name);
	
	//here i'm calling a method
	duck1.setName("yummy");
	duck1.setAge(20);
	
	
	
	}
}

