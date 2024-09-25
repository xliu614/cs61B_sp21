// create a ArrayExcercise class
// create an int array which has 10 ints
// display all the ints at odd positions in the array
public class ArrayExercise {
    public static void calc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] test_Array = {32,2,3,4,5,6,7,8,49,10,3,4,5,6,7,8,9};
        calc(test_Array);
    }
}