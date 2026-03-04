package ejercicios;

public class Ejercicio021 {
	
	//COMPLETAR METODO
	public int contarVocales(String texto) {
        return 0;
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
