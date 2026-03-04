package ejercicios;

public class Ejercicio020 {
	
	//COMPLETAR METODO
	public boolean esPrimo(int n) {
        return false;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Ejercicio020 ejercicio = new Ejercicio020();
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        System.out.println(numero + " " + 
            (ejercicio.esPrimo(numero) ? "ES primo" : "NO es primo"));
        
        scanner.close();
    }
}
