package Practica1.Ejercicio3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public Estudiante(String nombre, String apellido,String comision,String email,String direccion) {
		this.nombre = nombre;//this.setNombre(nombre);
		this.apellido = apellido;
		this.comision = comision;
		this.email = email;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	public String getComision() {
		return comision;
	}
	public void setComision (String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	public String tusDatos() {
		return "nombre: "+getNombre()+" apellido: "+ getApellido()+" comision "+getComision()+
				" email: "+getEmail()+" direccion: "+getDireccion();
	}
}
