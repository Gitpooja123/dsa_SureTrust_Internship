public class RecursionExample {
    public static void main(String[] args) {
        printNumbers(1); // Start from 1
    }

    // Recursive function
    static void printNumbers(int n) {
        if (n > 5) {   // base condition (stopping rule) → stop when n > 5
            return;
        }
        System.out.println(n);  // work
        printNumbers(n + 1);    // recursive call
    }
}
