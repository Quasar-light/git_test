package toString;

class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name){
		this.id =id;
		this.name = name;
	}
	
	public String toString(){
		//-4 formats to the left
		//return String.format("%-4d, %s", id, name);
		
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		
		return sb.toString(); 
	} 
}

public class toString {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog(3, "Frogger");
		Frog frog2 = new Frog(7, "jack");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
