## DISEÑO DE PRUEBAS UTILIZANDO EL ENFOQUE DEL CAMINO BÁSICO

#### Rúbrica y guía de calificación:
- [ ] Se explica el código. *Nota total 3*
- [ ] Grafo de flujo correcto.
- [ ] Complejidad ciclomática correcta. *Nota total 6*
- [ ] Determina la rutas correpondientes.
- [ ] Crea la tabla formalmente correcta con los datos correctos resultantes del análisis anterior. *Nota total 9*

#### Explica el funcionamiento del siguiente código

```java
public class ComparadorNumeros {

    public static void compararNumeros(int num1, int num2) {
        System.out.println("Voy a comparar dos números para determinar cuáles son mayores que 10.");
        
        if (num1 > 10) {
            if (num2 > 10) {
                System.out.println("Both are greater");
            } else {
                System.out.println("First is greater");
            }
        } else {
            if (num2 > 10) {
                System.out.println("Second is greater");
            } else {
                System.out.println("None is greater");
            }
        }

        System.out.println("Ya he terminado la comparación.");
    }
}
```
  
***Inserta aquí la explicación…***

#### Diseña el conjunto de pruebas de caja blanca para el anterior fragmento de código, utilizando el enfoque de prueba de ruta básica explicado anteriormente.
* Numera las sentencias…
* Dibuja el grafo de flujo…
* Calcula la complejidad ciclomática…
#### Determina las rutas de acceso correspondientes que se van a probar.
* Tabla con las rutas…
#### Escribe los casos de prueba para probar cada ruta utilizando una tabla.
* Tabla con los casos de prueba…


 