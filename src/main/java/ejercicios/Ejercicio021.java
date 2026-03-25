package ejercicios;

public class Ejercicio021 {
	
	//COMPLETAR METODO
	public int contarVocales(String texto) {
		
        int vocal = 0;
        if (texto == null || texto == "") {
        	return 0;
        }else {
        	char[] cadena = texto.toCharArray();
        for (int i = 0; i< texto.length(); i++) {
        	if(cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' 
        		|| cadena[i] == 'o' || cadena[i] == 'u' ||
        		cadena[i] == 'A' || cadena[i] == 'E' || cadena[i] == 'I'
        		|| cadena[i] == 'O' || cadena[i] == 'U' )  {
        		vocal = vocal+1;
        	}
        }
        return vocal;
        }
		
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Ejercicio021 ejercicio = new Ejercicio021();
        
        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();
        
        int vocales = ejercicio.contarVocales(texto);
        System.out.println("Número de vocales: " + vocales);
        
        scanner.close();
    }
}
