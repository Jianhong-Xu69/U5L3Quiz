public class CodeWordCheckerRunner {
    public static void main(String[] args) {
        CodeWordChecker test = new CodeWordChecker(5,8,"$");
        System.out.println(test.isValid("happy"));
        System.out.println(test.isValid("happy$"));
        System.out.println(test.isValid("Code"));
        System.out.println(test.isValid("happyCode"));

        System.out.println();

        CodeWordChecker test2 = new CodeWordChecker("pass");
        System.out.println(test2.isValid("MyPass"));
        System.out.println(test2.isValid("Mypassport"));
        System.out.println(test2.isValid("happy"));
        System.out.println(test2.isValid("1,000,000,000,000,000"));
    }
}
