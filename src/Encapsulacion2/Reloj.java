package Encapsulacion2;

public class Reloj {
	
    private int hora;
    private int minuto;
    private int segundo;
    private String mensaje;

    public Reloj(int hora, int minuto, int segundo) {
        this.mensaje = ""; // iniciar vacío
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public int getHora(int hora) {return hora;}
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0;
            mensaje += "Hora inválida ("+ hora +"). Se asignará 0\n";
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
            mensaje += "Minuto inválido ("+ minuto +"). Se asignará 0\n";
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
            mensaje += "Segundo inválido ("+ segundo +"). Se asignará 0\n";
        }
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    @Override
    public String toString() {
        String resultado = "Hora ingresada:\n" + mostrarHora()+ "\n";
        
        if (!mensaje.isEmpty()) {
            resultado += "Observaciones:\n" + mensaje;
        }

        return resultado;
    }
}