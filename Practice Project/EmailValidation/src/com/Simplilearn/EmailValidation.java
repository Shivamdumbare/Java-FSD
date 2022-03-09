package com.Simplilearn;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean flag = false;
		String emails[] = new String[5];
		emails[0] = "dumbare77@gmail.com";
		emails[1] = "hemant143@gmail.com";
		emails[2] = "Khaire23@gmail.com";
		emails[3] = "prasad123@gmail.com";
		emails[4] = "Lalit@gmail.com";
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true)
		{
			flag = false;
			System.out.println("Enter your Email: ");
			String userEmail = sc.next();
			
			for(String email:emails)
			{
				if(userEmail.matches(email))
				{
					System.out.println("Welcome back "+userEmail);
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Invalid User");
			}
			System.out.println("Do you want to continue 1.YES 2.NO");
			choice = sc.nextInt();
			if(choice==2)
			{
				break;
			}
		}
	}

	}

