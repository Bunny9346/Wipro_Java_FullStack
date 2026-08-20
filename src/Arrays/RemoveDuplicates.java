package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element appeared earlier
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print only if it is not a duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
