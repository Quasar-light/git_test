class Person {
	//Instance variable (data or "state")
	String name;
	int age;
}




public class Class {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37; 
		
		Person person2 = new Person();
		person2.name = "Quasar Light";
		person2.age = 22;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		/*below sysout blank bc wanted to create
		 * space in betwen names/age
		 */
		System.out.println("       ");
		System.out.println(person2.name);
		System.out.println(person2.age);
				
	}

}
