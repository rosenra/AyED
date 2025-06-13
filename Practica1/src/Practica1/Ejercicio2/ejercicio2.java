package Practica1.Ejercicio2;
import java.util.Scanner;
import static Practica1.Ejercicio2.metodos2.*;
public class ejercicio2 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);//probar con distintos valores de n ingresandolos por teclado
		System.out.println("ingrese un numero entero");
		int n = scanner.nextInt(); // ingreso tamaño de vector n
		int [] resultado = generarMultiplos(n);
		System.out.println("los primeros "+n+" multiplos de "+n+" son:");
		for (int numero : resultado) { //for each para imprimir todo el vector
			System.out.println(numero+" ");
		}
	}
}
