package com.erable;

import java.util.*; // 首先你写的不对，import java.util*;第二，位置，python时候就跟你说过，应该写哪里，java语言要去更严格，必须放这个位置。

public class LectureNote02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "January";
		char c = month.charAt(2);
		
		// String sub = month.charAt(2,5);
		
		String x = "abc";
		String y = "def";
		// value of x + y? yes 
		
		// output as string even it is integer + string 
		int a = 6;
		int b = 9;
		System.out.println("The total is:" + a + b ); // The total is 96
		System.out.println(a + b + "The total is:"); // 15 The total is, run from left to right
		
		String c1 = "apple";
		String d = "banana";
		c1.compareTo(d); // come out as the boolean answer if two output, but there are three in returns here < = >;
		
		Scanner keyword = new Scanner(System.in); // create a Scanner object;
		System.out.print("enter yout name(first and last):" );// 你的分号呢？这不是python，必须每句话结束要有分号。 // why it just the print, not println;
		keyword.next(); // 为什么要写个String？: String;
		keyword.nextLine(); // 行吧，没有代码提示，但是你能不能抄仔细点，nextline()，你也好意思写出来。
		
		//???? un-finish 
		keyword.hasNextInt(); // true it is an int;
		
		if (!keyword.hasNext()){  // 这个Keyin不知道你是要写什么。自己改吧。
			System.out.println("no first name"); // 姐姐，我都无语了，你就对自己的英文这么自信么~~Stsrem是什么鬼？
			return;
			
			// for (;;){// infinity, exit until break
			//
			// }
			// 你这个for是空的，当然会报错，老师随便写个结构，是让你填东西，你别就直接抄下来啊……
	}

} 
}
