package com.erable;

import java.util.Scanner;

public class LectureNote03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		boolean res = leapYear();
		System.exit(n);
		Scanner keyboard = new Scanner(System.in);  // �������Ȼ������ϸ��ketboard��ʲô��
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

	public static String array(int size) { // string��ʲô���ܲ���д��ȷ�ˡ�
		int array_name[] = new int[10];
		int x = array_name[0]; // okay
		array_name[8] = 42; // okay
		int z = array_name[5]; // exception, end at 9, -1
		for (int i = 0; i < array_name.length; i++) { // int i = 0 ; i++; i<array_name.length������ʲô���ܲ���֪��ÿ������ʲô�ˡ���һ����ʼ�����ڶ���������������������
			System.out.println(i);
		}
		int scores[][] = new int[20][9];// two demintion table, 20rows, 9columns
		return null; // ����ֵ�����������˷��أ�java�����û��д�ᱨ��
	}
}
