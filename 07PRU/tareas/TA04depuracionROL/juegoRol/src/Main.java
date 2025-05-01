import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> inventario = new ArrayList<>();
        int monedas = 0;
        Random random = new Random();

        // 1. Recoger pociones (algunas válidas)
        JuegoRol.recogerPociones(inventario, 4, random);

        // 2. Recoger 5 flechas
        JuegoRol.recogerObjeto(inventario, "Flecha", 5);

        // 3. Usar 1 poción
        JuegoRol.usarObjeto(inventario, "Poción", 1);

        // 4. Ganar monedas y obtener gema si corresponde
        monedas += 12;
        if (monedas > 10) {
            JuegoRol.recogerObjeto(inventario, "Gema mágica", 1);
        }

        // 5. Usar 3 flechas
        JuegoRol.usarFlechas(inventario, 3);

        // 6. Usar 2 pociones
        JuegoRol.usarObjeto(inventario, "Poción", 2);

        // Mostrar resultado final
        JuegoRol.mostrarInventario(inventario);
    }
}
