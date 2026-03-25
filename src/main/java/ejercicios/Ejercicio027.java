package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {
	
	//COMPLETAR METODO
	public void decimalABinario() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Introduce numero a Dividir");
		int a = scanner.nextInt();
		int numero = -1;
		int contador = 1;
		int contador2 = 0;
		System.out.print("Binario: ");
		while (numero != 0 && numero != 1) {
			if (numero == -1) {
				
				numero = (a / 2);
				
			}else {
				
				numero = (numero / 2) ;
				
			}
			contador++;
				
			 
			 
			 
		}
		int[] arraybin = new int[contador];
		numero = -1;
		while (numero != 0 && numero != 1) {
			if (numero == -1) {
				arraybin[contador2] = (a%2);
				numero = (a / 2);
				
			}else {
				arraybin[contador2] = (numero%2);
				numero = (numero / 2) ;
				
			}
			contador2++;
				
			 
			 
			 
		}
		arraybin[contador-1] = numero;
		
		for (int i = contador-1; i>=0 ; i--) {
			System.out.print(arraybin[i]);
		}
		
        
    }

    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}
