package dailycoding.Challeneg1;

import java.util.HashMap;

public class App 
{
    public static void main( String[] args )
    {
    	int[] arr = {10, 15, 3, 7};
    	int k = 17;
    	getTwoSumofIntegers(arr, k);
    }
    
    public static void getTwoSumofIntegers(int[] arr, int k) {
    	HashMap<Integer, Integer> map = new HashMap();
    	
    	for(int i=0; i<arr.length; i++) {
    		int rem = k - arr[i];
    		if(map.containsKey(rem) && map.get(rem) != i) {   			
    			System.out.println(arr[i] +" "+  rem);
    		}
    		map.put(arr[i], arr[i]);
    	}
     		
    }
}
