package ejercicios;

import java.util.Scanner;


public class Ejercicio024 {
	
	//COMPLETAR METODO
	public void calculadoraNotas() {
		int[] notas = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Introduce nota");
			 notas[i] = scanner.nextInt();
			
		}
			
		int max = notas[0]; 
		int min = notas[0];
		int suma = 0;
		for (int i = 0; i < 5 ; i++) {
			suma = suma+notas[i];
			if (max < notas[i]) {
				max = notas[i];
			}
			if (min > notas[i]) {
				min = notas[i];
			}
		}
		
		int media = suma/5;
		
		System.out.println("\n=== RESULTADOS ===");
		System.out.println("Media: "+ media);
		System.out.println("Nota más alta: "+ max);
		System.out.println("Nota más baja: "+ min);
		
		
		
		
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}
