package com.erable;

import java.util.*; // ������д�Ĳ��ԣ�import java.util*;�ڶ���λ�ã�pythonʱ��͸���˵����Ӧ��д���java����Ҫȥ���ϸ񣬱�������λ�á�

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
		System.out.print("enter yout name(first and last):" );// ��ķֺ��أ��ⲻ��python������ÿ�仰����Ҫ�зֺš� // why it just the print, not println;
		keyword.next(); // ΪʲôҪд��String��: String;
		keyword.nextLine(); // �аɣ�û�д�����ʾ���������ܲ��ܳ���ϸ�㣬nextline()����Ҳ����˼д������
		
		//???? un-finish 
		keyword.hasNextInt(); // true it is an int;
		
		if (!keyword.hasNext()){  // ���Keyin��֪������Ҫдʲô���Լ��İɡ�
			System.out.println("no first name"); // ��㣬�Ҷ������ˣ���Ͷ��Լ���Ӣ����ô����ô~~Stsrem��ʲô��
			return;
			
			// for (;;){// infinity, exit until break
			//
			// }
			// �����for�ǿյģ���Ȼ�ᱨ����ʦ���д���ṹ�����������������ֱ�ӳ�����������
	}

} 
}
