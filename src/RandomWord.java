public class RandomWord {

    private String word1;
    private String word2;
    private String newWord;

    public RandomWord(String w1, String w2) {
        word1 = w1;
        word2 = w2;
        newWord = "";
    }

    public String randomLetter(int n) {
        String temp;
        if (n == 1) {
            temp = String.valueOf(word1.charAt((int) (Math.random() * word1.length())));
        } else {
            temp = String.valueOf(word2.charAt((int) (Math.random() * word2.length())));
        }
        newWord += temp;
        return temp;
    }

    public String getNewWord() {
        return newWord;
    }

    public void resetWord() {
        newWord = "";
    }
}
