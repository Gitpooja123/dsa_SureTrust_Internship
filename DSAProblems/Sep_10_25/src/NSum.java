public class NSum {

    int sum(int n, int s) {
        if (n == 0) {
            return s;
        }
        return sum(n - 1, s + n);
    }

    public static void main(String[] args) {
        NSum obj = new NSum();
        int n = 5;

        //int result = new NSum().sum(n, 0);

        int result = obj.sum(n, 0);  // call method with s = 0
        System.out.println("Sum of first " + n + " numbers = " + result);
    }
}

