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
		ejercicioReloj();
		ejercicioContacto();
		ejercicioJugador();
		ejercicioFactura();
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
		
		System.out.println("\n===== EJERCICIO 6: TERMOMETRO =====");
		Termometro t1 = new Termometro(25);
        Termometro t2 = new Termometro(-300);

        System.out.println("---Termómetro 1---");
        System.out.println(t1);

        System.out.println("\n---Termómetro 2---");
        System.out.println(t2);
		
	}
	
	private static void ejercicioReloj() {
		
		System.out.println("\n===== EJERCICIO 7: RELOJ CON FORMATO =====");
		Reloj reloj1 = new Reloj(10, 30, 45);
        Reloj reloj2 = new Reloj(25, 15, 20);
        Reloj reloj3 = new Reloj(12, 70, -5);

        System.out.println(reloj1);
        System.out.println(reloj2);
        System.out.println(reloj3);
		
	}
	
	private static void ejercicioContacto() {
		
		System.out.println("\n===== EJERCICIO 8: CONTACTO =====");
		Contacto c1 = new Contacto("Juan", "1234-5678", "juan@gmail.com");		//
	    Contacto c2 = new Contacto("Ana", "22345678", "ana@gmail.com");         //Varios contactos con formatos de numeros diferentes
	    Contacto c3 = new Contacto("David", "3234 5678", "david@gmail.com");	//
	    Contacto c4 = new Contacto("Maria", "4234567", "maria.gmail.com");

        System.out.println("---Contacto 1---");
	    System.out.println(c1.mostrarContacto());
	    
        System.out.println("---Contacto 2---");
	    System.out.println(c2.mostrarContacto());
	    
        System.out.println("---Contacto 3---");
	    System.out.println(c3.mostrarContacto());
	    
        System.out.println("---Contacto 4---");
	    System.out.println(c4.mostrarContacto());
	}
	
	private static void ejercicioJugador() {
		
		System.out.println("\n===== EJERCICIO 9: JUGADOR =====");
        Jugador j1 = new Jugador("Carlos");
        j1.actualizarPuntaje(50);
        j1.actualizarPuntaje(180);
        j1.actualizarPuntaje(100);

        Jugador j2 = new Jugador("Ana");
        j2.actualizarPuntaje(-10);
        j2.actualizarPuntaje(40);

        System.out.println(j1.mostrarJugador());
        System.out.println(j2.mostrarJugador());
        // Determinar el jugador con mayor puntaje máximo
        Jugador mejor;

        if (j1.getPuntajeMaximo() > j2.getPuntajeMaximo()) {
            mejor = j1;
        } else {
            mejor = j2;
        }

        System.out.println("🏆 Mejor jugador:");
        System.out.println("Nombre: " + mejor.getNombre() +
                           " | Puntaje máximo: " + mejor.getPuntajeMaximo());
	}
	
	private static void ejercicioFactura() {
		
		System.out.println("\n===== EJERCICIO 10: FACTURA =====");
		// Factura válida
        Factura f1 = new Factura("F001", "Teclado", 2, 150.50);

        // Factura con errores en cantidad y precio
        Factura f2 = new Factura("F002", "Mouse", -3, 0);
        
        // Factura con nombre y descripcion invalidos
        Factura f3 = new Factura("","", 5, 6);
        
        System.out.println("\n---Factura 1---");
        System.out.println(f1.mostrarFactura());
        
        System.out.println("\n---Factura 2---");
        System.out.println(f2.mostrarFactura());
        
        System.out.println("\n---Factura 3---");
        System.out.println(f3.mostrarFactura());

	}

}
