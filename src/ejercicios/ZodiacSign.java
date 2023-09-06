package ejercicios;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese año: ");
		
		try {
			int year=sc.nextInt(),residuo=year%12;
			
			switch (residuo) {
			case 0:
				System.out.println(year+" es el año del mono");
				break;
			case 1:
				System.out.println(year+" es el año del gallo");
				break;
			case 2:
				System.out.println(year+" es el año del perro");
				break;
			case 3:
				System.out.println(year+" es el año del cerdo");
				break;
			case 4:
				System.out.println(year+" es el año de la rata");
				break;
			case 5:
				System.out.println(year+" es el año del buey");
				break;
			case 6:
				System.out.println(year+" es el año del tigre");
				break;
			case 7:
				System.out.println(year+" es el año del conejo");
				break;
			case 8:
				System.out.println(year+" es el año del dragón");
				break;
			case 9:
				System.out.println(year+" es el año de la serpiente");
				break;
			case 10:
				System.out.println(year+" es el año del camello");
				break;
			default:
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("El año ingresado no es válido");
		}
		
		sc.close();
	}

}
