# Práctica: Primeros pasos con el depurador en IntelliJ

## Objetivo

Familiarizarse con el uso del *debugger* para:
- Observar la evolución de variables dentro de bucles y condiciones.
- Analizar el comportamiento paso a paso de estructuras de control como `for` y `while`.
- Identificar valores clave en puntos concretos de la ejecución.

---

## Parte 1: Suma y conteo de múltiplos

### Código a analizar

```java
public class ContadorConCondicion {
    public static void main(String[] args) {
        int suma = 0;
        int contadorMultiplos = 0;

        for (int i = 1; i <= 50; i++) {
            suma += i;

            if (i % 3 == 0) {
                contadorMultiplos++;
            }

            if (i == 33) {
                System.out.println("Punto de control alcanzado");
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Multiplos de 3 encontrados: " + contadorMultiplos);
    }
}
```

### Preguntas para responder usando el *debugger*

1. ¿Cuál es el valor de `suma` cuando `i == 10`?
2. ¿Cuál es el valor de `contadorMultiplos` cuando `i == 33`?
3. ¿Cuál es el valor de `i` cuando contador de múltiplos supera `5`?

---

## Parte 2: Búsqueda binaria

### Código a analizar

```java
import java.util.Arrays;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};
        int objetivo = 10;
        int izquierda = 0;
        int derecha = numeros.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int valor = numeros[medio];

            if (valor == objetivo) {
                System.out.println("Encontrado en la posición " + medio);
                break;
            } else if (valor < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
    }
}
```

### Preguntas para responder usando el *debugger*

1. ¿Cuáles son los valores de `izquierda`, `derecha`, `medio` y `valor` en la segunda iteración?
2. ¿En qué iteración se encuentra el valor objetivo?
3. ¿Qué ocurre si cambias `objetivo = 7`? Usa el *debugger* para observar cuántas iteraciones se ejecutan.

---

## Entrega

Responde a las preguntas en un documento o en este mismo archivo (completado en formato `.md`).
Incluye capturas de pantalla que demuestren tu uso del *debugger*.
Entrega el archivo final exportado como PDF.

