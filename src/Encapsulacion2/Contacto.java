package Encapsulacion2;

public class Contacto {
	
	private String nombre;
	private String telefono;
	private String email;
	private String mensaje;
	
	//Constructor
	public Contacto(String nombre, String telefono, String email) {
		this.nombre = nombre;
		this.mensaje = "";
		setTelefono(telefono);
		setEmail(email);
	}

	//Getters and Setters
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getTelefono() {return telefono;}
	public void setTelefono(String telefono) {
		 if (telefono != null) {
		        // Eliminar espacios y guiones
		        String limpio = telefono.replaceAll("[ -]", "");
		        // Validar que queden exactamente 8 dígitos
		        if (limpio.matches("\\d{8}")) {
		            this.telefono = limpio;
		            return;
		        }
		    }
		    // Si falla la validación
		    this.telefono = "00000000";
		    mensaje += "Teléfono inválido. ";
	}

	public String getEmail() {return email;}
	public void setEmail(String email) {
		 if (email != null && email.contains("@")) {
	            this.email = email;
	        } else {
	            this.email = "Correo@invalido.com";
	            mensaje += "Email inválido.\n";
	        }
	}
	//Metodo para mostrar con guines
	public String getTelefonoFormateado() {
	    return telefono.substring(0, 4) + "-" + telefono.substring(4);
	}
	 // Método para mostrar contacto
    public String mostrarContacto() {
        String resultado = "Nombre: " + nombre +
                           " | Teléfono: " + getTelefonoFormateado() +
                           " | Email: " + email + "\n";

        if (!mensaje.isEmpty()) {
            resultado += "Observaciones:\n" + mensaje;
        }

        return resultado;
    }
	
	
	

}
