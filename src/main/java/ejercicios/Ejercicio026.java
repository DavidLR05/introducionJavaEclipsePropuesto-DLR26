package ejercicios;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
			String max = null;
			String min = null;
			String nombre = "";
			int i = 0;
			do {
				
			System.out.println("Introduce el nombre o fin");
			nombre = scanner.nextLine();
			
			if(nombre.equals("fin") && i == 0) {
				System.out.println("No se introdujeron nombres.");
				return;
			}
			if (!nombre.equals("fin")) {
				i++;
				if (min == null) {
					min = nombre;
				}
				if (max == null) {
					max = nombre;
				}
				if (min.length()>nombre.length()) {
					min = nombre;
				}
				if(max.length()<nombre.length()) {
						max = nombre;
					}
			}
			
			
			} while (!nombre.contentEquals("fin"));
			scanner.close();
			System.out.println("Cantidad de nombres: " + i);
			System.out.println("El nombre más largo " + max);
			System.out.println("El nombre más corto " + min);
		
		
		
        
    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
