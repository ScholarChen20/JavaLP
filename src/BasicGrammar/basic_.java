package BasicGrammar;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
class FreshJuice {
    enum freshJuiceType { SMALL, MEDIUM, LARGE }
    freshJuiceType size;
}
public class basic_ {
    public static void main(String[] args) {
        /***
         * Here is the code of basic_.java
         * It is a simple program that prints "Hello, World!" to the console.
         * The program starts with the keyword "public static void main(String[] args)".
         * The "public" keyword indicates that the main method can be accessed from other classes.
         * The "static" keyword indicates that the main method does not depend on any instance variables.
         * The "void" keyword indicates that the main method does not return any value.
         * The "main" keyword indicates that the method is the entry point of the program.
         */
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size =FreshJuice.freshJuiceType.MEDIUM;
        System.out.println("freshJuice.size is " + freshJuice.size);
    }
}
