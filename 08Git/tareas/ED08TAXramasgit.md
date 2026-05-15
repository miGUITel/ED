## Tarea Git: ramas `producción` y `desarrollo`

### Introducción

En un proyecto real no suele ser buena idea modificar directamente la versión que funciona. Lo habitual es mantener una rama estable, que representa el estado “correcto” del proyecto, y trabajar los cambios en otra rama separada.

En esta práctica vamos a simular ese flujo usando dos ramas:

* `producción`: versión estable del proyecto.
* `desarrollo`: zona de trabajo donde se preparan cambios antes de incorporarlos a producción.

El archivo de trabajo será un documento Markdown llamado:

```text
historial-proyecto.md
```

La práctica está relacionada con el uso del **control de versiones** dentro del entorno de desarrollo. 

---

# Antes de empezar: ideas clave

## ¿Qué es una rama?

Una rama es una línea de trabajo dentro del repositorio.

Por ejemplo:

```text
producción
```

puede representar la versión estable del proyecto, mientras que:

```text
desarrollo
```

puede representar los cambios que todavía se están preparando.

Mientras trabajas en `desarrollo`, la rama `producción` no cambia.

---

## Comandos importantes

### Ver las ramas existentes

```bash
git branch
```

La rama en la que estás aparece marcada con un asterisco `*`.

---

### Crear una rama nueva

```bash
git branch nombre-rama
```

Ejemplo:

```bash
git branch desarrollo
```

---

### Cambiar de rama

```bash
git switch nombre-rama
```

Ejemplo:

```bash
git switch desarrollo
```

---

### Crear una rama y cambiarte a ella directamente

```bash
git switch -c nombre-rama
```

Ejemplo:

```bash
git switch -c desarrollo
```

---

### Fusionar una rama con la rama actual

Primero debes estar situado en la rama que va a recibir los cambios.

Por ejemplo, si quieres incorporar los cambios de `desarrollo` a `producción`, primero te colocas en `producción`:

```bash
git switch producción
```

Después haces el merge:

```bash
git merge desarrollo
```

La idea es:

```text
Estoy en producción y quiero traer aquí los cambios de desarrollo.
```

---

# Desarrollo de la práctica

## Preparación inicial

Partimos de un repositorio Git ya creado.

Crea un archivo llamado:

```text
historial-proyecto.md
```

Con este contenido inicial:

```md
# Historial del proyecto

Este documento recoge los cambios principales realizados durante el desarrollo del proyecto.
```

Realiza un commit inicial con el mensaje:

```bash
git add historial-proyecto.md
git commit -m "Crear historial inicial del proyecto"
```

Ahora crea la rama `producción`:

```bash
git branch producción
```

Cámbiate a ella:

```bash
git switch producción
```

A partir de este momento, `producción` será la rama estable.

---

## 1. No modificamos nada en producción

Comprueba que estás en la rama `producción`:

```bash
git branch
```

No modifiques el archivo.

Ahora crea la rama `desarrollo` a partir de `producción` y cámbiate a ella:

```bash
git switch -c desarrollo
```

Comprueba de nuevo la rama actual:

```bash
git branch
```

Debes estar en:

```text
desarrollo
```

---

## 2. Escribimos en desarrollo

Abre el archivo `historial-proyecto.md` y añade este contenido:

```md
## Versión 1

Se ha creado la primera estructura del proyecto.

Cambios realizados:

- Creación del documento principal.
- Preparación del historial de cambios.
- Organización inicial del trabajo con Git.
```

Guarda el archivo.

Haz un commit en la rama `desarrollo`:

```bash
git add historial-proyecto.md
git commit -m "Añadir primera versión en desarrollo"
```

Comprueba el historial:

```bash
git log --oneline
```

### Pregunta 1

¿En qué rama se ha realizado este cambio?

---

## 3. Mergeamos desarrollo con producción

Ahora vamos a incorporar el trabajo de `desarrollo` a `producción`.

Cámbiate a la rama `producción`:

```bash
git switch producción
```

Comprueba el contenido de `historial-proyecto.md`.

Después fusiona los cambios de `desarrollo`:

```bash
git merge desarrollo
```

Vuelve a abrir `historial-proyecto.md`.

### Pregunta 2

¿Qué ha cambiado en `producción` después del `merge`?

---

## 4. Modificamos de nuevo en desarrollo

Vuelve a la rama `desarrollo`:

```bash
git switch desarrollo
```

Edita el archivo `historial-proyecto.md` y añade una nueva sección:

```md
## Versión 2

Se han añadido nuevas mejoras al proyecto.

Cambios realizados:

- Revisión de la estructura del documento.
- Añadida una segunda versión del historial.
- Preparación del proyecto para futuras ampliaciones.
```

Guarda el archivo y realiza un nuevo commit:

```bash
git add historial-proyecto.md
git commit -m "Añadir segunda versión en desarrollo"
```

### Pregunta 3

¿Por qué es razonable hacer estos cambios primero en `desarrollo` y no directamente en `producción`?

---

## 5. Mergeamos otra vez con producción

Vuelve a la rama `producción`:

```bash
git switch producción
```

Comprueba el contenido del archivo antes de fusionar.

Ahora incorpora de nuevo los cambios de `desarrollo`:

```bash
git merge desarrollo
```

Comprueba el contenido final de `historial-proyecto.md`.

### Pregunta 4

Después del segundo `merge`, ¿qué versiones aparecen ya en `producción`?

---

## 6. Comprobar el historial completo

Ejecuta:

```bash
git log --oneline --graph --all
```

Observa cómo aparecen las ramas y los commits.

### Pregunta 5

¿Qué utilidad tiene ver el historial con `--graph --all`?

---

# Entrega

Entrega un documento PDF con:

1. Captura donde se vea el resultado de:

```bash
git branch
```

2. Captura del archivo `historial-proyecto.md` en la rama `desarrollo`.

3. Captura del archivo `historial-proyecto.md` en la rama `producción` después de los merges.

4. Captura del historial:

```bash
git log --oneline --graph --all
```

5. Respuesta a las cinco preguntas.

---

# Resumen de lo que debe quedar claro

Al terminar la práctica debes entender esta idea:

```text
desarrollo es la rama donde preparo los cambios.
producción es la rama estable donde incorporo los cambios cuando ya están listos.
```

El flujo de trabajo ha sido:

```text
producción → desarrollo → cambios → merge a producción → más cambios en desarrollo → nuevo merge a producción
```
