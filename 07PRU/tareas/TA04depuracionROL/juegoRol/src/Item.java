public class Item {
    private String nombre;
    private int cantidad;

    public Item(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void disminuirCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }
}
