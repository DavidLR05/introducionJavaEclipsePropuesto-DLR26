package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {
	
	//COMPLETAR METODO
	public void contarVocales() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce una frase:");
		String frase = scanner.nextLine();
		
		int vocales = contarVocalesEnFrase(frase);
		System.out.println("La frase tiene " + vocales + " vocales.");
		
		scanner.close();
        
    }
	//COMPLETAR METODO
    private int contarVocalesEnFrase(String frase) {
    	if (frase == null) {
    		return 0;
    	}
    	frase = frase.toLowerCase();
    	int vocal = 0;
    	char[] cadena = frase.toCharArray();
        for (int i = 0; i< frase.length(); i++) {
        	if(cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' 
        		|| cadena[i] == 'o' || cadena[i] == 'u')  {
        		vocal = vocal+1;
        	}
        }
        return vocal;
    }
    

    public static void main(String[] args) {
        Ejercicio023 ejercicio = new Ejercicio023();
        ejercicio.contarVocales();
    }
}
