public class RecursiveMethods {
    public static void main(String[] args) {
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        
        // Calling g(4) and printing the result
        int result = recursiveMethods.g(4);
        System.out.println("Result of g(4): " + result);
    }

    public int f(int i) {
        if (i <= 0) {
            return 1;
        } else {
            return g(i - 1);
        }
    }

    public int g(int i) {
        if (i <= 0) {
            return 2;
        } else {
            return 2 * f(i - 1);
        }
    }
}
