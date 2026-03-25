package ejercicios;



public class Ejercicio025 {
	
	//COMPLETAR METODO
	
	public void numerosPrimosHastaN() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Introduce un numero");
		int k = scanner.nextInt();
		
		System.out.println("Números primos hasta "+k+":");
		for (int i = 0 ; i < k ; i++) {
			if (esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
        
    }
	
	//COMPLETAR METODO
	private boolean esPrimo(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 1; i<=n;i++) {
			if (i != 1 && i !=n) {
				if (n%i == 0) {
					return false;
				}
			}
		}
        return true;
    }

    public static void main(String[] args) {
        Ejercicio025 ejercicio = new Ejercicio025();
        ejercicio.numerosPrimosHastaN();
    }
}
