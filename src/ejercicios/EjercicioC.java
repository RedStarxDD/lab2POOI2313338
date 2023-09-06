package ejercicios;

import java.util.Scanner;

public class EjercicioC {
	
	public static void main(String[] args) {
		double currentSalary,rating,raise=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el salario actual: ");
		currentSalary=sc.nextDouble();
		
		System.out.println("Ingrese la calificación de desempeño: ");
		rating=sc.nextDouble();	
		
		if(rating==1) raise=currentSalary*0.6;
		else if(rating==2) raise=currentSalary*0.4;
		else if(rating==3) raise=currentSalary*0.15;
		
		System.out.println("Amount of your raise: $"+raise);
		System.out.println("Your new salary: $"+(currentSalary+raise));
		
		sc.close();
	}
}
