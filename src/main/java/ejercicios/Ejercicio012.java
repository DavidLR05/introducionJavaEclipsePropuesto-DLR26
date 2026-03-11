package ejercicios;

import java.util.Scanner;

public class Ejercicio012 {
	
	//COMPLETAR METODO
	public int sumarHastaCero() {
		int suma = 0;
		Scanner scanner = new java.util.Scanner(System.in);
		int k = 1;
		while (k != 0) {
			System.out.println("Introduce un numero");
			int numero = scanner.nextInt();
			k = numero ;
			suma = suma+k;
		}
		return suma;
    }
	

    public static void main(String[] args) {
    	Ejercicio012 ejercicio012 = new Ejercicio012();
        double resultado = ejercicio012.sumarHastaCero();
        System.out.println("La suma total es: " + resultado);
    }
}