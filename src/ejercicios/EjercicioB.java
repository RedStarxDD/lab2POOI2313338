package ejercicios;

import java.util.Scanner;

public class EjercicioB {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el numero: ");
		
		int n=sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		if(n%2==1) System.out.println("Luna");
		else if (n>=2&&n<=5) System.out.println("Sol");
		else if (n>=6&&n<=20) System.out.println("Tierra");
		else if (n>20) System.out.println("Galaxia");
		
		sc.close();
		
	}

}
