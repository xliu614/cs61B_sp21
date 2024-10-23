// For an int array, get the sum of all the elements

// and get the sum of all the elements except the first and the last element
public class GetSum {

    public static int getArraySum (int[] arr) {
        int reval = 0;
        for (int i = 0; i < arr.length; i++){
            reval = reval + arr[i];
        }
        return reval;

    }
    public static void main(String[] args) {
        int[] test_Array = {1,2,3,4,5};
        int result = getArraySum(test_Array);
        System.out.println(result);
    }
}