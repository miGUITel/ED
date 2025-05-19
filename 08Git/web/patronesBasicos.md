Esta selección está pensada para aydarte a:

* Escribir **métodos más legibles**.
* **Evitar errores** por nombres poco claros o repeticiones.
* Empezar a **organizar bien clases y métodos**.

---

## 🎯 **Selección de patrones esenciales**

### 1. 🧱 **Extract Method (Extraer método)**

> **¿Cuándo usarlo?** Cuando tienes bloques de código largos o que hacen varias cosas.

**Antes:**

```java
public void mostrarFactura() {
    System.out.println("Cliente: " + cliente);
    System.out.println("Fecha: " + fecha);
    double total = 0;
    for (Item item : items) {
        total += item.precio;
    }
    System.out.println("Total: " + total);
}
```

**Después (más legible):**

```java
public void mostrarFactura() {
    mostrarCabecera();
    mostrarTotal();
}

private void mostrarCabecera() { ... }
private void mostrarTotal() { ... }
```

---

### 2. 🏷️ **Rename Variable (Renombrar variable)**

> **¿Cuándo usarlo?** Cuando el nombre no dice claramente lo que representa.

**Antes:**

```python
n = 3.14159 * r * r
```

**Después:**

```python
area_circulo = 3.14159 * radio * radio
```

---

### 3. 📦 **Replace Magic Number with Symbolic Constant**

> **¿Cuándo usarlo?** Cuando ves números que no explican su propósito.

**Antes:**

```javascript
if (velocidad > 120) {
    multa = true;
}
```

**Después:**

```javascript
const LIMITE_VELOCIDAD = 120;
if (velocidad > LIMITE_VELOCIDAD) {
    multa = true;
}
```

---

### 4. 🧪 **Introduce Explaining Variable**

> **¿Cuándo usarlo?** Cuando hay expresiones complejas o poco claras.

**Antes:**

```java
if (user.getAge() >= 18 && user.hasPermission("descarga")) {
```

**Después:**

```java
boolean esMayorEdad = user.getAge() >= 18;
boolean tienePermiso = user.hasPermission("descarga");

if (esMayorEdad && tienePermiso) {
```

---

### 5. 🧹 **Inline Variable**

> **¿Cuándo usarlo?** Cuando una variable solo se usa una vez y no aporta claridad.

**Antes:**

```csharp
var resultado = suma(a, b);
return resultado;
```

**Después:**

```csharp
return suma(a, b);
```


