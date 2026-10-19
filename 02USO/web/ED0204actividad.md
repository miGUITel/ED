[Volver al índice principal](./ED0200.md)

# ED0204 - UML: Diagramas de Actividades

Los diagramas de actividades en UML (Lenguaje Unificado de Modelado) son diagramas que muestran el flujo de actividades o tareas dentro de un proceso o sistema. Ayudan a entender cómo se conectan las actividades, cómo se toman decisiones y cómo se manejan las acciones paralelas. Estos diagramas son útiles en el desarrollo de software y en el modelado de procesos de negocio, ya que facilitan la comunicación y el entendimiento entre los miembros de un equipo.

## Utilidad de los Diagramas de Actividades

Los diagramas de actividades son útiles en varias etapas del desarrollo y análisis de sistemas. Permiten:

- **Documentar y comunicar procesos**: Representan procesos de forma clara, ayudando a que todos los involucrados entiendan cómo funcionan.
- **Optimizar procesos**: Permiten identificar partes redundantes, cuellos de botella y oportunidades de mejora al visualizar el proceso completo.
- **Analizar comportamientos complejos**: Son útiles para modelar sistemas con actividades que ocurren en paralelo o de forma concurrente, facilitando el análisis de cómo se coordinan.
- **Facilitar la toma de decisiones**: Muestran claramente los puntos de decisión y las opciones disponibles, ayudando a entender las consecuencias de cada alternativa.
- **Apoyar la automatización**: Facilitan la implementación de sistemas automatizados y la documentación de reglas de negocio al modelar las actividades y flujos.

## Elementos de los Diagramas de Actividades

Para crear un diagrama de actividades en UML, se usan los siguientes elementos principales:

1. **Actividades**: Son las acciones o tareas dentro del proceso, representadas como rectángulos con bordes redondeados. Ejemplos de actividades incluyen "Revisar solicitud", "Enviar notificación" o "Generar reporte".

2. **Flujo de Control**: Representado por flechas, indica el orden en que se ejecutan las actividades, mostrando la secuencia del proceso desde el inicio hasta el fin.

3. **Nodos de Decisión**: Estos nodos se representan con rombos y muestran los puntos donde el flujo toma un camino dependiendo de una condición. Por ejemplo, una decisión puede dividir el flujo en "Aprobado" o "Rechazado".

4. **Nodo de Inicio**: Representado por un círculo negro, marca el inicio del proceso. Puede haber varios nodos iniciales; en los ejemplos sencillos utilizaremos uno. Si hay varios, al iniciar la actividad comienza un flujo de control en cada uno.

5. **Final de actividad**: Un círculo negro rodeado por otro círculo indica que termina toda la actividad, incluidas las demás ramas que sigan ejecutándose. Puede haber varios puntos de finalización.

6. **Final de flujo**: Un círculo con una cruz termina únicamente el flujo que lo alcanza; las otras ramas pueden continuar.

7. **Bifurcación y Unión (Fork/Join)**: La bifurcación se muestra con líneas horizontales o verticales que dividen el flujo en varios caminos, permitiendo la ejecución de actividades en paralelo. La unión sincroniza estos caminos en un solo flujo.

![Diagrama de actividades con una decisión en rombo, unión de alternativas y dos ramas paralelas sincronizadas](diagramas/elementos_actividades_rev02.png)


## Ejemplos de Diagramas de Actividades

### Ejemplo 1: Proceso de Compra en Línea

En un diagrama de actividades para un proceso de compra en línea, el flujo comienza con el **Nodo de Inicio** (círculo negro) que marca el comienzo del proceso. Luego se pasa a la actividad **"Seleccionar productos"**, que se representa con un rectángulo redondeado. Esta actividad muestra la acción del usuario de elegir los productos que quiere comprar.

A continuación, el flujo va hacia la actividad **"Agregar al carrito"**, también representada por un rectángulo redondeado, que indica que el usuario añade los productos seleccionados al carrito de compras.

Después, se llega a la actividad **"Realizar pago"**, donde el cliente hace el pago de los productos. Aquí hay un **Nodo de Decisión** (rombo) para validar el método de pago. Este nodo tiene dos posibles salidas: **"Pago aprobado"** y **"Pago rechazado"**. Dependiendo del resultado, el flujo se divide en dos caminos:

- Si el pago es aprobado, el flujo continúa hacia la actividad **"Verificar inventario"** (rectángulo redondeado), donde se verifica si los productos están disponibles.
- Si el pago es rechazado, el flujo va hacia la actividad **"Notificar al cliente"**, informándole sobre el rechazo del pago.

Una vez verificado el inventario, una **Bifurcación (Fork)** abre dos ramas: **"Actualizar pedido"** y **"Confirmación de compra"**. Estas actividades se ejecutan en paralelo.

La **Unión (Join)** espera a que terminen ambas ramas antes de continuar hacia **"Envío de recibo"**. La confirmación está dentro de una de las ramas paralelas, no después de la unión.

Finalmente, el flujo llega a la actividad **"Envío de recibo"**, donde se envía un recibo al cliente para documentar la transacción. El proceso termina con el **Nodo de Fin** (círculo negro con borde), que indica que el proceso ha terminado.

![Compra en línea: decisión de pago, verificación del inventario, actualización del pedido y confirmación en paralelo, sincronización y envío del recibo](diagramas/actividades_compra_rev01.png)

### Ejemplo 2: Solicitud de Vacaciones

Un proceso de solicitud de vacaciones comienza con el **Nodo de Inicio**, que lleva a la actividad **"Presentar solicitud"**. Luego, un **Nodo de Decisión** determina si la solicitud es **"Aprobada"** o **"Rechazada"**. Si es aprobada, el flujo continúa hacia **"Notificar al empleado"** y **"Registrar vacaciones"**, mientras que un rechazo lleva a la actividad **"Informar rechazo"** al empleado. Si la solicitud es aprobada, también podría haber un flujo paralelo para registrar las vacaciones en el sistema de recursos humanos.

### Ejemplo 3: Proceso de Registro de Usuarios

Este proceso comienza con la actividad **"Recibir solicitud de registro"**, seguida por **"Verificación de datos"**. Si los datos son correctos, el flujo continúa hacia **"Crear cuenta"**, mientras que un flujo alternativo para datos incorrectos lleva a **"Solicitar corrección"**. Una **Bifurcación (Fork)** abre dos ramas para **"Enviar confirmación"** y **"Actualizar base de datos"**. Una **Unión (Join)** espera a que terminen ambas antes de continuar con **"Notificar al usuario"**.

El dibujo representa un intento de registro: si los datos son incorrectos, se solicita su corrección y termina ese intento. El rombo inferior reúne caminos alternativos; la barra del join sincroniza las ramas paralelas.

![Registro de usuarios con decisión sobre los datos, creación de cuenta, confirmación y actualización en paralelo, join y notificación](diagramas/registro_usuarios_rev02.png)

[Fuente editable del registro en PlantUML](diagramas/registro_usuarios_rev02.puml)

## Conclusión

Los diagramas de actividades son una herramienta versátil y poderosa en UML, ya que permiten modelar procesos detallados y entender mejor el comportamiento dinámico de sistemas complejos. Estos diagramas ayudan a los equipos a visualizar y analizar las tareas, decisiones y flujos paralelos, facilitando la comunicación y la optimización de procesos.

[Volver al índice principal](./ED0200.md)