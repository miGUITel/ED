## [ED](../README.md)

- [ED](#ed)
- [Preprocesado y enlazado: manejo de librerías](#preprocesado-y-enlazado-manejo-de-librerías)
  - [1. **Preprocesado:**](#1-preprocesado)
  - [2. **Enlazado:**](#2-enlazado)
  - [**Diferencia clave**:](#diferencia-clave)
- [Ejemplo en C:](#ejemplo-en-c)
  - [Código fuente original (antes del preprocesado):](#código-fuente-original-antes-del-preprocesado)
  - [Después del **preprocesado**:](#después-del-preprocesado)
  - [¿Qué ocurre aquí?](#qué-ocurre-aquí)
- [Otros lenguajes](#otros-lenguajes)
  - [1. **C++**:](#1-c)
  - [2. **Objective-C**:](#2-objective-c)
  - [3. **Fortran**:](#3-fortran)
  - [4. **Ada**:](#4-ada)
  - [5. **Rust**:](#5-rust)
  - [6. **Go**:](#6-go)
  - [7. **Swift**:](#7-swift)
  - [Lenguajes con **menos** enfoque en preprocesado pero con **enlazado**:](#lenguajes-con-menos-enfoque-en-preprocesado-pero-con-enlazado)
  - [Conclusión:](#conclusión)


## Preprocesado y enlazado: manejo de librerías

Tanto el preprocesado como el enlazado están involucrados con el manejo de las librerías, pero cumplen roles muy diferentes en el proceso de compilación. Vamos a desglosar cada uno de ellos:

### 1. **Preprocesado:**
El preprocesador es la primera etapa en el proceso de compilación. Aquí, el compilador expande las directivas del preprocesador que comienzan con `#` (como `#include`, `#define`, etc.). En este contexto, las librerías no son vinculadas o "cargadas", sino que se *expanden* los archivos de cabecera (los `.h` o `.hpp`), que contienen las declaraciones de funciones y variables.

- **Cabeceras**: Cuando se usa `#include <libreria.h>`, el preprocesador simplemente copia el contenido del archivo de cabecera especificado directamente en el código fuente. Estas cabeceras solo contienen *declaraciones* de funciones (no su implementación) y otras definiciones útiles (como macros, constantes, estructuras, etc.).
  
- **Ejemplo:**
   ```c
   #include <stdio.h>  // Incluye la declaración de printf

   int main() {
       printf("Hola, mundo!\n");
       return 0;
   }
   ```
   En esta fase, `#include <stdio.h>` simplemente "pega" las declaraciones de las funciones y variables necesarias para que el compilador sepa cómo está estructurada la función `printf`.

### 2. **Enlazado:**
El enlazado es el último paso del proceso de compilación. Aquí es donde las implementaciones reales de las funciones declaradas en los archivos de cabecera son conectadas con tu programa. Las librerías se vinculan en esta fase, uniendo los *objetos compilados* (archivos `.o` o `.obj`) con las definiciones de funciones que realmente hacen que el programa funcione.

- **Librerías estáticas y dinámicas**: El enlazador toma el código objeto (resultado de la compilación de los archivos `.c` o `.cpp`) y lo combina con el código de las librerías, resolviendo referencias a funciones y variables. Dependiendo del tipo de librería, esta puede ser incorporada directamente en el binario (librerías estáticas) o referenciada externamente (librerías dinámicas).

- **Ejemplo (continuación del anterior)**:
  En el preprocesado, se ha expandido la cabecera `stdio.h` para obtener las declaraciones de funciones como `printf`. En el paso de enlazado, el enlazador conecta tu código con la implementación de `printf`, que puede estar en una librería como `libc.so` (en sistemas Unix) o `msvcrt.dll` (en Windows), entre otras.

### **Diferencia clave**:

- **Preprocesado**: Solo se copian las *declaraciones* de las funciones (cabeceras) en tu código. En esta etapa, no hay ningún código funcional conectado todavía.
  
- **Enlazado**: Se asocian las *implementaciones* de esas funciones, que se encuentran en las librerías (estáticas o dinámicas). Aquí es donde se resuelven las referencias para que las funciones realmente puedan ser ejecutadas.



## Ejemplo en C:

### Código fuente original (antes del preprocesado):
```c
#include <stdio.h>

int main() {
    printf("Hola, mundo!\n");
    return 0;
}
```

### Después del **preprocesado**:
El preprocesador reemplaza la directiva `#include <stdio.h>` con el contenido del archivo de cabecera `stdio.h`. Esto incluye muchas definiciones, macros, y declaraciones de funciones. El resultado puede ser bastante extenso, pero para ilustrarlo, mostraré una versión simplificada:

```c
/* Contenido expandido de stdio.h (simplificado) */
typedef struct _IO_FILE FILE;
extern FILE *stdin;
extern FILE *stdout;
extern FILE *stderr;

int printf(const char *format, ...);

/* Fin de stdio.h */

int main() {
    printf("Hola, mundo!\n");
    return 0;
}
```

### ¿Qué ocurre aquí?

- La directiva `#include <stdio.h>` ha sido reemplazada con el contenido del archivo de cabecera, en este caso la declaración de la función `printf` y otras definiciones que forman parte del sistema de entrada/salida estándar en C.
- En este punto, **no se ha incluido** el código de la implementación de `printf`, solo su declaración. La implementación real se vinculará durante el enlazado con la librería correspondiente (como la `libc` en sistemas Unix).

En resumen, después del preprocesado, el archivo ya no tiene directivas como `#include`. En su lugar, tiene las definiciones y declaraciones de funciones, estructuras y variables que vienen de esos archivos de cabecera. Este archivo preprocesado será el que se pasará a la fase de compilación.

## Otros lenguajes

El proceso de preprocesado y enlazado es característico de lenguajes de programación compilados, especialmente aquellos que se basan en archivos de cabecera y módulos externos para estructurar el código. Sin embargo, no todos los lenguajes tienen un preprocesador como el de C/C++, pero algunos siguen un flujo similar. Aquí algunos ejemplos:

### 1. **C++**:
   - Al igual que en C, en C++ también existen las fases de preprocesado, compilación y enlazado. Las directivas como `#include`, `#define`, `#if`, y otras son manejadas por el preprocesador, que luego expande el contenido de los archivos de cabecera antes de compilar.
   - El proceso de enlazado es casi idéntico al de C, ya que ambos lenguajes comparten una herencia común.

### 2. **Objective-C**:
   - Este lenguaje, utilizado para el desarrollo en macOS e iOS, también tiene un proceso similar, basado en la estructura de archivos de cabecera (`.h`) y de implementación (`.m`). Usa un preprocesador como en C, ya que Objective-C se basa en C.
   - El proceso de enlazado también es crucial para conectar el código con las librerías de Cocoa o UIKit.

### 3. **Fortran**:
   - Aunque Fortran es un lenguaje antiguo, el proceso de compilación también incluye fases de compilación y enlazado. No tiene un preprocesador tan prominente como el de C, pero en versiones modernas se puede utilizar preprocesado con directivas similares a las de C, como `#include` y `#define`.
   
### 4. **Ada**:
   - En Ada, el proceso de compilación también involucra enlazado. Aunque no tiene un preprocesador como en C, los programas Ada generalmente se dividen en "especificaciones" (similar a las cabeceras en C) e "implementaciones", que se combinan en el enlazado final.
   
### 5. **Rust**:
   - Rust no tiene un preprocesador como C/C++, pero sigue un flujo de compilación y enlazado. Los módulos en Rust se organizan en archivos separados y se enlazan en tiempo de compilación para formar el binario final. El manejo de las dependencias de bibliotecas externas se realiza a través de un sistema de paquetes (Cargo), que gestiona el enlazado.
   
### 6. **Go**:
   - En Go, no existe un preprocesador en el sentido tradicional, pero también hay un proceso de enlazado. Las bibliotecas o paquetes son gestionados por el sistema de paquetes de Go, y durante el proceso de compilación se resuelven las referencias a funciones y bibliotecas. Al final, el enlazador une todo para formar el binario final.
   
### 7. **Swift**:
   - Al igual que en Objective-C, Swift sigue un proceso de compilación y enlazado. Aunque no tiene un preprocesador como tal, sí usa un proceso de compilación similar, donde se conectan librerías externas (como las de iOS o macOS) en la fase de enlazado.

### Lenguajes con **menos** enfoque en preprocesado pero con **enlazado**:
   Algunos lenguajes que no tienen un preprocesador explícito pero sí un proceso de enlazado para combinar el código con librerías incluyen:
   - **Java**: Aunque Java no tiene un preprocesador tradicional, el proceso de compilación de archivos `.java` en bytecode y la posterior carga de clases externas en tiempo de ejecución implica cierto tipo de "enlazado dinámico" cuando el programa accede a bibliotecas externas (JARs).
   - **C#**: Similar a Java, C# no tiene un preprocesador, pero el proceso de compilación incluye un enlazado con bibliotecas externas (en tiempo de compilación o de ejecución).
   - **Python, Ruby, JavaScript**: Estos lenguajes interpretados no tienen preprocesado ni enlazado en la forma tradicional, aunque pueden cargar módulos y paquetes en tiempo de ejecución.

### Conclusión:
El proceso de **preprocesado** es más específico de lenguajes como **C** y **C++**, donde las directivas como `#include` y `#define` son comunes. Sin embargo, el **enlazado** es una parte esencial de muchos lenguajes compilados (como **C, C++, Rust, Go, Swift**), donde se conectan las implementaciones de las funciones y se crean los binarios ejecutables. Otros lenguajes, como **Java** o **C#**, dependen más de un enlazado dinámico en tiempo de ejecución, en lugar de uno estático en tiempo de compilación.