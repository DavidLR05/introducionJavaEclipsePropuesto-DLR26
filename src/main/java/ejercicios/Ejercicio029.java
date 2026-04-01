package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {
	
	//COMPLETAR METODO
	public void secuenciaFibonacci() {
		System.out.println("Introduce cantidad de numeros");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int a = 0;
	    int b = 1;
	    System.out.println("Secuencia Fibonacci ("+n+" términos):");
	    
		for (int i = 0; i < n; i++) {
		    System.out.print(a + " ");
		    int c = a + b;
		    a = b;
		    b = c;
		}
    }

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}
