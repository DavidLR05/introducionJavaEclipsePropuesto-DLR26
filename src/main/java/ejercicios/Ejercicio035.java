package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//COMPLETAR METODO
	public void calcularMediaArray() {
		
		int[] n = new int[5];
		int contador= 0;
		int suma = 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
			System.out.println("Introduce 5 números:");	
			int a = scanner.nextInt();
			n[i] = a;
			suma = suma + n[i];
			
		}
			int media = suma/n.length;
			System.out.println("La media es: "+media);
    }
    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
    
}
