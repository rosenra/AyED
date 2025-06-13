package Practica1.Ejercicio5;

public class ejercicio5 {
	public static void main(String[] args) {
        int[] arreglo1 = {10, 51, 30, 42, 50};
        int[] arreglo2 = {12, 28, 30, 38, 20};
        Dato d = new Dato();
        int[] arreglo3 = {5, 20, 11, 40, 100};
        
        System.out.println(calcular.incisoA(arreglo1).toString());
        calcular.incisoB(arreglo2, d);
        System.out.println(d.toString());
        calcular.incisoC(arreglo3);
        System.out.println(calcular.getDato());
	}
}
