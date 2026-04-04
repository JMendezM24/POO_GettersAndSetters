package Encapsulacion2;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private int pin;
	private String mensaje;
	
	public CuentaBancaria(String titular, double saldo, int pin) {
        this.titular = titular;
        this.mensaje = "";

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            mensaje += "Saldo inicial inválido.\n";
        }
        
        this.pin = pin;
    }
	
	// Getters and Setters
	public String getTitular() {return titular;}
	public void setTitular(String titular) {this.titular = titular;}

	public double getSaldo() {return saldo;}
	public void setSaldo(double saldo) {this.saldo = saldo;}

	public int getPin() {return pin;}
	public void setPin(int pin) {this.pin = pin;}
	
	// Método retirar 
    public void retirar(double monto, int pinIngresado) {

        if (pinIngresado != pin) {
            mensaje += "PIN incorrecto. Acción denegada.\n";
            return;
        }

        if (monto <= 0) {
            mensaje += "Monto inválido.\n";
            return;
        }

        if (monto <= saldo) {
            saldo -= monto;
            mensaje += "Retiro exitoso: Q" + monto + ". Saldo restante: Q" + saldo + ".\n";
        } else {
            mensaje += "Fondos insuficientes.\n";
        }
    }

    // Mostrar información
    @Override
    public String toString() {
        return "Titular: " + titular +
               " | Saldo: Q" + saldo +
               (mensaje.isEmpty() ? "" : "\nMovimientos:\n" + mensaje);
    }

}
