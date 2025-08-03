public class Greater {
    public static void main(String[] args) {
        int[] arr = {6,8,90,3,67,8,23,50};

        int max1 = Integer.MIN_VALUE; // -2147483648
        int max2 = Integer.MIN_VALUE; // -2147483648

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];

            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
