package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       char choice;
       
       do {
    	   System.out.println("Enter 1st number: ");
    	   double num1=sc.nextDouble();
    	   
    	   System.out.println("Enter 2nd number: ");
    	   double num2=sc.nextDouble();
    	   
    	   System.out.println("Enter operator [+,-,*,/]: ");
    	   char op=sc.next().charAt(0);
    	   
    	   double result=0;
    	   
    	   switch(op) {
    	   
    	   case '+':result=num1+num2;
    	   System.out.println("Addition= "+result);
    	   break;
    	   
    	   case '-':result=num1-num2;
    	   System.out.println("Subtraction= "+result);
    	   break;
    	   
    	   case '*':result=num1*num2;
    	   System.out.println("Multiplication="+result);
    	   break;
    	   
    	   case'/':
    		   if(num2!=0) {
    			   result=num1/num2;
    			   System.out.println("Division="+result);
    		   }else {
    			   System.out.println("Can't divide by 0..");
    		   }
    		break;
    		
    		default:
    		System.out.println("Invalid Operator.."); 	   
    	   }
    	   
    	   System.out.println("Do you want to continue? (y/n): ");
           choice = sc.next().charAt(0);
       	} while (choice == 'y' || choice == 'Y');

       sc.close();
    			   
       
       	
       	}
    }
