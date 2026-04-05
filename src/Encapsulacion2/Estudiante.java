package Encapsulacion2;

public class Estudiante {
	
	private String carnet;
	private String nombre;
	private double promedio;
	private String mensaje;
	
	
	//Contructor
	public Estudiante(String carnet, String nombre, double promedio) {
		this.carnet = carnet;
		this.nombre = nombre;
		this.mensaje = "";
		setPromedio(promedio);
	}

	//Getters and Setters
	public String getCarnet() {return carnet;}
	public void setCarnet(String carnet) {this.carnet = carnet;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public double getPromedio() {return promedio;}
	public void setPromedio(double promedio) {
		if (promedio < 0) {
	           this.promedio = 0;
	           mensaje += "Promedio inválido (" + promedio + "). Se asignó 0.\n";
	       } else if (promedio > 100) {
	           this.promedio = 100;
	           mensaje += "Promedio inválido (" + promedio + "). Se asignó 100.\n";
	       } else {
	           this.promedio = promedio;
	       }
	}
	// Método esBecado
    public boolean esBecado() {
        return promedio >= 85;
    }

    // Mostrar información
    @Override
    public String toString() {
        return "Carnet: " + carnet +
               " | Nombre: " + nombre +
               " | Promedio: " + promedio +
               " | Becado: " + (esBecado() ? "Sí" : "No") +
               (mensaje.isEmpty() ? "" : "\nObservaciones:\n" + mensaje);
    }
	
	
}
