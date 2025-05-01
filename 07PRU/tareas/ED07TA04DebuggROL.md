# Práctica: Depuración de un juego de rol por turnos

## 🧭 Situación de aprendizaje

Estás participando en el desarrollo de un videojuego tipo RPG (juego de rol), y tu equipo te ha asignado la tarea de revisar el sistema de inventario del personaje. Tus responsables quieren asegurarse de que el sistema responde correctamente a situaciones especiales (como el uso de objetos, condiciones automáticas y comportamiento aleatorio). Para ello, deberás usar el *debugger* para analizar con precisión qué ocurre en cada paso de la ejecución del código y documentar tus observaciones.


## Objetivo

Aprender a utilizar el *debugger* de IntelliJ IDEA para observar la evolución del estado interno de un programa en ejecución.
Trabajarás con un pequeño sistema de gestión de inventario de un juego de rol.

---

## Contexto

El programa simula un personaje que:

- Recoge objetos.
- Gana monedas.
- Usa objetos del inventario como flechas y pociones.
- Sufre consecuencias según sus decisiones.


Este sistema contiene condiciones **no evidentes** que requieren inspección con el debugger.

---

## Tareas

### 1. Preparación

1. Abre el proyecto en IntelliJ.

2. Establece *breakpoints* según las preguntas de la tabla:

3. Ejecuta el programa en modo **debug** y ve **paso a paso (Step Into / Step Over)** para observar el comportamiento.

---

### 2. Cuestionario (requiere uso del debugger)

Contesta a estas preguntas **usando el depurador**:


| Nº | Pregunta                                                                                             | Respuesta del alumno |
|----|------------------------------------------------------------------------------------------------------|----------------------|
| 1  | ¿Cuántas pociones válidas ha recogido el jugador en la primera acción?                              |                      |
| 2  | ¿Cuántas pociones válidas ha recogido el jugador cuando solo ha cogido tres de las cuatro?           |                      |
| 3  | ¿Se añadió un antídoto tras recoger las pociones? ¿Por qué?                                          |                      |
| 4  | ¿Cuántas monedas gana el jugador? ¿Qué objeto se añade automáticamente tras ello?                    |                      |
| 5  | ¿Cuántas flechas quedan tras usar tres flechas? ¿Por qué se pierde una flecha extra?                 |                      |
| 6  | ¿Qué ocurre con el antídoto si el jugador se queda sin pociones?                                     |                      |
| 7  | ¿Qué objetos aparecen finalmente en el inventario y con qué cantidades?                              |                      |

---

### 3. Reflexión

Responde brevemente:

- ¿Qué información **solo podías saber con el debugger**?

---

## Entrega

### Guía de corrección

| Nota | Criterios                                                                                       |      |
|------|--------------------------------------------------------------------------------------------------|----|
| 0    | No entregado, o entregado sin utilizar el depurador, o sin capturas que justifiquen las respuestas. | [ ] |
| 3    | Entregado, pero con errores importantes o respuestas poco justificadas.                         | [ ] |
| 6    | La mayoría de las respuestas son correctas y justificadas con capturas.                         | [ ] |
| 9    | Todas las respuestas son correctas y bien justificadas.                                         | [ ] |
| 10   | Además de lo anterior, se aportan observaciones personales, ideas adicionales o análisis extra. | [ ] |



Modifica este archivo `.md` completando la tabla de respuestas y la sección de reflexión. Asegúrate de incluir **capturas de pantalla que justifiquen cada una de tus respuestas**.

Cuando termines, genera un archivo **PDF** a partir del documento modificado y entrégalo en aula virtual.
