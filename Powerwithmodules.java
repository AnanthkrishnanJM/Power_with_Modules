package Powerwithmodules;

import java.util.Scanner;
public class Powerwithmodules {
     public static int pow(int A,int B,int C) {
    	 
    	int result=1;
    	for(int i=1;i<=B;i++) {
    		A=A%C;
    		{
    			result=(result*A)%C;
    		}
    		
    	}
		return result;
    	 
     }
	public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    System.out.println("enter the values:");
    int A=n.nextInt();
    int B=n.nextInt();
    int C=n.nextInt();
    System.out.println(pow(A,B,C));
    
    
;	}

}