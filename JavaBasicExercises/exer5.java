import java.util.Scanner;

class exer5 {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.print("Input first number: ");
		int n1 = reader.nextInt();
		
		System.out.print("Input second number: ");
		int n2 = reader.nextInt();
		
		System.out.print(n1);
		System.out.print(" x ");
		System.out.print(n2);
		System.out.print(" = ");
		System.out.println(n1 * n2);
	}
}
