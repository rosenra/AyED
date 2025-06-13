package Practica1.Ejercicio2;

public class metodos2 {
	// returns array con los primeros n multiplos de n
	public static int[] generarMultiplos(int n) {
		int [] multiplos = new int [n];
		for (int i=0;i<n; i++) {
			multiplos[i] = n*(i+1); //index 0
		}
		return multiplos;
	}
}

