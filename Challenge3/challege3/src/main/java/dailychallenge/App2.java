package dailychallenge;

/**
 * App2
 */
public class App2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        missingPositive(arr);
    }

    public static void missingPositive(int[] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;
        int total = 0;
        int count = 1;
        for(int num: arr){
            if(num > 0){
                if(num > max)
                    max = num;
                else if(num < min)
                    min = num;
                    
                count++;
                total += num;
            }
        }

        int missingnum = (((max + min)*count)/2) - total;
        System.out.println(missingnum);
    }


}