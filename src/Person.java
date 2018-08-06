
public class Person {
	//Declaring all attributes
	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight;
	private int feet;
	private int inches;
	
	//Below are the Getter and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getLastNameInitial() {
		return lastNameInitial;
	}
	public void setLastNameInitial(char lastNameInitial) {
		this.lastNameInitial = lastNameInitial;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	

	//Constructors
	
		//Contains: firstName, lastName, weight, feet, inches 
	Person(String firstName, String lastName, double weight, int feet, int inches){
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}
		//Contains: firstName, lastNameInitial, weight, feet, inches 
	Person(String firstName, char lastNameInitial, double weight, int feet, int inches){
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet; 
		this.inches = inches; 
	}
		//Contains: firstName, lastName, lastNameInitial, age, weight, feet, inches 
	Person(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet, int inches){
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feet = feet;	
		this.inches = inches;
	}
	
	//Instance Method
	public String calculateBMI(double BMI){
		String BMILevel;
		int heightInInches = ((this.feet * 12) + this.inches);
		BMI = (this.weight * 703)/(heightInInches * heightInInches);
		
		if (BMI < 18.5) {
			BMILevel = "Underweight";
		}
		else if (BMI > 18.5 && BMI < 24.9){
			BMILevel = "Normal";
		}
		else if (BMI > 25 && BMI < 29.9) {
			BMILevel = "Overweight";
		}
		else {
			BMILevel = "Obese";
		}
		return BMI + " : " + BMILevel;
	
 	}
	
	//Instance Method to print 
		//(String firstName, String lastName, double weight, int feet, int inches)
	public String toString(){
		return("First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Weight: " + this.weight + ", Feet: " + this.feet + ", Inches: " + this.inches);
	}
		//String firstName, char lastNameInitial, double weight, int feet, int inches)
	public String toString2(){
		return("First Name: " + this.firstName + ", Last Name Initial: " + this.lastNameInitial + ", Weight: " + this.weight + ", Feet: " + this.feet + ", Inches: " + this.inches);
	}
		//(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet, int inches)
	public String toString3(){
		return("First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Last Name Initial: " + this.lastNameInitial + ", Age: " + this.age + ", Weight: " + this.weight + ", Feet: " + this.feet + ", Inches: " + this.inches);
	}

}
