package Encapsulacion2;

public class Curso {
	
	private String nombreCurso;
	private double nota1;  
	private double nota2;
	private double nota3;
	private String mensaje;
	
	//Constructor
	public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
        this.nombreCurso = nombreCurso;
        this.mensaje = "";
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

	//Validacion de notas 
	private double validarNota(double nota) {
	    if (nota < 0) {
	        mensaje += "Nota inválida (" + nota + "). Se asignará 0.\n";
	        return 0;
	    } else if (nota > 100) {
	        mensaje += "Nota inválida (" + nota + "). Se asignará 100.\n";
	        return 100;
	    }
	    return nota;
	}
	
	//Getters and Setters
	public String getNombreCurso() {return nombreCurso;}
	public void setNombreCurso(String nombreCurso) {this.nombreCurso = nombreCurso;}

	public double getNota1() {return nota1;}
	public void setNota1(double nota1) {this.nota1 = validarNota(nota1);}

	public double getNota2() {return nota2;}
	public void setNota2(double nota2) {this.nota2 = validarNota(nota2);}

	public double getNota3() {return nota3;}
	public void setNota3(double nota3) {this.nota3 = validarNota(nota3);}
	
	// MÉTODO promedio 
	public double promedio() {
	    return (nota1 + nota2 + nota3) / 3;
	}

	// MÉTODO estado 
	public String estado() {
	    return promedio() >= 61 ? "Aprobado" : "Reprobado";
	}

	// Mostrar información
	public String toString() {
	    return "Curso: " + nombreCurso +
	           "\nNotas: " + nota1 + ", " + nota2 + ", " + nota3 +
	           "\nPromedio: " + promedio() +
	           "\nEstado: " + estado() +
	           (mensaje.isEmpty() ? "" : "\nObservaciones:\n" + mensaje);
	}
}
