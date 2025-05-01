public class Main {
    public static void main(String[] args) {
        metodoA();
    }

    public static void metodoA() {
        metodoB();
    }

    public static void metodoB() {
        System.out.println("Debugging");
    }
}