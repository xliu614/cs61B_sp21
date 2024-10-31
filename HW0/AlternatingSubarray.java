public class AlternatingSubarray {
    public static int maxAlternatingSubarrayLength(int[] arr) {
        // corner case
        if (arr.length == 1) {
            return arr.length;
        }

        // this is the result
        int maxLength = 1;
        // tracker
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            // Check if the pattern alternates in direction
            // i-1 i
            // i-2, i-1 i
            // i-2 i-1 i
            // 0, 1, 2, 3,4
            // [1,0,2,4,0]
            // [0,3,1]
            // [0,3,4,5]
            if ((arr[i] > arr[i - 1] && (i == 1 || arr[i - 1] < arr[i - 2]))
                    ||
                    (arr[i] < arr[i - 1] && (i == 1 || arr[i - 1] > arr[i - 2]))) {
                currentLength++;
            } else if ((arr[i] == arr[i - 1] && (i == 1 || arr[i - 1] == arr[i - 2]))) {
                currentLength = 1;
            } else {
                currentLength = 2; // Reset to 2, starting a new alternating subarray
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 0, 2 };
        System.out.println("Max alternating subarray length: " + maxAlternatingSubarrayLength(arr));
    }
}
