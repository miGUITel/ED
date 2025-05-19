## 📌 **¿Qué es una plantilla en GitHub?**  

En GitHub, un **repositorio plantilla** es un repositorio que está configurado para que otros usuarios puedan **crear nuevos repositorios a partir de él**, sin necesidad de hacer un **fork**.  

Cuando un repositorio es marcado como plantilla, permite que los usuarios **generen copias totalmente independientes**, sin ninguna relación con el repositorio original.  

---

## 🔹 **¿Qué implica crear un repositorio a partir de una plantilla?**  

Cuando creas un nuevo repositorio desde una plantilla:  
1. **Se copia todo el contenido** del repositorio plantilla (archivos, estructura, configuración, etc.).  
2. **No mantiene ninguna relación con el original**: a diferencia de un fork, el nuevo repositorio no está vinculado con la plantilla.  
3. **No puedes sincronizar cambios automáticamente**: si la plantilla se actualiza en el futuro, no podrás traer esos cambios automáticamente.  
4. **Puedes modificar el código sin restricciones**, ya que es tu propio repositorio desde el inicio.  

---

## 🎯 **Diferencias entre Fork y Plantilla**

| Característica | **Fork** 🪝 | **Plantilla** 🏗️ |
|--------------|------------|----------------|
| **Relación con el original** | Mantiene vínculo con el original. | Es completamente independiente. |
| **Se pueden sincronizar cambios?** | Sí, mediante `fetch upstream`. | No, los repositorios son independientes. |
| **Se usa para...?** | Contribuir a un proyecto existente. | Crear nuevos proyectos a partir de un modelo base. |
| **¿Mantiene el historial de commits?** | Sí, conserva los commits y ramas. | No, empieza con un historial limpio. |

---

## ⚡ **Ejemplo de uso de plantillas en GitHub Classroom**  
Si eres profesor y quieres que tus alumnos trabajen con un código base sin modificar el repositorio original:  
1. **Creas un repositorio plantilla** con archivos, instrucciones y configuración predefinida.  
2. **Cada alumno crea su propio repositorio desde la plantilla**, obteniendo una copia independiente.  
3. **Cada alumno trabaja en su propio repositorio sin afectar el original ni a sus compañeros**.  
4. **Puedes evaluar los repositorios individualmente**, ya que cada alumno tiene su propia versión.  

---

## 🔹 **¿Cuándo usar una plantilla en lugar de un fork?**
✅ **Si quieres proporcionar un código base sin relación con el original.**  
✅ **Si trabajas en equipo y quieres que cada miembro tenga su propio repositorio independiente.**  
✅ **Si organizas tareas en GitHub Classroom y necesitas que cada alumno tenga su propio entorno de trabajo.**  

---

### 🏆 **Resumen**
- Una **plantilla** permite crear nuevos repositorios completamente independientes.  
- Un **fork** mantiene una relación con el original y permite sincronizar cambios.  
- Las **plantillas son ideales para proyectos base** que otros pueden usar como punto de partida sin interferir con el original.  