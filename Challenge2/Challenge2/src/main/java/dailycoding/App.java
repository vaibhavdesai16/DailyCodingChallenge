package dailycoding;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = {1, 2, 3, 4, 5};
       productOfOther(arr);
    }

    public static int productOfOther(int[] arr){
        int product = 1;
        for(int num : arr){
            product = product*num;
        }
        for(int num : arr){
            System.out.println(product/num);
        }
        return 0;
    }
}
