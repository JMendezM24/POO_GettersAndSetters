package Encapsulacion2;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}

	public int getEdad() {return edad;}
	public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Edad no válida, se asignará 0");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

	public void mostrar() {
		System.out.println("Nombre: " + nombre + 
						   "\nApellido: " + apellido + 
						   "\nEdad: " + edad + 
						   "\n------------------------");
	}
}
