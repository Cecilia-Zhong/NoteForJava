/* chapter 1 
	 *  name of class containing the main method 
	 *  assuming all files in one directory: folders 
	 *  name of a variable: identifier
	 *  case-sensitive: distinguishes btw upper-case and lower-case
	 *  special class of identifier: keywords/reserved words 
	 *  each declaration ends with semicolon 
	 *  primitive type: basic types 
	 *  ex: type variable : int maxNumber = 4;
	 *  ??the type for single characters and can store common Unicode characters 
	 *  ??floating point is double 
	 *  variable OP = expression 
	 *  count &/+/-/* = 2 ===> count = count &/+/-/* 2
	 *  assign a value type: byte -> short -> int -> long -> float -> double 
	 *  constant or literal are name for one specific value, it doesn't change 
	 *  ?? constant and literal usage
	 *  exponent: means multiply by 10 to the power; e may be either upper- or lower- 
	 *  ex: 5.89e-4
	 *  'A' is the type char; "A" is the type of string
	 *  floating-points numbers are, in effect,stored as approximate quantities
	 *  Integers are store exact quantities 
	 *  
	 */

	//question in chapter 1
	// 1. Java is not a drink.

	//2,3
	// create the class to contain the method 

package menu;

public class texbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi!");
		System.out.println("I like Java.");
		System.out.println("You like tea.");
		
		System.out.println("Hello World!");//3
		
		int feet,inches;
		inches = 0;
		feet = 0; // 12
		int count = 0;
		double distance = 1.5;//13
		
		int distance_1,time;
		time = 0;
		distance_1 = 80*time;//14
		
		double interest,balance,rate;//15
		
		char a,b;
		a='b';
		System.out.println(a);
		b='c';
		System.out.println(b);
		a = b;
		System.out.println(a);//16 c 
		
		//17 (3*x)/(3*x+y)/((x+y)/7)/((3*x)/(z+2))
		System.out.println("(1/3)*3 is equal: "+(1/3)*3);
		//18: (1/3) *3 is equal to 0 
		
		//19: 2   1
		//20: 5 
		//21: a. double 52.0; b. both double outputs the type of double 
		double celsius = 20, fahrenheit = (9/5)* celsius + 32.0;
		//end page 29/63 textbook 
		
		
				
		
		

	}
