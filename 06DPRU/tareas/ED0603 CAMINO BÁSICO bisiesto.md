## DISEÑO DE PRUEBAS UTILIZANDO EL ENFOQUE DEL CAMINO BÁSICO

#### Rúbrica y guía de calificación:
- [ ] Se explica el código. *Nota total 3*
- [ ] Grafo de flujo correcto.
- [ ] Complejidad ciclomática correcta. *Nota total 6*
- [ ] Determina la rutas correpondientes.
- [ ] Crea la tabla formalmente correcta con los datos correctos resultantes del análisis anterior. *Nota total 9*

#### Explica el funcionamiento del siguiente código

```java
public class Bisiesto {

    public static boolean esBisiesto(int year) {
        System.out.println("Voy a determinar si el año " + year + " es bisiesto.");

        boolean result = false;

        if (year % 4 == 0) {
            result = true;

            if (year % 100 == 0) {
                result = false;

                if (year % 400 == 0) {
                    result = true;
                }
            }
        }

        System.out.println("He terminado la comprobación. ¿Es bisiesto? " + result);
        return result;
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


 