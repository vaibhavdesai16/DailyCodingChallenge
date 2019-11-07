package dailycoding.Challenge8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int[] arr  = {3, 0, 1, 3, 0, 5};
    	//int[] arr  = {2,1,4,0,3,1};
    	System.out.println(rainStorage(arr));
    }
    
    public static int rainStorage(int arr[]) {
    	int unitWater = 0;
    	int[] previousTallest = new int[arr.length];
    	int[] nextTallest = new int[arr.length];
    	int pastHigh = 0;
    	int nextHigh = 0;
    	
    	for(int i = 0; i< arr.length; i++) {
    		previousTallest[i] = arr[i] > pastHigh ? arr[i] : pastHigh;
    		pastHigh = arr[i] > pastHigh ? arr[i] : pastHigh;
    		
    		
     		nextTallest[(arr.length-1) - i] = arr[(arr.length-1) - i] > nextHigh ? arr[(arr.length-1) - i] : nextHigh;
    		nextHigh = arr[(arr.length-1) - i] > nextHigh ? arr[(arr.length-1) - i] : nextHigh;
    	}
    	
    	for(int i = 0; i< arr.length; i++) {
    		unitWater +=  Math.min(previousTallest[i], nextTallest[i]) - arr[i];
    	}
    	
    	return unitWater;
    }
}
