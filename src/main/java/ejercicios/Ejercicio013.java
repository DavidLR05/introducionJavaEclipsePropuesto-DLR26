package ejercicios;

public class Ejercicio013 {
	
	//COMPLETAR METODO
	public void mostrarPrimeros20Pares() {
		System.out.println("Los primeros veinte números pares:");
		for (int i = 1; i <= 20; i++) {
			int k = i*2;
			System.out.println(k+" ");
		}
        
    }

    public static void main(String[] args) {
    	Ejercicio013 ejercicio013 = new Ejercicio013();
    	ejercicio013.mostrarPrimeros20Pares();
    }
}
