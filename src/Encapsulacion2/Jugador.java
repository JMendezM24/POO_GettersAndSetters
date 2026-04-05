package Encapsulacion2;

public class Jugador {
	private String nombre;
	private int puntajeActual;
	private int puntajeMaximo;
	private String mensaje;
	
	public Jugador(String nombre) {
		setNombre(nombre);
		this.puntajeActual = 0;
		this.puntajeMaximo = 0;
		this.mensaje = "";
	}
	
	// Getter nombre
    public String getNombre() { return nombre;}

    // Setter nombre (validado)
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }
    }
	
	// Getter puntajeActual
    public int getPuntajeActual() {
        return puntajeActual;
    }

    // Getter puntajeMaximo
    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    // Getter mensaje
    public String getMensaje() {
        return mensaje;
    }

    // Método principal (controla todo)
    public void actualizarPuntaje(int nuevoPuntaje) {

        if (nuevoPuntaje < 0) {
            mensaje += "Intento inválido (" + nuevoPuntaje + ").\n";
            return;
        }

        puntajeActual = nuevoPuntaje;
        mensaje += "Nuevo puntaje: " + nuevoPuntaje + ". ";

        if (nuevoPuntaje > puntajeMaximo) {
            puntajeMaximo = nuevoPuntaje;
            mensaje += "¡Nuevo récord!\n";
        }
    }

    // Mostrar datos
    public String mostrarJugador() {
        String resultado = "\nJugador: " + nombre +
                           " | Puntaje actual: " + puntajeActual +
                           " | Puntaje máximo: " + puntajeMaximo;

        if (!mensaje.isEmpty()) {
            resultado += "\nHistorial:\n" + mensaje;
        }

        return resultado;
    }
}	