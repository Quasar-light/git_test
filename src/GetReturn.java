class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int calculateYearsToRetirment() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
}

public class GetReturn {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "bence";
		person1.age = 27;
		person1.speak(); 
		
		int years = person1.calculateYearsToRetirment();
		
		System.out.println("Years till retirements: " + years);
		
		int age = person1.getAge();
		System.out.println("Bence is  " + age);

	}
}
