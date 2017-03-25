public class Freinds {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
			Classmate David = new Classmate();
			Classmate Aaron = new Classmate();
			Classmate RJ = new Classmate();
			Classmate Bob = new Classmate();
			Classmate Christian = new Classmate();
    	//4. set descriptions for each Classmate
			Christian.setDescription("Christian- Missing right now.");
			David.setDescription("David- Has a small laptop.");
			Aaron.setDescription("Aaron- Might secretly be deadpool.");
			RJ.setDescription("RJ- Was turned into a plant once.");
			Bob.setDescription("Bob- Is that her actual name?");
   	 //5. Use your getter to print out each description
   	 System.out.println(Bob.getDescription());
   	 System.out.println(David.getDescription());
   	 System.out.println(RJ.getDescription());
   	 System.out.println(Christian.getDescription());
   	 System.out.println(Aaron.getDescription());
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
	public void setDescription(String description){
		this.description = description;
	}
	//2. create a getter that gets a description of this person
	public String getDescription(){
		return description;
	}
}
