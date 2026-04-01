package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
		
		int[] n = new int[5];
		int contador= 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
				System.out.println("Introduce 5 números:");	
				int a = scanner.nextInt();
				n[i] = a;
		
		}
		System.out.println("Que numero quieres que busque");
		int b = scanner.nextInt();
		for( int i = 0; i <5 ; i++){
				System.out.println("Introduce 5 números:");	
				if (n[i] == b) {
					System.out.println("¡El número "+b+" SÍ existe en el array!");
					break;
				}
				
		}
		System.out.println("¡El número "+b+" NO existe en el array.");
		
        
    }
    
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}
