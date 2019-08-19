package dailychallenge;

/**
 * using linear time and constant space algorithm
 */
public class App2 {
    public static void main(String[] args) {
<<<<<<< HEAD
        int[] arr = {-1, -2, 5, 1, 3, 2, 4};
        //1, 2, /4, 1, 1, 3
        missingPositive(arr);
    }

    public static void missingPositive(int[] arr){
        //moving all non positive numbers to left
        int j = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] <= 0){
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        //take each value and make value at that index is negative
        for(int i=j; i<arr.length; i++){
            int value = arr[i];
            if(arr[Math.abs(value)] > 0){
                arr[Math.abs(value)] = arr[Math.abs(value)] * -1;
            }       
        }

        //print first postive value
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0)
                System.out.println(i);
=======
        int[] arr = { 3, 4, -1, 1 };
        missingPositive(arr);
    }

    private swapValue(int[] arr, int i) {
        if(arr[i] == i + 1) {
            return;
        } else if(arr[i] + 1 < arr.length) {

>>>>>>> a268fd36eafa135cbfc261fd70077d3f952f6096
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