public class Mayorv2 {

    public static int encontrarMayor(int[] numeros) {
        int mayor = 0; //Cambio <------

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        int[] datos = {-3, -7, -2, -9, -5};//Cambio <------
        int resultado = encontrarMayor(datos);
        System.out.println("El número mayor es: " + resultado);
    }
}