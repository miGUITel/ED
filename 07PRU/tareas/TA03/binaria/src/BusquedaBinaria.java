public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};
        int objetivo = 10;
        int izquierda = 0;
        int derecha = numeros.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int valor = numeros[medio];

            if (valor == objetivo) {
                System.out.println("Encontrado en la posición " + medio);
                break;
            } else if (valor < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
    }
}