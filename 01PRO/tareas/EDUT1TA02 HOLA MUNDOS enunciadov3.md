

**Entornos de Desarrollo (ED)**  
**Unidad de Trabajo: UT1**  
**Tarea 02: Prueba varios lenguajes de programación**

### Descripción de la tarea:
En esta tarea, realizarás la implementación de un programa simple, el famoso "Hola Mundo", en varios lenguajes de programación. Esto te permitirá familiarizarte con las herramientas y procedimientos básicos para ejecutar programas en diferentes lenguajes, incluyendo lenguajes compilados e interpretados.

### Instrucciones:

1. **Lenguajes a utilizar**:
   - Se te pide que pruebes varios lenguajes de programación, tanto compilados como interpretados. Entre los lenguajes que deberás utilizar están:
     - **Bash**
     - **Python**
     - **PHP**
     - **JavaScript (Node.js)**
     - **C**
     - **Ensamblador (NASM)**
     - **Go**
     - **Lisp**

2. **Instalación de herramientas**:
   - Si tu entorno de trabajo no tiene soporte para estos lenguajes, deberás instalar los paquetes correspondientes. Se te proporcionarán las instrucciones necesarias para llevar a cabo estas instalaciones.

3. **Ejecución de los programas**:
   - Para cada lenguaje, deberás:
     - Crear un archivo script (si es aplicable) y hacer que sea ejecutable.
     - Ejecutar el script o el binario generado y verificar que el programa funcione correctamente.
   
4. **Documentación**:
   - Deberás documentar todos los pasos que sigas para cada lenguaje, explicando:
     - Cómo has escrito el código.
     - Cómo lo has ejecutado.
     - Cómo has manejado los permisos para los scripts.
   - Incluye capturas de pantalla del proceso de ejecución en la terminal para cada lenguaje, **mostrando tanto el código como el resultado de la ejecución.**


### Instrucciones de entrega:
Por un lado, la entrega debe ser un documento en formato **PDF** que contenga toda la documentación solicitada, junto con las capturas de pantalla. Asegúrate de que el documento esté correctamente formateado y estructurado.

Entrega también cada uno de los archivos que has escrito.

### Rúbrica

| Calificación | Descripción                                                                 |
|--------------|-----------------------------------------------------------------------------|
| 0            | No realiza ninguna de las etapas solicitadas o entrega incompleta.          |
| 3            | Realiza algunas etapas, pero el trabajo está incompleto o sin detalles.     |
| 6            | Completa todas las etapas, pero el análisis es superficial o incompleto.    |
| 9            | Realiza todas las etapas con un análisis detallado y presentación clara.    |
| 10           | Además de lo solicitado, el trabajo presenta un formato sobresaliente, con detalles extras como comparaciones entre lenguajes o análisis profundo de diferencias técnicas. |

## GUION

__HolaMundo en varios lenguajes de programación__

En este documento se indican los pasos que deberemos seguir para ejecutar código en distintos lenguajes de programación.

En el caso de lenguajes interpretados se indica también la forma de generar un script ejecutable. 


El código fuente para algunos lenguajes de programación está disponible en:

- https://es.wikipedia.org/wiki/Hola_mundo#Ejemplos


Plataforma usada: Ubuntu 20.04 LTS.

