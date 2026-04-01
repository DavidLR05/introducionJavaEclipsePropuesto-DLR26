package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
		int[] n = new int[5];
		int contador= 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
				System.out.println("Introduce 5 números:");	
				int a = scanner.nextInt();
				n[i] = a;
			
		
		}
		System.out.print("Array original: ");
		for (int j = 0; j <5 ; j++){
		
			System.out.print( n[j] +" ");
		
		}
		System.out.println("");
		System.out.println("");
		System.out.print("Array invertido: ");
		for (int j = 4; j > -1 ; j--){
			
			System.out.print( n[j] +" ");
		
		}
		
	
        
    }
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}
