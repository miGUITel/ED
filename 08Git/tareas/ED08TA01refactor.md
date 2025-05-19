**Primera parte de la tarea** sobre patrones de refactorización, trabajando cinco patrones, con integración de **Git**:

---

## 🧪 **Tarea: Refactoriza con propósito**

### 🎯 **Objetivo**

Aplicar cinco patrones de refactorización básicos para mejorar la legibilidad y calidad del código, ideando **ejemplos propios** distintos a los propuestos en clase o en los apuntes.

### 🧰 **Herramientas necesarias**

* Visual Studio Code (u otro editor)
* Git instalado y configurado
* Repositorio ***local*** de Git (puede ser nuevo o dentro de un proyecto que estés trabajando)

---

### 🔧 **Instrucciones**

1. **Crea un nuevo directorio** llamado `refactorizacion_basica` y dentro, inicializa un repositorio de Git:

   ```bash
   git init
   ```

2. **Escribe un archivo de código fuente** en java.

3. **Para cada uno de los siguientes patrones**, crea un ejemplo **original** (no copiado de los vistos en clase) en el que:

   * Se vea claramente el **código antes** de la refactorización (puedes comentarlo si lo deseas).
   * Se vea el **código después**, aplicando el patrón correspondiente.

   Los cinco patrones son:

   * `Extract Method`
   * `Rename Variable`
   * `Replace Magic Number with Symbolic Constant`
   * `Introduce Explaining Variable`
   * `Inline Variable`

[Cinco patrones de refactorización básicos](../web/patronesBasicos.md)

4. **Haz un commit después de cada refactorización**, incluyendo un mensaje claro, por ejemplo:

5. El trabajo debe seguir el **orden indicado**. Cada patrón debe aplicarse en una parte diferente del código, aunque esté todo en el mismo archivo si lo prefieres.

---

### 📌 **Entrega**

* Comprime la carpeta y entrega en AulaVirtual ***incluyendo la carpeta `.git`.***

---

## 🧮 **Guía de calificación**

| Nota   | Descripción del desempeño                                                    |
| ------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **0**  | No se entrega la tarea o el contenido no corresponde a lo solicitado (sin refactorizaciones claras ni uso de Git).                                                                                                                                                                         |
| **3**  | Se han propuesto al menos 2 ejemplos propios, pero con errores en la aplicación del patrón, o sin evidencia de uso de Git (commits ausentes o desordenados).                                                                                                                               |
| **6**  | Se han propuesto 4 o 5 ejemplos propios, aplicando correctamente la mayoría de los patrones, aunque puede haber confusión en algún caso. Commits presentes pero no siempre bien explicados.                                                                                                |
| **9**  | Los 5 ejemplos son **originales y correctos**, aplicando adecuadamente los patrones. Cada refactorización está bien documentada con un commit claro y coherente.                                                                                                                           |
| **10** | Todo lo anterior **y además**: se han añadido mejoras adicionales no solicitadas. |



