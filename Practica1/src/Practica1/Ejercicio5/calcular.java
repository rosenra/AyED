package Practica1.Ejercicio5;

public class calcular {
	private static Dato dat;
	public static Dato calcularValores (int [] vec) {
		int min = Integer.MAX_VALUE; //min = MAX!!!!
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int valor: vec) {
			if(valor <min) {
				min = valor;
			}
			if(valor > max) {
				max = valor;
			}
			sum += valor;
		}
		
		double prom = sum/vec.length;
		Dato d = new Dato();
		d.setMin(min);
		d.setMax(max);
		d.setProm(prom);
		// otra opcion Datos d = new Dato(min,max,sum/vec.length);
		return (d);
	}
	
	public static Dato incisoA (int [] vec) {
		return calcularValores(vec);
	}
	
	public static void incisoB (int [] vec,Dato d2) {
		Dato tempData = calcularValores (vec);
		d2.setMax(tempData.getMax());
		d2.setMin(tempData.getMin());
		d2.setProm(tempData.getProm());
		//no hace falta return se modifica el objeto por referencia.
	}
	
	public static void incisoC (int [] vec) {
		if (dat == null) {
			dat = new Dato ();
		}
		Dato tempData = calcularValores (vec);
		dat.setMax(tempData.getMax());
		dat.setMin(tempData.getMin());
		dat.setProm(tempData.getProm());
	}
	public static Dato getDato() {
		return dat;
	}
}
