package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
		int[] n = new int[5];
		int contador= 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
			System.out.println("Introduce 5 números:");	
			int a = scanner.nextInt();
			n[i] = a;
			if (n[i]%2 == 0) {
				contador = contador + 1;
			}
		
		}
		System.out.println("Hay "+contador+" números pares.");
        
    }
    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
