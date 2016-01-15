package com.erable;

import java.util.Scanner;

public class LectureNote03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		boolean res = leapYear();
		System.exit(n);
		Scanner keyboard = new Scanner(System.in);  // 引入包，然后还是仔细。ketboard是什么？
		String name = keyboard.nextLine();
	}

	public static boolean leapYear() {
		return false;
	}

	public static double m(double a, double b) {
		int marks[] = new int[20];
		String[] names = new String[10];
		return a + b;
	}

	public static String array(int size) { // string是什么，能不能写正确了。
		int array_name[] = new int[10];
		int x = array_name[0]; // okay
		array_name[8] = 42; // okay
		int z = array_name[5]; // exception, end at 9, -1
		for (int i = 0; i < array_name.length; i++) { // int i = 0 ; i++; i<array_name.length到底是什么鬼，能不能知道每个都是什么了。第一个初始化，第二个条件，第三个操作。
			System.out.println(i);
		}
		int scores[][] = new int[20][9];// two demintion table, 20rows, 9columns
		return null; // 返回值，函数定义了返回，java检查你没有写会报错。
	}
}
