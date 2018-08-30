//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

class exer6 {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = reader.nextInt();
		
		System.out.print("Digite outro: ");
		int n2 = reader.nextInt();


		int s = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + s);
		int m = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + m);
		int multi = n1*n2;
		System.out.println(n1 + " x " + n2 + " = " + multi);
		int div = n1/n2;
		System.out.println(div);
	}
}
