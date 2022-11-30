public class BusRunner {
    public static void main(String[] args) {
        Bus b1 = new Bus(10);
        for (int i = 0; i < 100; i++) {
            System.out.println(b1.getCurrentStop());
            b1.move();
        }
    }
}
