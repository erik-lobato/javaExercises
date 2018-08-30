import java.util.Scanner;

class exer7 {
	public static void main(String[] args) {
		System.out.print("Input a number: ");
		
		Scanner reader = new Scanner(System.in);
		
		int i = reader.nextInt();
		
		for(int c = 1; c < 11; c++) {
			System.out.println((c) + " x " + (i) + " = " + (c*i));
		}

	}
}
