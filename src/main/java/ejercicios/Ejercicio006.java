package ejercicios;



public class Ejercicio006 {
	
	//COMPLETAR METODO
	public String obtenerCalificacion(double nota) {
		
		int n = (int) nota;
		if (nota < 0 || nota > 10 ) {
			return "Nota no válida";
		}
		switch (n) {
			case 5: {return "Suficiente";}
			case 6: return "Bien";
			case 7: ;
			case 8: return "Notable";
			case 9: ;
			case 10: return "Sobresaliente";
			default : return "Insuficiente";
		}
		
}

    public static void main(String[] args) {
    	Ejercicio006 ejercicio006 = new Ejercicio006();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce una nota (0–10): ");
        double nota = scanner.nextDouble();

        String resultado = ejercicio006.obtenerCalificacion(nota);
        System.out.println(resultado);

        scanner.close();
    }
}
