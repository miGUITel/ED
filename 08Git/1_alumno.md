## Paso 4: Instrucciones para Tus Alumnos
### 1. **Clonar el Repositorio**:
   - Cada alumno debe clonar el repositorio en su computadora usando la terminal:
     ```bash
     git clone https://github.com/tu-usuario/proyecto-colaborativo.git
     cd proyecto-colaborativo
     ```

### 2. **Configurar Acceso para Subir Cambios**:
   - Después de clonar el repositorio, los alumnos deben configurar su acceso para poder hacer `push` de manera sencilla:
     ```bash
     git remote set-url origin https://github.com/tu-usuario/proyecto-colaborativo.git
     git config --global user.name "Nombre del Alumno"
     git config --global user.email "correo@ejemplo.com"
     ```

### 3. **Autenticarse en GitHub para Subir Cambios**:
#### 🔹 **Autenticarse en GitHub desde Visual Studio Code (VSC)**  

Si estás usando **Visual Studio Code (VSC)** para trabajar con GitHub, la autenticación es más sencilla porque Git está integrado con la interfaz gráfica.

---

#### ✅ **Método 1: Autenticación con el navegador (Recomendado)**
1️⃣ **Abre Visual Studio Code** y ve al **panel de control de Git** (CTRL+SHIFT+G o desde la barra lateral).  
2️⃣ Si no has clonado un repositorio aún, puedes hacerlo con:  
   - **Abrir la paleta de comandos** (`CTRL+SHIFT+P`) y escribir:  
     ```
     Git: Clone
     ```
   - Pegar la URL del repositorio de GitHub.  
3️⃣ Cuando intentes hacer `push` o `pull` por primera vez, VSC mostrará un mensaje pidiéndote autenticación.  
4️⃣ **Selecciona "Sign in with your browser" (Iniciar sesión con tu navegador)**.  
5️⃣ Se abrirá **GitHub en el navegador**, donde debes iniciar sesión y conceder acceso a Visual Studio Code.  
6️⃣ Una vez autenticado, regresa a VSC y ya podrás subir (`push`) cambios sin necesidad de introducir credenciales manualmente.

---

#### 🔑 **Método 2: Usar Token de Acceso Personal (PAT)**
Si la autenticación web no funciona o prefieres otro método:
1️⃣ Ve a **GitHub → Configuración → Developer settings → Personal Access Tokens**  
   👉 [https://github.com/settings/tokens](https://github.com/settings/tokens)  
2️⃣ Crea un nuevo **token con permisos `repo` y `workflow`**.  
3️⃣ Copia el token y pégalo cuando VSC pida credenciales en un `push` o `pull`.  
4️⃣ Puedes almacenar el token en el **Administrador de Credenciales de Windows** para no tener que ingresarlo cada vez.

---

#### 🔐 **Método 3: Usar Llaves SSH (Para usuarios avanzados)**
Si quieres evitar contraseñas en cada `push`:
1️⃣ **Genera una clave SSH** desde la terminal de VSC:  
   ```bash
   ssh-keygen -t ed25519 -C "tu_email@example.com"
   ```
2️⃣ Copia la clave pública con:  
   ```bash
   cat ~/.ssh/id_ed25519.pub
   ```
3️⃣ Agrega la clave en GitHub en  
   👉 [https://github.com/settings/keys](https://github.com/settings/keys)  
4️⃣ Prueba la conexión con:  
   ```bash
   ssh -T git@github.com
   ```
   Debería mostrar:  
   ```
   Hi TU_USUARIO! You've successfully authenticated, but GitHub does not provide shell access.
   ```

---

#### 📌 **¿Cuál método elegir en VSC?**
✅ **Autenticación por navegador** → La más fácil y rápida.  
✅ **Token de acceso personal (PAT)** → Útil si el método web no funciona.  
✅ **Llave SSH** → Para quienes usan GitHub con frecuencia y quieren más seguridad.

🚀 **Si solo quieres empezar rápido, usa la opción de autenticación con el navegador.**

### 4. **Hacer Cambios y Subirlos**:
   - Realizan cambios en los archivos del proyecto.
   - Guardan los cambios y los suben al repositorio:
     ```bash
     git add .
     git commit -m "Descripción de los cambios realizados"
     git push
     ```
   - **Alternativa con Visual Studio Code**: También pueden realizar estos pasos desde la interfaz de Visual Studio Code. En VSC, pueden ver los cambios, añadir los archivos al área de preparación (`staging`), realizar el commit y hacer `push` de los cambios de manera visual.

## Paso 5: Usar Visual Studio Code (VSC) para Facilitar el Trabajo
1. **Abrir el Proyecto en VSC**:
   - Los alumnos pueden abrir la carpeta del proyecto clonado en Visual Studio Code:
     ```
     code .
     ```
   - VSC tiene integración con Git, lo que les permitirá hacer commits, crear ramas y subir (`push`) cambios de manera visual y sencilla.

2. **Autenticarse en GitHub desde VSC**:
   - Cuando intenten hacer `push` por primera vez desde VSC, este les pedirá autenticarse.
   - Pueden usar su **nombre de usuario y token de acceso personal** generado previamente, o bien, si han configurado una **llave SSH**, VSC la usará automáticamente para autenticarse.

3. **Hacer Cambios y Subirlos con VSC**:
   - Los alumnos pueden usar la interfaz de Git que proporciona VSC para:
     - Ver qué archivos han cambiado.
     - Añadir los archivos al área de preparación (`staging area`).
     - Realizar el commit de los cambios con un mensaje descriptivo.
     - Subir (`push`) los cambios al repositorio remoto.