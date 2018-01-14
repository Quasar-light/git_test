class Machine {
	private String name;
	private int code;
	
	public Machine(){
		this("Bence",0);
		System.out.println("constructor is running ");
		
	}
	public Machine(String name){
		this(name,0);
		System.out.println("second constructor is running ");
		
		this.name = name;
	}
	public Machine(String name, int code){
		System.out.println("third constructor is running ");
		this.name = name;
		this.code = code;
		
		
	}
}

public class constructors {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Quasar");
		
		Machine machine3 = new Machine("light,7");
		
		
		
		
		
	}

}
