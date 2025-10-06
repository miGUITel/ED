# 0103

Buscar el archivo stdio en mi sistema de archivos linux y ver qué tiene dentro

```
find /usr/include -name stdio.h
nano /usr/include/stdio.h

```

recordar cómo se llama lo que define el #define: MACRO
En lugar de usar el nano prueba con otro editor de texto
Probar a sustituir en printf(MESSAGE) por ("hola estudiante")
Mostrar el binario


Se pueden usar varias opciones para visualizar el objeto y el ejecutable:

## Visualizar ejecutables en hexadecimal y binario

A continuación hay comandos útiles para inspeccionar un archivo binario (por ejemplo un ejecutable).

### xxd (hexadecimal)

Comando básico (hex + ASCII):

```bash
xxd archivo
```

Mostrar solo hexadecimal continuo (sin ASCII):

```bash
xxd -p archivo
```

Opciones comunes:
- `-c N` : bytes por línea (ej. `-c 16`).
- `-g N` : agrupar en palabras de N bytes (ej. `-g 4`).
- `-s OFFSET` : empezar desde offset (ej. `-s 0x100`).
- `-l LEN` : mostrar solo LEN bytes.

Ejemplo mostrando primeros 64 bytes en hex agrupado por 4:

```bash
head -c 64 archivo | xxd -g 4 -c 16
```

### xxd para ver binario (bits)

`xxd` puede mostrar la representación binaria por byte con `-b`:

```bash
xxd -b archivo
```

Ejemplo, solo primeros 32 bytes en binario:

```bash
head -c 32 archivo | xxd -b -c 16
```

### hexdump (alternativa)

`hexdump` puede producir una salida similar a `xxd -C` (hex + ASCII):

```bash
hexdump -C archivo
```

Para mostrar solo bytes hex separados:

```bash
hexdump -v -e '1/1 "%02X "' archivo
```

¿

### Resumen rápido de comandos útiles

```bash
# hex + ASCII (similar a hexdump -C)
xxd archivo

# hex solo (plain)
xxd -p archivo

# binario (por byte)
xxd -b archivo

# hexdump estilo canonical
hexdump -C archivo

# mostrar primeros 64 bytes y convertir a binario con python
head -c 64 archivo | python3 -c "import sys; data=sys.stdin.buffer.read(); print('\n'.join(' '.join(f'{b:08b}' for b in data[i:i+16]) for i in range(0,len(data),16)))"
```

---
