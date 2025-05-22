**Segunda parte de la tarea**: refactorizar un código poco expresivo y mejorarlo aplicando los cinco patrones de forma progresiva.

---

## 🧪 **Tarea: Refactoriza con propósito (Parte 2)**

### 🎯 **Objetivo**

Aplicar conscientemente cinco patrones de refactorización a un fragmento de código ya escrito, que funciona correctamente pero es mejorable.

Esta actividad te permitirá **detectar malas prácticas comunes** (nombres crípticos, lógica mezclada, valores mágicos...) y **mejorar activamente la calidad del código** sin alterar su comportamiento.

---

### 🧰 **Herramientas necesarias**

* Editor de código (INTELIJ)
* Repositorio Git local (mismo proyecto que usaste en la Parte 1)
* Descarga el repositorio de ED o, al menos, el material de la UT.
* Descarga el repositorio de tu entrega de la tarea 1.
* Descarga el enunciado de la tarea 2 cuando lo publique.

---

### 📌 **Instrucciones**

1. Copia el siguiente fragmento de código en un nuevo archivo llamado `CalculadoraFactura.java`:

```java
/**
 * Calcula el total a pagar por una factura, aplicando primero un descuento
 * al precio base recibido como parámetro y luego sumando un impuesto fijo.
 * Imprime un resumen con los valores aplicados y el total.
 */
public class CalculadoraFactura {

    public static void calcular(double pb, double d) {
        double i = 21.0; // porcentaje de impuesto fijo

        double p = pb - (pb * d / 100);
        double t = p + (p * i / 100);

        System.out.println("El precio base es: " + pb);
        System.out.println("Descuento aplicado: " + d + "%");
        System.out.println("Impuesto aplicado: " + i + "%");
        System.out.println("El total a pagar es: " + t);
    }
}
```

2. Refactoriza el código **paso a paso**, aplicando los siguientes **cinco patrones en orden**:

   * `Rename Variable`
   * `Replace Magic Number with Symbolic Constant`
   * `Introduce Explaining Variable`
   * `Inline Variable` (cuando sea oportuno)
   * `Extract Method`

3. **Haz un commit después de aplicar cada patrón**, con un mensaje claro que indique qué patrón has usado y en qué parte del código.

4. Al finalizar, asegúrate de que el código sigue funcionando correctamente...

---

### 📤 **Entrega**

* Puedes entregar un archivo `.zip` con la carpeta del proyecto y la carpeta `.git` incluida.

---

## 🧮 **Guía de calificación**

| Nota   | Descripción del desempeño                                                                                                                                                                                                                                                                                                               |
| ------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **0**  | No se entrega la tarea, o el código no compila y no se ha refactorizado.                                                                                                                                                                                                                                                                |
| **3**  | Se ha realizado parte de la refactorización (2 o 3 patrones), pero hay errores importantes o el uso de Git es incompleto o confuso.                                                                                                                                                                                                     |
| **6**  | Se han aplicado correctamente 4 o 5 patrones, aunque alguno de forma superficial o con poca justificación. Hay commits, pero no siempre bien descritos.                                                                                                                                                                                 |
| **9**  | Se han aplicado los 5 patrones correctamente, el código mejora notablemente en legibilidad. Los commits están bien organizados y explicados. Se utiliza el repositorio de la primera parte                                                                                                                                                                                    |
| **10** | Todo lo anterior, y además: se ha incluido documentación extra (comentarios explicativos, README), se han hecho mejoras no requeridas (parámetros adicionales, separación de responsabilidades, tests...), o se ha reflexionado sobre el impacto de cada refactorización en el código (por ejemplo, en un comentario o fichero aparte). |

---
