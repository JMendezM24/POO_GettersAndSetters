package Encapsulacion2;

public class Factura {
	private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private String mensaje;

    // Constructor
    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        setCodigoFactura(codigoFactura);
        setDescripcion(descripcion);
        this.mensaje = "";
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    // Getter código
    public String getCodigoFactura() {
        return codigoFactura;
    }

    // Setter código
    public void setCodigoFactura(String codigoFactura) {
        if (codigoFactura != null && !codigoFactura.trim().isEmpty()) {
            this.codigoFactura = codigoFactura;
        } else {
            this.codigoFactura = "SIN-CODIGO";
            mensaje += "Código inválido. ";
        }
    }

    // Getter descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Setter descripción
    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        } else {
            this.descripcion = "Sin descripción";
            mensaje += "Descripción inválida. ";
        }
    }

    // Getter cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Setter cantidad
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 1;
            mensaje += "Cantidad inválida. ";
        }
    }

    // Getter precioUnitario
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    // Setter precioUnitario
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 1.0;
            mensaje += "Precio unitario inválido. ";
        }
    }

    // Método calcular total
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    // Mostrar factura
    public String mostrarFactura() {
        String resultado = "Código: " + codigoFactura +
                           " | Descripción: " + descripcion +
                           "\nCantidad: " + cantidad +
                           " | Precio Unitario: " + precioUnitario +
                           "\nTotal: " + calcularTotal();

        if (!mensaje.isEmpty()) {
            resultado += "\nObservaciones: " + mensaje;
        }

        return resultado;
    }
}
