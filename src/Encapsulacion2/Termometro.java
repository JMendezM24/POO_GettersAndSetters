package Encapsulacion2;

public class Termometro {
	private double celsius;
	private String mensaje;
	
	public Termometro(double celsius) {
		this.mensaje = "";
		setCelsius(celsius);
	}

	//Getters and Setters
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double temperatura) {
		if (temperatura < -273.15) {
            this.celsius = -273.15;
            mensaje += "Temperatura inválida (" + temperatura + "). Se ajustó a -273.15°C.\n";
        } else {
            this.celsius = temperatura;
        }
	}
	
	// Conversión 
    public double getFahrenheit() {
    	return Math.round(((celsius * 9/5) + 32) * 100.0) / 100.0;    
    }
	
    // Mostrar información
    public String toString() {
        return "Temperatura: " + celsius + "°C" +
               "\nFahrenheit: " + getFahrenheit() + "°F" +
               (mensaje.isEmpty() ? "" : "\nObservaciones:\n" + mensaje);
    }
	
	

}
