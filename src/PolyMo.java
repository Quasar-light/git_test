
public class PolyMo {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		// Polymorphism guarantees that we can use a child class
        // wherever a parent class is expected.
		//ex. of polyMo see notes for more info
		Plant plant2 = plant1;
		Plant plant3 = tree;
		
		plant2.grow();
		plant3.grow();
		 
		// The type of the reference decided what methods you can actually call;
        // we need a Tree-type reference to call tree-specific methods.
		tree.shedLeaves();
		//dnt work--when calling a method, wat matters is the type of the variable
		//plant3.shedLeaves();
		
		// Another example of polymorphism.
		doGrow(tree);
		
		}
	public static void doGrow(Plant plant){
		plant.grow();
	}

}
