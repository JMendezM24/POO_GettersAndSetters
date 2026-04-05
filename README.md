# POO_GettersAndSetters
Este repositorio contiene una serie de ejercicios enfocados en el uso de **encapsulamiento, validaciones y lógica de negocio** en Java.

---

## 📌 Contenido de los Ejercicios

### 1) 🧑‍💻 Persona Encapsulada

* Uso de atributos `private`
* Implementación de getters y setters
* Validación de edad (no negativa)

---

### 2) 🛒 Producto con Validaciones

* Validación de precio (> 0)
* Validación de stock (≥ 0)
* Método `vender(int cantidad)` con control de inventario

---

### 3) 🔐 Cuenta con PIN

* Validación de seguridad con PIN
* Método `retirar()` con verificación de credenciales

---

### 4) 📚 Curso y Calificaciones

* Validación de notas (0 - 100)
* Cálculo de promedio
* Determinación de estado: **Aprobado / Reprobado**

---

### 5) 🎓 Estudiante y Beca

* Validación de promedio
* Método `esBecado()`

---

### 6) 🌡️ Termómetro Inteligente

* Validación del cero absoluto (-273.15 °C)
* Conversión a Fahrenheit

---

### 7) 🕒 Reloj con Formato

* Validación de hora, minuto y segundo
* Formato de salida **HH:MM:SS**

---

### 8) 📱 Contacto con Teléfono

* Validación de teléfono (8 dígitos)
* Validación de email
* Formato uniforme del número telefónico

---

### 9) 🎮 Juego con Puntaje Máximo

* Control de puntaje actual y máximo
* Registro de intentos e historial

---

### 10) 🧾 Factura con Total

* Validación de cantidad y precio
* Cálculo automático del total

---

## ⚙️ Decisiones de Implementación

### 📝 Uso del atributo `String mensaje`

Se implementó para:

* Registrar errores o validaciones fallidas
* Evitar múltiples `System.out.println`
* Mantener un historial ordenado de eventos

👉 Permite una salida más limpia y profesional.

---

### 🔧 Uso de setters dentro del constructor

```java
setAtributo(valor);
```

Se utiliza en lugar de asignación directa para:

* Reutilizar la lógica de validación
* Evitar duplicar código
* Garantizar que los datos siempre sean válidos desde la creación del objeto

---

### 🎓 Uso de operador ternario en métodos booleanos

```java
(esBecado() ? "Sí" : "No")
```

Se usa para:

* Convertir un valor booleano en texto legible
* Mejorar la presentación en consola
* Hacer el código más compacto y claro

---

### 📱 Formato del teléfono (Contacto)

El teléfono se guarda internamente sin formato (solo números), pero se muestra con guion:

Ejemplo:

```
12345678 → 1234-5678
```

Esto se hizo para:

* Permitir múltiples formatos de entrada (con espacio, guion o sin ellos)
* Mantener consistencia en la salida
* Separar la lógica de almacenamiento y presentación

---

## 💡 Conceptos Aplicados

* Encapsulamiento
* Validación de datos
* Uso de getters y setters
* Métodos de negocio
* Manejo de errores sin interrumpir el programa
* Formateo de salida

---

## 🚀 Autor

**Daniel Méndez**

---

## 📌 Notas

Estos ejercicios están diseñados para reforzar buenas prácticas en Java y servir como base para proyectos más avanzados.
