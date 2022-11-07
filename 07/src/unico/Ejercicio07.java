package unico;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/*Realiza un programa que, dada una nota introducida por el usuario,
 * diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
 */
		
		final int INS = 5;
		final int SUF = 6;
		final int BIEN = 7;
		final int NOT = 9;
		
		double nota;
		String boletin;

		
		System.out.print("Introduzca la nota para conocer su valor en el boletín: ");
		nota = Double.parseDouble(teclado.nextLine());
		
		if (nota < INS) {
			boletin = "Insuficiente";
		} else {
			if (nota < SUF) {
				boletin = "Suficiente";
			} else {
				if (nota < BIEN) {
					boletin = "Bien";
				} else {
					if (nota < NOT) {
						boletin = "Notable";
					} else {
						boletin = "Sobresaliente";
					}
				}
			}
		}
		
		System.out.println(boletin);
		
	}
		
}