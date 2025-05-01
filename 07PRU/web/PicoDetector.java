public class PicoDetector {

    public static int contarPicos(int[] datos) {
        int contador = 0;

        for (int i = 1; i < datos.length - 1; i++) {
            if (datos[i] > datos[i - 1] && datos[i] > datos[i + 1]) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] valores = {1, 3, 2, 4, 4, 6, 1, 5, 3};
        int resultado = contarPicos(valores);
        System.out.println("Número de picos: " + resultado);
    }
}