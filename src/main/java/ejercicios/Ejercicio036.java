package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {
		
		int[] n = new int[5];
	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
				System.out.println("Introduce 5 números:");	
				int a = scanner.nextInt();
				n[i] = a;	
		}
		if(n[0] == n[4] && n[1] == n[3] ) {
			System.out.println("¡El array ES palíndromo!");
		}else {
			System.out.println("El array NO es palíndromo.");
		}
	}
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}
