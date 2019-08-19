package dailychallenge;

/**
 * App2
 */
public class App2 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        missingPositive(arr);
    }

    private swapValue(int[] arr, int i) {
        if(arr[i] == i + 1) {
            return;
        } else if(arr[i] + 1 < arr.length) {

        }
    }

    public static void missingPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num == i - 1 || num < 1) {
                continue;
            } else if(num <= arr.length) {
                
            }
        }
    }

}