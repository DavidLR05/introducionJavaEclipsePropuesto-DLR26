package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
    	do {
    		scanner scanner;
    		System.out.println("=== Cajero Automatico ===");
    		System.out.println("1 Consultar Saldo");
    		System.out.println("2 Ingresar dinero");
    		System.out.println("3 Retirar dinero");
    		System.out.println("0 Salir");
    		System.out.println("Introduce accion a realizar");
    		int b = scanner.nextInt();
    		switch(b) {
    					case 1: {consultarSaldo();
    					
    					break;
    				}
    					case 2: {ingresarDinero();
    					break;}
    					case 3: {retirarDinero();
    						
    					break;}
    					case 0: {
    					System.out.println("¡Hasta luego!");
    					break;
    				}
    			}
    			/*scanner.nextLine();
    			System.out.println("Presione ENTER para continuar ... ");
    			scanner.nextLine();*/
    		} while (b != 0);
    	
        
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
        System.out.println("Saldo actual: "+saldo);
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
    	System.out.println("Introduzca cantidad a ingresar");
    	int a = scanner.nextInt();
    	saldo = saldo + a;
    	System.out.println("Ingreso realizado. Nuevo saldo: "+saldo);
        
    }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
    	System.out.println("Introduzca cantidad a retirar");
    	int a = scanner.nextInt();
    	saldo = saldo + a;
    	System.out.println("Retiro realizado. Nuevo saldo: "+saldo);
        
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
