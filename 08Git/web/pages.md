### Guía rápida: publicar una web en **GitHub Pages** desde **Markdown**

1. **Crea un repositorio en GitHub**
   Puede llamarse como quieras. Si es para tu perfil personal:
   `usuario.github.io`.

2. **Añade un archivo `index.md` o `Readme.md`**
   GitHub Pages mostrará este archivo como página principal.

3. **Escribe el contenido en Markdown**
   Usa sintaxis estándar (`#`, `##`, listas, enlaces, imágenes, etc.).
   (también puedes escribir directamente en html, usando index.html como página de inicio si quieres que sea bonita)

4. **Configura GitHub Pages**

   * Repositorio → **Settings** → **Pages**
   * Source: `Deploy from a branch`
   * Branch: `main` (o `master`)
   * Folder: `/root`
   * Guarda los cambios.

5. **(Opcional) Usa un tema automático**
   En **Settings → Pages → Theme chooser** puedes seleccionar un tema Jekyll sin tocar código.

6. **Accede a la web**
   En unos segundos estará disponible en:
   `https://usuario.github.io/repositorio/`
   (o directamente `https://usuario.github.io` si es el repositorio del perfil).

**Idea clave:** GitHub convierte automáticamente Markdown en HTML. No hace falta saber HTML para publicar una web funcional y pública.
