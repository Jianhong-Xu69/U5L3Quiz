public class RandomWordRunner {
    public static void main(String[] args) {
        RandomWord t1 = new RandomWord("QWERTYUIOPASDFGHJKLZXCVBNM ","QWERTYUIOPASDFGHJKLZXCVBNM ");
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(t1.randomLetter(1));
                System.out.println(t1.randomLetter(2));
            }
            System.out.println(t1.getNewWord());
        }
    }
}
