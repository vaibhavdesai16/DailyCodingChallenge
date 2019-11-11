package dailycoding.challenge9;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       TreeWithLocks tree = new TreeWithLocks(5);
       tree.insert(3);
       tree.insert(6);
       
       tree.lockNode(6);
       
       System.out.println(tree.root.key);
       System.out.println(tree.root.left.is_locked);
       System.out.println(tree.root.right.key);
       
       
       
       
    }
}
