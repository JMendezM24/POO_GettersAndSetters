package Encapsulacion2;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Iniciando resultados del programa---");
		ejercicioPersona();
		ejercicioProducto();
		ejercicioCuentaBancaria();
		ejercicioCurso();
		ejercicioEstudianteBeca();
		ejercicioTermometro();
	}

	private static void ejercicioPersona() {
		System.out.println("\n===== EJERCICIO 1: PERSONA ENCAPSULADA =====");
		//Creación de objetos
        Persona p1 = new Persona("Lara", "Croft", 29);
        Persona p2 = new Persona("John", "Espartan", 35);
        Persona p3 = new Persona("Leon", "Kennedy", 30);
        
      System.out.println("---Datos iniciales de P1---");
        p1.mostrar();
       
        //Datos de prueba
        p1.setNombre("Laura");
        p1.setApellido("Sandoval");
        p1.setEdad(-29);
        
        System.out.println("---Datos modificados de P1---");
   
        //Mostrar resultados
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
	}
	
	private static void ejercicioProducto() {
		
		System.out.println("\n===== EJERCICIO 2: PRODUCTO =====");	
		Producto p1 = new Producto("A001", "Laptop", 6000, 10);
		Producto p2 = new Producto("A002", "Impresora", 2500, 15);
		
		//Informacion de Producto 1 con varias acciones
		// Prueba de venta invalida
		p1.vender(-1);
		// Prueba de venta válida
        p1.vender(3);
        // Prueba de venta sin stock suficiente
        p1.vender(10);
        
		System.out.println("---Producto 1---");		
		System.out.println(p1);
		
        //Datos invalidos P2
        p2.setPrecio(-2500);
        p2.setStock(-15);
		System.out.println("\n---Producto 2---");
		System.out.println(p2);
	}
	
	private static void ejercicioCuentaBancaria() {
		
		System.out.println("\n===== EJERCICIO 3: CUENTA BANCARIA =====");	
		CuentaBancaria cb1 = new CuentaBancaria ("Daniel", 1500, 2026);
		CuentaBancaria cb2 = new CuentaBancaria ("Josue", -1200, -2026);
		
		 // Intento con PIN incorrecto
        cb1.retirar(200, 1111);

        // Intento con monto invalido
        cb1.retirar(-200, 2026);
        
        // Intento con PIN correcto
        cb1.retirar(200, 2026);

        // Intento con más dinero del saldo disponible
        cb1.retirar(2000, 2026);

        System.out.println(cb1);
        
        // Prueba con dators iniciales invalidos
        System.out.println(cb2);
	}
	
	private static void ejercicioCurso() {
		
		System.out.println("\n===== EJERCICIO 4: CURSO =====");	
		Curso c1 = new Curso("Calculo", 70, 80, 90);
        Curso c2 = new Curso("Programación I", 50, -20, 110);

        System.out.println("---Curso 1---");
        System.out.println(c1);

        System.out.println("\n---Curso 2---");
        System.out.println(c2);
	}
	
	private static void ejercicioEstudianteBeca() {
		
		System.out.println("\\n===== EJERCICIO 5: ESTUDIANTE Y BECA =====");

        Estudiante e1 = new Estudiante("2026001", "Daniel", 90);
        Estudiante e2 = new Estudiante("2026002", "Ana", 60);
        Estudiante e3 = new Estudiante("2026003", "Luis", -150);

        System.out.println("---Estudiante 1---");
        System.out.println(e1);

        System.out.println("\n---Estudiante 2---");
        System.out.println(e2);

        System.out.println("\n---Estudiante 3---");
        System.out.println(e3);
	}
	
	private static void ejercicioTermometro() {
		
	}
}
