package Practica1.Ejercicio1;
import static Practica1.Ejercicio1.Metodos1.*;
public class ejercicio1 {
	public static void main (String [] args) {
		int a = 1;
		int b = 5;
		System.out.println("impresion con for:");
		imprimirConFor(a, b);
		
		System.out.println("imprimir con while:");
		imprimirConWhile(a, b);
		
		System.out.println("imprimir recursivamente:");
		imprimirConRecursion(a, b);
  }
}	
