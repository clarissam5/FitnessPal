
public class Fitness {
	//Main function inside class 
	public static void main(String args[]){
		
		//Creating (4) person objects 
		//Fname, LNameInitial, Weight, Feet, Inches
		Person person1 = new Person("Tom", 'H', 152.5, 5, 6);
			//print First Name attribute and BMI method
			System.out.println(person1.getFirstName() + ": " + person1.calculateBMI(0));
		
		//Fname, Lname, LNameInitial, Age, Weight, Feet, Inches
		Person leslie = new Person("Leslie", "Knope", 'K', 32, 122.9, 4, 11);
			//print First Name attribute and BMI method
			System.out.println(leslie.getFirstName() + ": " + leslie.calculateBMI(0));
		
		///Fname, Lname, weight, feet, inches
		Person man = new Person("Ron", "Swanson", 222.2, 6, 0);
			//print First Name attribute and BMI method
			System.out.println(man.getFirstName() + ": " + man.calculateBMI(0));
		
		//FName, LName, Weight, Feet, Inches
		Person woman = new Person("April", "Ludhate", 110.5, 5, 5);
		//print First Name attribute and BMI method
			System.out.println(woman.getFirstName() + ": " + woman.calculateBMI(0));
			
	//See all Attributes of all Person Objects  
	System.out.println("\n" + "Extra Credit" + "\n");		
			System.out.println(person1.toString2());
			System.out.println(leslie.toString3());
			System.out.println(man.toString());
			System.out.println(woman.toString());
			
	}
}

