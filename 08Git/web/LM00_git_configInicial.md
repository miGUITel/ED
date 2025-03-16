**Guía de Configuración Inicial de Git tras la Instalación**

A continuación, se presenta una guía para configurar Git inmediatamente después de la instalación. Estos pasos asegurarán que el uso de Git sea consistente y efectivo, tanto para proyectos individuales como colaborativos.

### Paso 1: Configurar el Nombre de Usuario y el Correo Electrónico

Cada commit en Git está asociado a un usuario. Para configurar tu nombre y correo electrónico, utiliza los siguientes comandos:

```bash
# Configurar el nombre de usuario
git config --global user.name "Tu Nombre"

# Configurar el correo electrónico
git config --global user.email "tu.email@example.com"
```

Esto garantiza que todos tus commits estén correctamente identificados con tu nombre y correo electrónico.

### Paso 2: Configurar Merge como Estrategia Predeterminada

Para evitar conflictos y facilitar la gestión de cambios, es buena práctica establecer `merge` como la estrategia por defecto cuando se ejecuta un `git pull`. Puedes hacerlo con el siguiente comando:

```bash
git config --global pull.rebase false
```

Esto significa que cada vez que traigas cambios del remoto, Git realizará una fusión en lugar de un rebase, creando un commit de fusión que mantiene el historial completo.

### Paso 3: Configurar el Editor Predeterminado (Nano)

Git necesita un editor para escribir mensajes de commit o para resolver conflictos. Puedes configurar **Nano** como tu editor predeterminado con el siguiente comando:

```bash
git config --global core.editor "nano"
```

Nano es un editor simple y fácil de usar que viene preinstalado en la mayoría de las distribuciones de Linux.

### Paso 4: Verificar la Configuración

Finalmente, para asegurarte de que todos los valores están correctamente configurados, puedes usar el siguiente comando para listar toda la configuración actual:

```bash
git config --list
```

Esto te permitirá verificar el nombre de usuario, el correo electrónico, el editor predeterminado y las configuraciones de `pull`, asegurándote de que todo esté bien establecido antes de empezar a trabajar.

---

Con esta configuración básica, Git estará listo para ser usado de manera eficiente, minimizando conflictos y facilitando el trabajo colaborativo. Si deseas añadir más configuraciones o tienes alguna duda sobre alguno de los pasos, no dudes en pedirme ayuda.

