package com.Simplilearn;

import java.util.Scanner;

public class ConstructorDemo {

	String name;
	int rollNo;
	
	public ConstructorDemo(String nav, int no)
	{
		this.name = name;
		this.rollNo = no;
	}
	
	public ConstructorDemo()
	{
		this.name = "Demo";
		this.rollNo = 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int rollNo = sc.nextInt();
		ConstructorDemo obj = new ConstructorDemo(name,rollNo);
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
		ConstructorDemo b = new ConstructorDemo("Shivam",3);
		System.out.println(b.name+" "+b.rollNo);
	}
}


