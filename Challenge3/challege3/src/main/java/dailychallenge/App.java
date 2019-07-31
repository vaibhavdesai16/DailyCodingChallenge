package dailychallenge;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 0, 1, 5, 7, 8, 9 };
        missingPositive(arr);
    }

    public static void missingPositive(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int missingPositive = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i >= 0){
                map.put(i, i);
            }          
        }

        for (int num : arr) {
            if (!map.containsKey(num - 1) && (num -1) > 0) {
                if(missingPositive > num-1)
                    missingPositive = num-1;
            } 
            else if (!map.containsKey(num + 1)) {
                if(missingPositive > num-1)
                    missingPositive = num+1;
            }
        }
        
        System.out.println(missingPositive);

    }
}
