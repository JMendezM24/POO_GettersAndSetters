package Encapsulacion2;

public class Producto {

    //Atributos
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private String mensaje; //Se agregó esto para mejor control de mensajes en consola
    
    //Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.mensaje = "";
    }
    
    //Getters y Setters
    public String getCodigo() {return codigo;}
	public void setCodigo(String codigo) {this.codigo = codigo;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public double getPrecio() {return precio;}
	// Validar Precio
	public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 1;
            mensaje += "Precio inválido. Se asignará 1\n";
        }
    }
	public int getStock() { return stock; }
	// Validas Stock
	public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
            mensaje += "Stock inválido. Se asignará 0\n";
        }
    }
	// MÉTODO Vender
	public void vender(int cantidad) {
	    if (cantidad <= 0) {
	        mensaje += "Cantidad inválida.\n";
	        return;
	    }

	    if (cantidad <= stock) {
	        stock -= cantidad;
	        mensaje += "Venta realizada (" + cantidad + ").\n";
	    } else {
	        mensaje += "No hay suficiente stock. ";
	    }
	}
    
    //Metodo para mostrar informacion
	public String toString() {
	    return "Código: " + codigo +
	           " | Producto: " + nombre +
	           " | Precio: Q." + precio +
	           " | Stock: " + stock +
	           (mensaje.isEmpty() ? "" : "\nObservaciones:\n" + mensaje);
	}
}