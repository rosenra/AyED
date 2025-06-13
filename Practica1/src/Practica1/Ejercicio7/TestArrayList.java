package Practica1.Ejercicio7;
import java.util.*;
public class TestArrayList {
	public static void main (String [] args) {
		//INCISO A
		ArrayList<Integer>l = new ArrayList<Integer>();
		//incisoB: la principal diferencia esta en el acceso secuencial de la LinkedList,que es mas ineficiente que
		//el acceso directo indexado del ArrayList
		//Ademas ArrayList necesita un espacio continuo de memoria y linkedList no 
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce una secuencia de numeros"+"\n"+"para terminar ingresa un numero negativo");
		
		while (true) {
			int numero = scanner.nextInt();
			if(numero <0) {
				break;
			}
			l.add(numero);
		}
		scanner.close();//CERRAR SCANNER
		System.out.println("los numeros introducidos son:");
		for (int n:l) {
			System.out.println(n);
		}
		// INCISO C
		//FOR
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		//FOR EACH: 
		//ventaja es mas legible y no tenes que preocuparte x el indice, funciona en arraylist y linkedList
		// desventaja:no tenes acceso directo al indice del elemento actual
		for (Integer num:l) {
			System.out.println(num);
		}
		
		//ITERATOR
		//Ventaja: util si necesitas eliminar elem durante la iteracion
		//Desventaja: no tenes acceso directo a los indices
		Iterator <Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//LIST ITERATOR
		//Ventaja recorrer la lista para adelante y tmb para atras.Ademas permite modificar elementos durante
		//la iteracion
		//Desventaja:Es más complejo que un simple Iterator y generalmente se usa cuando necesitas
	    // iterar en ambas direcciones o modificar la lista durante la iteración.
		ListIterator <Integer> listIt = l.listIterator();
		while (listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		// INCISO D
		List <Estudiante> listE = new LinkedList <Estudiante>();
		Estudiante e1 = new Estudiante("ayma","marfil","ayma@gmail","informatica");
		listE.add(e1);
		Estudiante e2 = new Estudiante("tati","usta","tati@gmail","informatica");
		listE.add(e2);
		Estudiante e3 = new Estudiante ("paz","aguirre","paz@gmail","informatica");
		listE.add(e3);
		System.out.println("lista estudiantes original:");
		for (Estudiante est: listE) {
			System.out.println(est.toString());
		}
		
		List <Estudiante> listEcopia = new LinkedList <Estudiante>(listE);//indeependiente de la original
		System.out.println("Estudiantes copiados:");
		System.out.println(listEcopia);
	
		listE.set(0, new Estudiante("Prueba", "Prueba", "prueba@gmail", "informatica"));
        System.out.print("Estudiantes: ");
        for(Estudiante est: listE)
            System.out.println(est.toString());
		System.out.println("estudiantes copiados");
		System.out.println(listEcopia); //no se modifico la copia
		//si hago e1.setGmail si se modifica la copia y la original pq cambia la direccion al objeto
		
		
		List<Estudiante> listEstCopia = new LinkedList<Estudiante>();
		listEstCopia.addAll(listE);//agrega todos los elem
		System.out.println("estudiantes copiados con addAll: ");
		System.out.println(listEstCopia);
		//tmb puedo usar .clone para copiar pero clonea todo como object y despues hay que castear
		
		//INCISO E
		Estudiante e4 = new Estudiante ("karen","rodriguez","karen@gmail","informatica");
		if(!listE.contains(e4)) {
			listE.add(e4);
			System.out.println("se agrego al alumno");
		}else {
			System.out.println("el alumno ya se encontraba en la lista");
		}
		System.out.println("lista alumnos: ");
		System.out.println(listE);
	}
}
