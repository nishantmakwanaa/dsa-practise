package src;

public class twopointers {

    public static int find(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return 1;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return -1;

    }

}