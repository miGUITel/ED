## EJEMPLO DE USO DEL DEPURADOR

###  Propuesta: Buscar el número más grande en un array

---

### Método propuesto

> Determina cual el el número mayor en un array de enteros:

```java
public class Mayorv1 {

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        int[] datos = {3, 7, 2, 9, 5};
        int resultado = encontrarMayor(datos);
        System.out.println("El número mayor es: " + resultado);
    }
}
```

---

### 🔍 Comprobaciones con el *debugger* de IntelliJ:

1. **Poner un *breakpoint*** en la línea `if (numeros[i] > mayor)`.
2. Ejecutar el programa en modo *debug*. (icono del bicho verde)
3. Observar paso a paso:
   - Cómo se compara cada número.
   - Cuándo se actualiza la variable `mayor`.
   - Qué contiene la variable `i` en cada vuelta.
4. Probar con diferentes arrays para ver cómo cambia el comportamiento.

---

### Preguntas para fomentar el razonamiento:

- ¿Qué valor tiene `mayor` en cada iteración?
- ¿Por qué empezamos el bucle en `i = 1`?
- ¿Qué ocurriría si el array tuviera todos los números iguales?
- ¿Y si el array estuviera vacío?

---

### Otra versión
```java
public class Mayorv2 {

    public static int encontrarMayor(int[] numeros) {
        int mayor = 0; //Cambio <------

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        int[] datos = {-3, -7, -2, -9, -5};//Cambio <------
        int resultado = encontrarMayor(datos);
        System.out.println("El número mayor es: " + resultado);
    }
}
```