package com.Simplilearn;

import java.io.File;
import java.io.IOException;

public class TryCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Desktop//jmg.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File is succesfully created"); 
			}
			else {
				System.out.println("File is already exist");
			}
		}
		catch(IOException e) {
			System.out.println("File successfully handled");
		}
	}

	}


