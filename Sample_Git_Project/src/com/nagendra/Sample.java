package com.nagendra;

import com.mishra.ArithmeticOperation;
import com.pawar.Substraction;

public class Sample {

	public static void main(String[] args) {

		ArithmeticOperation operation = null;
		System.out.println("Hello Git 1st Program");
		System.out.println("Update from Nitin");
		System.out.println("Bas Kar Le Bhai");

		System.out.println("Update from Nitin");
		System.out.println("Bas Kar Le Bhai");
		
		// Adding New Functionality
		operation = new ArithmeticOperation();
		System.out.println("Add Operation : "+operation.operataion(200, 300));
		
		//New Substration Method
		
		Substraction sb=new Substraction();
		System.out.println("Diffrence : "+sb.sub(50, 30));
	}
}
