package ejercicios;



public class Ejercicio030 {
	
	//COMPLETAR METODO
	public void procesarNumeros() {
		
		int[] n = new int[5];
		int max= 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for( int i = 0; i <5 ; i++){
		System.out.println("Introduce 5 números:");	
		int a = scanner.nextInt();
		n[i] = a;
		if (a>max) {
			max = a;
		}
		if (i == 4) {
			System.out.println("El mayor número es: "+max);
		}
		}
		
    }
    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}
