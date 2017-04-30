package com.nagendra;
import com.mishra.StringLowerCase;
import com.nitin.StringUpperCase;
import com.pawar.Substraction;

public class Sample {

	public static void main(String[] args) {

	//	ArithmeticOperation operation = null;
		System.out.println("Hello Git 1st Program");
		System.out.println("Update from Nitin");
		System.out.println("Bas Kar Le Bhai");

		System.out.println("Update from Nitin");
		System.out.println("Bas Kar Le Bhai");
		
		System.out.println("hello how are you Nitin....");
		
		//New Substration Method
		Substraction sb=new Substraction();
		System.out.println("Diffrence : "+sb.sub(50, 30));
		
		//New Functionality String Upper Case
		StringUpperCase strUpper = null;
		strUpper = new StringUpperCase();
		String newStr = strUpper.stringUpperCase("nagendra kumar mishra");
		System.out.println(newStr);
		//New Functionality String Lower Case
			StringLowerCase strlow = null;
				strlow = new  StringLowerCase();
				 String str2= strlow.tolowerString("NITIN PAWAR IN LOWER CASE");
				System.out.println(str2);
		
		//100 lines of code start		
		System.out.println("Now I at my Home........");

	}  
}
