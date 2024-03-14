package Day1_javabasic;

import java.util.Scanner;

public class SampleCoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int a,b,c;
		System.out.println("enter the a and b values:");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition of a ="+a+"and b="+b+"is:"+c);
		c=a-b;
		System.out.println("subraction5 of a ="+a+"and b="+b+"is:"+c);
	}
}