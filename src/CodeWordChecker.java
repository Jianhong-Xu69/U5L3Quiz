public class CodeWordChecker {

    private int upperLimit;
    private int lowerLimit;
    private String blacklist;

    public CodeWordChecker(int lowerLimit, int upperLimit, String blacklist) { //constructor 1, all parameters
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.blacklist = blacklist;
    }
    public CodeWordChecker(String blacklist) {
        lowerLimit = 6;
        upperLimit = 20;
        this.blacklist = blacklist;
    }

    public boolean isValid(String str) {
        return (str.length() <= upperLimit && str.length() >= lowerLimit && !str.contains(blacklist));
    }
}
