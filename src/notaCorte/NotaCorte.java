package notaCorte;

import java.util.Scanner;

public class NotaCorte
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numeroCalificaciones;
		int notaCorte;
		int contadorMalas = 0;
		int contadorIguales = 0;
		int contadorBuenas = 0;
		float nota;
		System.out.print("¿Cuantas calificaciones quieres evaluar? : ");
		numeroCalificaciones = sc.nextInt();
		System.out.print("¿Cual es la nota de corte? : ");
		notaCorte = sc.nextInt();
		for( int i = 1 ; i <= numeroCalificaciones ; i++)
		{
			System.out.print("Introduce nota: ");
			nota = sc.nextInt();					
			if(nota < notaCorte)
			{
				contadorMalas++;
			}
			else if(nota == notaCorte)
			{
				contadorIguales++;
			}
			else
			{
				contadorBuenas++;
			}
		}
		sc.close();
		System.out.println("Has obtenido " + contadorMalas + " calificaciones por debajo de la nota de corte, " + contadorIguales + " iguales a la nota de corte y " + contadorBuenas + " por encima de la nota de corte.");
	}
}
