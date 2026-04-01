package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
		int[] n = new int[5];
		int suma= 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
			System.out.println("Introduce 5 números:");	
			int a = scanner.nextInt();
			n[i] = a;
			suma = suma + n[i];
		
		}
		System.out.println("La suma total es: "+ suma);
        
    }
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
