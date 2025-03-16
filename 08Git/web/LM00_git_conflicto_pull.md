## Solucionar conflicto de Pull


![alt text](<Captura de pantalla de 2024-10-25 10-06-21.png>)


### 1. **Ejecución del Comando `git status`**
- Al inicio, el usuario ejecuta `git status` para ver el estado del repositorio.
- Git informa que la rama `main` y la rama remota `origin/main` han **divergido**, lo que significa que existen commits diferentes en el repositorio local y el remoto. En concreto, el mensaje dice que hay **1 y 2 commits** distintos, respectivamente.

   **Recomendación**: En este punto, Git sugiere realizar un `git pull` para fusionar la rama remota con la local y tener todo sincronizado.

### 2. **Intento de `git pull`**
- El usuario procede con `git pull`, que intenta traer los cambios del repositorio remoto y fusionarlos con la rama local.
- Aquí Git muestra una advertencia: **"Tu rama actual no está configurada para hacer merge"**. Esto se refiere a que la configuración predeterminada para la acción de "pull" puede variar. Es posible que el usuario necesite especificar si desea hacer un `merge` o un `rebase`.

   - El comando sugiere modificar la configuración para especificar si se desea usar `rebase` o `merge` por defecto.
   - Git indica varias formas de modificar esto mediante `git config`:
     - `git config pull.rebase false` para utilizar la estrategia de **merge**.
     - `git config pull.rebase true` para utilizar la estrategia de **rebase**.
     - `git config pull.ff only` para que el **pull** aplique solo el **fast-forward** (avanzar directo si no hay conflictos).

### 3. **Problema al Reconciliar Ramas Divergentes**
- Tras ejecutar `git pull`, Git muestra un error: **"fatal: Necesitas especificar cómo reconciliar las ramas divergentes."**
- Esto indica que las ramas tienen cambios que no pueden reconciliarse automáticamente sin especificar cómo proceder (merge o rebase). El sistema está pidiendo al usuario que defina cómo resolver los cambios para evitar confusiones.

### 4. **Modificación de Configuración Global**
- El usuario intenta ajustar la configuración usando `git config --global pull.rebase false` para indicar que se prefiera la estrategia de **merge** para reconciliar los cambios.
- Luego, vuelve a intentar `git pull`.

### 5. **Conflicto de Fusión**
- Después de ejecutar `git pull`, el proceso intenta hacer una fusión automática, pero Git muestra un **conflicto de fusión** en el archivo `README.md`.
- El mensaje dice: **"CONFLICTO (contenido): Conflicto de fusión en README.md"**, lo cual indica que hubo cambios en el archivo `README.md` tanto en la rama remota como en la local, y Git no puede decidir automáticamente cómo reconciliar esos cambios.

### 6. **Resolución del Conflicto**
- Git indica que la fusión automática ha fallado y que es necesario **arreglar los conflictos manualmente** y después hacer un **commit** con el resultado.
  
### **Pasos para Solucionar el Conflicto**
Para resolver este conflicto y finalizar el proceso de sincronización, el usuario debe:

1. **Abrir el archivo con el conflicto (`README.md`)**:
   - Dentro del archivo, verás marcadores de conflicto que indican qué partes del contenido vienen de la rama local (`HEAD`) y cuáles de la remota (`origin/main`). Los marcadores se ven como:
     ```txt
     <<<<<<< HEAD
     (cambios locales)
     =======
     (cambios remotos)
     >>>>>>> origin/main
     ```
2. **Editar el Archivo**:
   - Decide cómo combinar los cambios. Puedes quedarte con los cambios locales, los remotos, o combinar ambos manualmente.
3. **Guardar los Cambios**:
   - Guarda el archivo una vez resuelto el conflicto.
4. **Hacer un Commit**:
   - Luego, realiza un commit para indicar que el conflicto ha sido resuelto:
     ```bash
     git add README.md
     git commit -m "Resuelto el conflicto en README.md"
     ```
5. **Continuar Trabajando**:
   - Después de esto, el repositorio estará sincronizado y podrás continuar trabajando.

Este tipo de conflictos es común cuando varios desarrolladores están trabajando en el mismo proyecto y realizan cambios en los mismos archivos. La habilidad para resolver estos conflictos es clave en el trabajo colaborativo con Git.

## Contexto teórico

En Git, las estrategias de `merge`, `rebase` y `fast-forward` se utilizan para reconciliar los cambios entre diferentes ramas o entre el repositorio local y el remoto. Cada uno de estos modos tiene consecuencias y usos específicos que afectan al historial de cambios y a la forma en que trabajamos con las ramas. Vamos a ver cada uno de estos en detalle:

