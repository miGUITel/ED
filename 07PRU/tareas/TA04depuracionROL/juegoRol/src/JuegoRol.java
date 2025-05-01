import java.util.ArrayList;
import java.util.Random;

public class JuegoRol {

    public static void recogerPociones(ArrayList<Item> inventario, int cantidad, Random rand) {
        int pocionesValidas = 0;
        for (int i = 0; i < cantidad; i++) {
            if (rand.nextBoolean()) {
                pocionesValidas++;
            }
        }

        recogerObjeto(inventario, "Poción", pocionesValidas);

        if (getCantidad(inventario, "Poción") > 2) {
            recogerObjeto(inventario, "Antídoto", 1);
        }
    }

    public static void usarFlechas(ArrayList<Item> inventario, int cantidad) {
        usarObjeto(inventario, "Flecha", cantidad);

        int flechasRestantes = getCantidad(inventario, "Flecha");
        if (flechasRestantes > 0 && flechasRestantes < 3) {
            System.out.println("⚠️ Flecha rota: se pierde una flecha extra.");
            usarObjeto(inventario, "Flecha", 1);
        }
    }

    public static void usarObjeto(ArrayList<Item> inventario, String nombre, int cantidad) {
        for (Item item : new ArrayList<>(inventario)) {
            if (item.getNombre().equals(nombre)) {
                item.disminuirCantidad(cantidad);

                if (item.getCantidad() <= 0) {
                    inventario.remove(item);
                }

                if (nombre.equals("Poción") && getCantidad(inventario, "Poción") == 0) {
                    System.out.println("⚠️ Sin pociones: se pierde un antídoto.");
                    recogerObjeto(inventario, "Antídoto", -1);
                }
                return;
            }
        }

        System.out.println("❌ No se encontró el objeto: " + nombre);
    }

    public static void recogerObjeto(ArrayList<Item> inventario, String nombre, int cantidad) {
        for (Item item : inventario) {
            if (item.getNombre().equals(nombre)) {
                item.aumentarCantidad(cantidad);
                return;
            }
        }

        inventario.add(new Item(nombre, cantidad));
    }

    public static int getCantidad(ArrayList<Item> inventario, String nombre) {
        for (Item item : inventario) {
            if (item.getNombre().equals(nombre)) {
                return item.getCantidad();
            }
        }
        return 0;
    }

    public static void mostrarInventario(ArrayList<Item> inventario) {
        System.out.println("\n📦 Inventario final:");
        for (Item item : inventario) {
            System.out.println("- " + item.getNombre() + ": " + item.getCantidad());
        }
    }
}
