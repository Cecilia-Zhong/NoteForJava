package com.erable;

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
 *  increment ++; decrement operator: --; eg. n++;/n--;
 *  n++ and ++n have the same effect, but it execute before the variable;
 *  n++ execute after the variable; the n one for single variable,not (x+y)++ nor number;
 *  double quote is string but signle quote is char type;
 */

//practise question in chapter 1
// 1. Java is not a drink.

//2,3
// create the class to contain the method 

public class textbook { // 首先这个主类(就是要运行mian函数的)名字要跟外面文件名字一样。ps：虽然你英文是好，仔细还是应该的。texbook是什么鬼？
	// 而且你也看到了，生成文件时候自动有当期类了的，你可是乱改出错了？

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi!");
		System.out.println("I like Java.");
		System.out.println("You like tea.");
		
		System.out.println("Hello World!"); //3
		
		int feet,inches;
		inches = 0;
		feet = 0; // 12
		int count = 0;
		double distance = 1.5; //13
		
		int distance_1,time;
		time = 0;
		distance_1 = 80*time; //14
		
		double interest,balance,rate; //15
		
		char a,b;
		a='b';
		System.out.println(a);
		b='c';
		System.out.println(b);
		a = b;
		System.out.println(a); //16 c 
		
		//17 (3*x)/(3*x+y)/((x+y)/7)/((3*x)/(z+2))
		System.out.println("(1/3)*3 is equal: "+(1/3)*3);
		//18: (1/3) *3 is equal to 0 
		
		//19: 2   1
		//20: 5 
		//21: a. double 52.0; b. both double outputs the type of double 
		double celsius = 20, fahrenheit = (9/5)* celsius + 32.0;
		//22 n == 3
		//23 n == 4 n == 3
		
		// ----------------------end of practise question 
		double m = 2.9;
		m = (int)m; //type casting, but int(2.9) is 2 not 3   你这个写的不对，首先没有m初始化，另一个牵连上面代码出错。
		int i = (int)5.5; // int i = 5.5; is illegal b/c #doesn't fit the type
		
		int n = 2;
		int valueProduced = 2 * (n++);
		System.out.println(valueProduced); //output is 4, n doesn't change yet;
		System.out.println(n); // output is 3, n has already changed  
		
		int valueProduced1 = 2 * (++n);
		System.out.println(valueProduced1); //output is 6, n change;
		System.out.println(n); // output is 3, n has already changed (++n) same as (n+1)
		
/* question 
 * 1. n++; and ++n; has the same effect ???
 * 2. 
 * 3. 
 */
//page 33 end of reading 		

	}
} // 好吧我看错了，你是纯手打的，我算是看出来了，最后的大括号都没有。
