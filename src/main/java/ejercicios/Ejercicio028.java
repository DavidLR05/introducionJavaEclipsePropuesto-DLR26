package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
    	
    	int b;
    	java.util.Scanner scanner = new java.util.Scanner(System.in);
    	
    	do {
    		System.out.println("=== CAJERO AUTOMÁTICO ===");
            System.out.println("1 Consultar saldo");
            System.out.println("2 Ingresar dinero.");
            System.out.println("3 Retirar dinero.");
            System.out.println("0 Salir.");
            System.out.print("¿Que operacion desea realizar?");
        	
            b = scanner.nextInt();
            System.out.println("Saldo actual: " + saldo);
            
    		switch (b) {
    			case 1: 
    				consultarSaldo();
    				break;
    			case 2: 
    				ingresarDinero(scanner);
    				break;
    			case 3: 
    				retirarDinero(scanner);
    				break;
    			case 0: 
    				System.out.println("¡Hasta luego!");
    				break;
    			default: 
    				System.out.println("Opcion inválida");
    				break;
    		}
    			
    	}while(b != 0);
    	
    	return;
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
    	System.out.print("La cantidad a ingresar:");
        int ingreso = scanner.nextInt();
        
        saldo = saldo + ingreso;
        
    	System.out.println("Ingreso realizado. Nuevo saldo: " + saldo);
    }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
    	System.out.print("La cantidad a ingresar:");
        int retirada = scanner.nextInt();
        
        saldo = saldo - retirada;
        
    	System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
