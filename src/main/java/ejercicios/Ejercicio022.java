package ejercicios;

import java.util.Scanner;

public class Ejercicio022 {
	
	//COMPLETAR METODO
	public void mostrarMenu() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int a;
		
		do {
		System.out.println("=== MENÚ CALCULADORA ===");
		System.out.println("1 Sumar");
		System.out.println("2 Restar");
		System.out.println("3 Multiplicar");
		System.out.println("4 Dividir");
		System.out.println("0 Salir");
		System.out.println("Introduce accion a realizar");
		 a = scanner.nextInt();
		switch(a) {
					case 1: {procesarSuma(scanner);
					
					break;
				}
					case 2: {procesarResta(scanner);
					break;}
					case 3: {procesarMultiplicacion(scanner);
					break;}
					case 4: {procesarDivision(scanner);
					break;}
					case 0: {
					System.out.println("¡Hasta luego!");
					break;
				}
			}
			/*scanner.nextLine();
			System.out.println("Presione ENTER para continuar ... ");
			scanner.nextLine();*/
		} while (a != 0);
	}
        
	//COMPLETAR METODO
    private void procesarSuma(Scanner scanner) {
    	System.out.print("Introduce primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce segundo número: ");
        int b = scanner.nextInt();
    	int c = a+b;
        System.out.println("Resultado: "+ c+".0");
    }
    
    //COMPLETAR METODO
    private void procesarResta(Scanner scanner) {
    	System.out.print("Introduce primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce segundo número: ");
        int b = scanner.nextInt();
    	int c = a-b;
        System.out.println("Resultado: "+ c);
    }
    
    //COMPLETAR METODO
    private void procesarMultiplicacion(Scanner scanner) {
    	System.out.print("Introduce primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce segundo número: ");
        int b = scanner.nextInt();
    	int c = a*b;
        System.out.println("Resultado: "+ c);
    }
    
    //COMPLETAR METODO
    private void procesarDivision(Scanner scanner) {
    	System.out.print("Introduce primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce segundo número: ");
        int b = scanner.nextInt();
    	int c = a/b;
        System.out.println("Resultado: "+ c);
        
    }
    
    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}
