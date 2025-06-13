package Practica1.Ejercicio4;
/*a. Sin ejecutar el programa en su computadora, sólo analizándolo, indique qué imprime el
siguiente código.
RTA: Metodo 1:Los parámetros x y ,se pasan por valor.Cualquier modificación de x y dentro del método afecta
solo a las copias locales,no a las variables originales a y b. Por lo tanto, después de la llamada
a uno(a, b),los valores de a y b en main seguirán siendo 1 y 2 respectivamente.
Metodo 2: Aunque Integer es una clase envolvente para el tipo primitivo int, sigue siendo inmutable, 
lo que significa que cualquier cambio en x y dentro del método no afectará los valores originales de 
c y d fuera del método.Similar al caso anterior, después de la llamada a dos(c, d),
los valores de c y d en main seguirán siendo 3 y 4 respectivamente.

b. Ejecute el ejercicio en su computadora, y compare su resultado con lo esperado en el
inciso anterior.
c. Inserte un breakpoint en las líneas donde se indica: y = tmp y ejecute en modo debug
¿los valores que adoptan las variables x, y coinciden con los valores impresos por
consola
RTA: con el breaakpoint los metodos 1 y 2 coinciden con lo que se espera en el debug (que cambien los valores
dentro del metodo) pero no se va a reflejar en el main pq se pasa por valor los parametros.
*/

public class SwapValores {
   public static void swap1 (int x, int y) {
	    if (x < y) {
	         int tmp = x ;
	            x = y ;
	            y = tmp;
	        }
	    }
	    
   public static void swap2 (Integer x, Integer y) {
	   if (x < y) {
	        int tmp = x ;
	        x = y ;
	        y = tmp;
	    }
	}
	    
	public static void main(String[] args) {
        int a = 1, b = 2;
        Integer c = 3, d = 4;
        swap1(a,b);
        swap2(c,d);
        System.out.println("a=" + a + " b=" + b) ;
        System.out.println("c=" + c + " d=" + d) ;
    }
	    
    //Imprime a=1 ; b=2 ; c=3 ; d=4
}