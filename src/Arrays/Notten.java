package Arrays;

public class Notten {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2};

        int index = 0;

        // Copy all elements except 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
