import java.util.*;

class Simple {
    public static void main(String args[]) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            num(arr[i]);
            arr[i] = num(arr[i]);
        }
        System.out.println(arr.getClass());
        System.out.println(Arrays.toString(arr));
    }

    public static int num(int s) {
        int sum = 0;
        for (int i = 0; i <= s; i++) {
            sum += i;

        }
        return sum;

    }
}