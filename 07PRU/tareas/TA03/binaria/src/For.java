public class ContadorConCondicion {
    public static void main(String[] args) {
        int suma = 0;
        int contadorMultiplos = 0;

        for (int i = 1; i <= 50; i++) {
            suma += i;

            if (i % 3 == 0) {
                contadorMultiplos++;
            }

            if (i == 33) {
                System.out.println("Punto de control alcanzado");
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Multiplos de 3 encontrados: " + contadorMultiplos);
    }
}