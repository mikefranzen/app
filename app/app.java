/**
 * 
 */
package app;

/**
 * @author mikefranzen
 * Inside the main method, create one variable for each of the following real-life 
 * examples and assign them values choose the best data type for the values
 */
public class app {

	/**
	 * @param args
	 * Item price 
	 * Amount of money in wallet 
	 * Number of friends 
	 * Age in years (as a whole number) 
	 * First name 
	 * Last name 
	 * Middle initial
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 49.99;
		float wallet = 500;
		float friends = 201;
		int age = 40;
		String fname = "mike";
		String lname = "franzen";
		char mi = 'c';
		
		System.out.println("The item price is $" + price);
		System.out.println("Amount of money in wallet $" + wallet);
		System.out.println("Number of friends is " + friends);
		System.out.println("Age in years is " + age);
		System.out.println("First name is " + fname);
		System.out.println("Last name is " + lname);
		System.out.println("Middle initial is " + mi);
		
		// Create the following variables by performing operations (addition, subtraction, concatenation) 
		// on the variables created in the previous step
		// New amount of money in wallet after buying the item
		// Number of friends you’ve made each year based on your age variable and your number of friends variable
		// Full name based on first name, middle initial, and last name
		double newWallet = wallet-price;
		double friendsPerYear = friends/age;
		String fullName = fname+" "+mi+" "+lname;

		System.out.println("New amount of money in wallet after buying the item is $" + newWallet);
		System.out.println("Number of friends you’ve made each year " + friendsPerYear);		
		System.out.println("Full name is " + fullName);
		
	}
	

}