### 1. **Merge (Fusión)**
El comando `merge` combina dos ramas creando un nuevo commit que une ambas historias. Esta es la estrategia más común y segura en Git, especialmente en equipos grandes.

- **Cómo funciona**:
  - Cuando se hace un `merge`, Git crea un nuevo commit de **fusión** que junta los cambios de ambas ramas.
  - Si los cambios de ambas ramas no afectan los mismos archivos o las mismas líneas, la fusión es automática.
  - Si hay conflictos, el usuario debe resolverlos manualmente.

- **Consecuencias**:
  - **Historial de cambios**: El historial conserva la historia de ambas ramas, incluyendo el punto donde se unieron. Esto puede hacer que el historial parezca más complejo, pero es útil para rastrear cómo y cuándo se hicieron ciertas contribuciones.
  - **Ventajas**: Es seguro y mantiene un registro claro de todas las fusiones. Muy útil en proyectos colaborativos donde se necesita entender cuándo las ramas se integraron.
  - **Desventajas**: El historial puede volverse más complicado de leer debido a los "commits de fusión", que a veces resultan en bifurcaciones visibles y numerosos puntos de unión.

### 2. **Rebase**
`Rebase` reescribe el historial de la rama al integrar los cambios de otra rama. Básicamente, toma los commits de la rama actual y los "reaplica" en la cima de otra rama, creando un historial más lineal.

- **Cómo funciona**:
  - Al hacer `rebase`, los commits de la rama local se **mueven** al final de los commits de la rama remota, como si hubieran sido hechos después de estos.
  - El `rebase` evita la creación de un commit de fusión, en cambio, reorganiza los commits para crear un historial más limpio.

- **Consecuencias**:
  - **Historial de cambios**: El resultado es un **historial lineal**, sin commits de fusión. Esto puede hacer que el historial sea más limpio y fácil de seguir.
  - **Ventajas**: Ideal para mantener un historial limpio y ordenado, sin ramificaciones innecesarias. Facilita la comprensión del historial, especialmente cuando se revisan los cambios de una rama antes de fusionarla.
  - **Desventajas**: **Reescribe el historial**, lo que puede ser problemático cuando se trabaja en colaboración con otros desarrolladores. Si ya has compartido tu rama y haces `rebase`, podrías causar confusión y problemas al reescribir el historial compartido. En resumen, `rebase` no se recomienda para ramas que ya han sido "pushed" al repositorio remoto, a menos que sepas exactamente lo que estás haciendo.

### 3. **Fast-Forward**
El **fast-forward** ocurre cuando una rama puede avanzar directamente hasta alcanzar la otra sin necesidad de crear un commit de fusión. Esto solo es posible si no se han hecho cambios adicionales en la rama base.

- **Cómo funciona**:
  - El `fast-forward` simplemente **avanza el puntero de la rama** hasta el commit que tiene la rama con la que se desea sincronizar. Es como si moviera una marca sin crear un nuevo commit.
  - Es la opción que Git usa por defecto cuando no hay divergencia entre las ramas.

- **Consecuencias**:
  - **Historial de cambios**: No crea un nuevo commit de fusión, lo cual hace que el historial sea limpio. Solo se ve una secuencia continua de commits.
  - **Ventajas**: Es simple y no deja commits adicionales que puedan complicar el historial. Es ideal cuando no hay necesidad de conservar dos ramas independientes (por ejemplo, cuando la rama de características se fusiona con `main` sin cambios adicionales en `main`).
  - **Desventajas**: No es posible usar fast-forward cuando ambas ramas han tenido cambios, ya que entonces es necesario un commit de fusión para integrar ambos conjuntos de cambios.

### **¿Cuándo usar cada estrategia?**

- **Merge**: Es la opción más segura y más común cuando se necesita preservar el historial completo de las contribuciones y cuando se trabaja en equipo. Siempre puedes ver qué se fusionó y cuándo, y no hay riesgo de conflictos inesperados al reescribir el historial.

- **Rebase**: Úsalo cuando estés trabajando en tu propia rama de características y quieras mantener un historial limpio antes de fusionarla con la rama principal. Es ideal para limpiar el historial antes de hacer `push`. Evita usar `rebase` si la rama ya ha sido compartida.

- **Fast-Forward**: Es adecuado cuando no ha habido cambios en la rama base. Permite una integración rápida y limpia sin commits adicionales. Es útil cuando se desea que la integración sea lo más simple posible.

Cada uno tiene sus ventajas y desventajas, y la elección depende del flujo de trabajo y de las preferencias del equipo. Por ejemplo, muchos equipos prefieren `merge` para trabajo colaborativo y `rebase` para mantener ramas individuales más limpias.