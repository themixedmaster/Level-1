public class PetPlatypus {
	private String name;
	
	PetPlatypus(String make){
		this.name = make;
	}
	
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus BeaverDuck = new PetPlatypus("Beaver Duck");
		//2. Call the sayHi method
		BeaverDuck.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}
