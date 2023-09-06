package ejercicios;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un número a evaluar: ");
		
		try {
			long x=sc.nextLong();
			System.out.println(x+" puede ser almacenado en: ");
			
			if(x<Byte.MAX_VALUE&&x>Byte.MIN_VALUE) System.out.println("(*) byte");
			if(x<Short.MAX_VALUE&&x>Short.MIN_VALUE) System.out.println("(*) short");
			if(x<Integer.MAX_VALUE&&x>Integer.MIN_VALUE) System.out.println("(*) int");
			if(x<Long.MAX_VALUE&&x>Long.MIN_VALUE) System.out.println("(*) long");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(sc.next()+" no puede ser almacenado en ningún lado");
		}
		sc.close();
	}

}
