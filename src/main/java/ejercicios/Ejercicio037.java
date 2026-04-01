package ejercicios;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
		
		
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int[] n = new int[5];
		
		
		System.out.println("Introduce 5 números");
		for (int i = 0; i<5; i++) {
			System.out.print("Numero " + (i+1) + ": ");
			n[i] = scanner.nextInt();
			
			
		}
		
		System.out.print("Array: ");
			for (int num:n) {
				System.out.print(num + " ");
			}
			
		// Contar repeticiones
			
		for (int i = 0; i < n.length;i++) {
			boolean yaContado = false;
			for (int j = 0; j< i; j++) {
				if (n[i]==n[j]) {
					yaContado = true;
					break;
				}
			}
			if(!yaContado) {
				int contador = 0;
				for (int k = 0; k < n.length; k++) {
					if (n[k] == n[i]) {
						contador ++;
					}
					
				}
				System.out.println(n[i] + " se repite " + contador + " vez/veces");
			}
		}
		scanner.close();
		
		
        
    }
    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
