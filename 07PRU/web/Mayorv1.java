public class Mayorv1 {

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        int[] datos = {3, 7, 2, 9, 5, 3,5,9,11,6,2};
        int resultado = encontrarMayor(datos);
        System.out.println("El número mayor es: " + resultado);
    }
}