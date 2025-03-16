# Instrucciones Simplificadas para Crear y Colaborar en un Repositorio en GitHub

## Paso 1: Crear el Repositorio Localmente
1. **Abre una terminal** en tu computadora.
2. Navega al directorio donde quieras crear el proyecto o crea uno nuevo:
   ```bash
   mkdir proyecto_colaborativo
   cd proyecto_colaborativo
   ```
3. Inicializa un repositorio de Git:
   ```bash
   git init
   ```
4. Añade algunos archivos iniciales, como `README.md` para describir el proyecto:
   ```bash
   echo "# Proyecto Colaborativo" >> README.md
   git add README.md
   git commit -m "Añadir archivo README inicial"
   ```

## Paso 2: Crear el Repositorio en GitHub
1. **Ingresa a GitHub** y **crea un nuevo repositorio**:
   - Visita [https://github.com/new](https://github.com/new).
   - Ponle un nombre, por ejemplo `proyecto-colaborativo`.
   - Deja el repositorio **público**.

2. **Conecta el Repositorio Local con GitHub** ejecutando los siguientes comandos en la terminal:
   ```bash
   git remote add origin https://github.com/tu-usuario/proyecto-colaborativo.git
   git push -u origin main
   ```

## Paso 3: Permitir que Tus Compañeros Colaboren
1. **Configura el acceso al repositorio**:
   - Ve a la página de tu repositorio en GitHub.
   - Haz clic en la pestaña **"Settings"**.
   - Luego, ve a **"Collaborators"**.
   - Añade a tus alumnos como colaboradores usando sus nombres de usuario de GitHub.

