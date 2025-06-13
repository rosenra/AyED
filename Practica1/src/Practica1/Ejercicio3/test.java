package Practica1.Ejercicio3;
//import paqueteLectura.*
public class test {
	public static void main (String [] args) {
		//agrego dos estudiantes al vector
		//podria usar GeneradorAletorio
		// Generador Aleatorio.iniciar
		// new estudiante(GeneradorAleatorio.generarString(4),GeneradorAleatorio.generarString(5)....)
		Estudiante  [] vecEstudiante = {
				(new Estudiante ("marcos","carrizo","comision 1","marcoscarrizo@gmail.com","123")),
				(new Estudiante ("juan","viant","comision 2","juancviant@gmail.com","456"))
		};
		Profesor [] vecProfesor = {
				(new Profesor ("laura","fava","comision 1","laura@gmail.com","informatica")),
				(new Profesor ("cathy","mostaccio","comision 2","cathy@gmail.com","informatica")),
				(new Profesor ("nestor","lopez","comision 1","nestor@gmail.com","informatica"))
		};
		System.out.println("Estudiantes:");
		for (Estudiante es: vecEstudiante) {
			System.out.println(es.tusDatos()+"\n");
		}
		System.out.println(("Profesores:"));
		for (Profesor prf: vecProfesor){
			System.out.println(prf.tusDatos()+"\n");
		}
	}
}
