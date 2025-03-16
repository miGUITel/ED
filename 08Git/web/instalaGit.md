### 🛠️ **Cómo instalar Git en Windows, Linux y macOS**  

---

## **🔹 Windows**  
1️⃣ **Descargar Git** desde la página oficial:  
   👉 [https://git-scm.com/downloads](https://git-scm.com/downloads)  
2️⃣ Ejecutar el instalador (`.exe`).  
3️⃣ Seguir las instrucciones del asistente de instalación:  
   - Dejar las opciones predeterminadas si no tienes experiencia.  
   - Asegurarse de que **Git Bash** y **Git GUI** estén seleccionados. 
   
4️⃣ Finalizar la instalación y abrir **Git Bash** para verificar con:  
   ```bash
   git --version
   ```

---

## **🔹 Linux (Ubuntu, Debian, etc.)**  
1️⃣ Abrir la terminal.  
2️⃣ Ejecutar:  
   ```bash
   sudo apt update
   sudo apt install git -y
   ```  
3️⃣ Verificar la instalación:  
   ```bash
   git --version
   ```

---

## **🔹 macOS**  
1️⃣ **Instalar con Homebrew** (recomendado):  
   ```bash
   brew install git
   ```  
2️⃣ Si no tienes Homebrew, puedes instalar Git desde [https://git-scm.com/download/mac](https://git-scm.com/download/mac).  
3️⃣ Verificar la instalación:  
   ```bash
   git --version
   ```

---

## **⚡ Configurar Git después de instalar**
Después de la instalación, configura tu nombre y correo:  
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@example.com"
```
Para verificar la configuración:  
```bash
git config --list
```

---

### 🎯 **¡Listo! Ahora puedes empezar a usar Git. 🚀**