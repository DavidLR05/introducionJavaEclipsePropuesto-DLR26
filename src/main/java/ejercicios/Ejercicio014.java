package ejercicios;

public class Ejercicio014 {
	//COMPLETAR METODO
	public long calcularFactorial(int n) {
        return 0;
    }

    public static void main(String[] args) {
    	Ejercicio014 ejercicio014 = new Ejercicio014();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        try {
            long factorial = ejercicio014.calcularFactorial(numero);
            System.out.println(numero + "! = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