Lenguajes usados:
- Bash
- Python
- PHP
- Javascript (nodejs)
- C
- Ensamblador (nasm)
- Go
- [Lisp]([enlaceweb.html](https://miguitel.github.io/ED/01/ED01_lisp.html))

Para tener soporte para los lenguajes anteriores, debemos instalar los siguientes paquetes:

### En linux, inicio -> terminal

```
sudo  apt  install  python3  php  nodejs  gcc  g++  nasm  golang  clisp
```

--- 

## Bash

### Pasos

1 Estos comandos son propios de linux y se pueden ejecutra directamente en la terminal.

2 Escribimos las sentencias y luego pulsamos INTRO.

```bash
echo "Hola Mundo"
```


### Script ejecutable

1 Editamos archivo __hola.sh__ con nano 

```bash
nano hola.sh
# esto abrirá un editor de texto sencillo
```

En el archivo, escribimos:

```bash

#!/usr/bin/env bash

echo "hola mundo desde BASH"
```

* Para salir del editor de texto nano: `Ctrl` + `x`

* Aceptar con `Y` o `S`

* Pulsa `Enter` para mantener el nombre del archivo


2 Damos permisos de ejecución

```bash
chmod  +x  hola1sh
```

3 Ejecutamos

```bash
./hola1sh
```

--- 

## Python

### Pasos

1 Ejecutamos el intérprete.  

```bash
python3
```

2 Escribimos las sentencias y luego pulsamos INTRO.

```python
print ("Hola Mundo desde PYTHON")
```

3 Para salir del intérprete pulsamos `CTRL+D`.  


### Script ejecutable

1 Editamos archivo __hola2.py__ con nano con nano:

```python
#!/usr/bin/env python3

print ("Hola mundo python")
```


2 Damos permisos de ejecución

```bash
chmod  +x  hola2.py
```

3 Ejecutamos

```bash
./hola2.py
```

--- 

## PHP

### Pasos

1 Ejecutamos el intérprete.  

```bash
php -a
```

2 Escribimos las sentencias.

```php
echo "Hola mundo php\n";
```

3 Para salir del intérprete pulsamos `CTRL+D`.   


### Script ejecutable

1 Editamos archivo __hola3.php__ con nano:

```php
#!/usr/bin/env php

<?php 
  echo "Hola mundo php\n" 
?>
```

2 Damos permisos de ejecución

```bash
chmod  +x  hola3.php
```

3 Ejecutamos

```bash
./hola3.php
```

--- 

## Javascript (nodejs)

### Pasos

1 Ejecutamos el intérprete.  

```bash
node
```

2 Escribimos las sentencias y luego pulsamos INTRO.

```javascript
console.log('Hola mundo js');
```

3 Para salir del intérprete pulsamos `CTRL+D`.  



## C

### Pasos 

1 Editamos archivo __hola4.c__ con nano:

```c 
#include <stdio.h>

int main()
{
    printf("¡Hola, mundo c!");
    return 0;
}
```

2 Compilamos y enlazamos

```bash
gcc  -o  hola4  hola4.c      # Compilamos y enlazamos
```

3 Ejecutamos

```bash
./hola4                    # Ejecutamos
```
--- 




## Ensamblador (nasm)

### Pasos

1 Editamos archivo __hola5.asm__ con nano 

```nasm
 section .data
 
 msg     db "¡Hola Mundo ensamblador!", 0Ah
 len     equ     $ - msg  
 
 section .text
 
 global _start
 
 _start:
        mov     eax, 04h
        mov     ebx, 01h
        mov     ecx, msg
        mov     edx, len
        int     80h
        mov     eax, 01h
        mov     ebx, 00h
        int     80h
```

2 Ensamblamos y enlazamos

```bash
nasm  -f  elf64  hola5.asm        # Ensamblado para ELF64
ld  hola5.o  -o  holaen             # Enlazado y generación de ejecutable
```

3 Ejecutamos

```bash
./holaen                          # Ejecución
```
--- 


## Go

### Pasos

1 Editamos archivo __hola6.go__ con nano 

```go
package main

import "fmt"

func main() {
        fmt.Println("Hola mundo desde Go")
}
```

2 Compilamos y enlazamos

```bash
go  build  hola6.go   # Compilamos y enlazamos
```

3 Ejecutamos

```bash
./hola6              # Ejecutamos
```

4. Si lo deseamos,en Go también es posible interpretar el código

```bash
go  run  hola6.go     # Interpretamos y ejecutamos
```

--- 


## Lisp

### Pasos

1 Ejecutamos el intérprete.  

```bash
clisp
```

2 Escribimos las sentencias y luego pulsamos INTRO.

```lisp
(format t "¡Hola, mundo!")
```

3 Para salir del intérprete pulsamos CTRL+D.  


### Script ejecutable

1 Editamos archivo __hola7.lisp__ con nano

```lisp
#!/usr/bin/env clisp

(format t "¡Hola, mundo desde LISP!")
```


2 Damos permisos de ejecución

```bash
chmod  +x  hola7.lisp
```

3 Ejecutamos

```bash
./hola7.lisp
```


