package dailycoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> integer = new ArrayList<Integer>();
        integer.add(9); integer.add(9); integer.add(9); integer.add(9);
        increamentByOne(integer);

    }

    public static ArrayList<Integer> increamentByOne(ArrayList<Integer> arr){
        int carry = 1;
        Stack<Integer> stack = new Stack<Integer>();
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){ stack.add(it.next());}
        Iterator<Integer> sti = stack.iterator();
        arr.clear();
        while(sti.hasNext()){
            int i = stack.pop() + carry;
            if(i > 9){
                carry = 1;
                i = 0;
            }
            else{
                carry = 0;
            }
            arr.add(i);
        }
        if(carry == 1){
            arr.add(1);
        }
        Collections.reverse(arr);

        return arr;
    }
}
