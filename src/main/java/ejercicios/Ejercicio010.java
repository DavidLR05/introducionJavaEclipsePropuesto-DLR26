package ejercicios;

public class Ejercicio010 {
	
	//COMPLETAR METODO
	public void mostrarFor() {
		System.out.println("FOR");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i+" ");
		}
      
    }
	
	//COMPLETAR METODO
    public void mostrarWhile() {
    	System.out.println("WHILE");
    	int j = 1;
    	while (j <= 100) {
    		System.out.println(j+" ");
    		j++;
    	}
        
    }
    
  //COMPLETAR METODO
    
    public void mostrarDoWhile() {
    	System.out.println("DO-WHILE");
    	int k = 1;
    	do {
    		System.out.println(k+" ");
    		k++;
    	} while (k <=100);
    	
    	
    }

    public static void main(String[] args) {
    	Ejercicio010 ejercicio010 = new Ejercicio010();
    	ejercicio010.mostrarFor();
    	ejercicio010.mostrarWhile();
    	ejercicio010.mostrarDoWhile();
    }
}
