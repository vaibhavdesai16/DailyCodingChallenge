package dailycodingchallenge;

import dailycodingchallenge.XORLinkedList.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XORLinkedList xorLinkedList = new XORLinkedList();
        //creating nodes 
        Node first = new Node(1);
        xorLinkedList.head = first;

        Node secound = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        //add object to map to imitate pointer
        xorLinkedList.addObjectToMap(00000, null);
        xorLinkedList.addObjectToMap(10001, first);
        xorLinkedList.addObjectToMap(10002, secound);
        xorLinkedList.addObjectToMap(10003, third);
        xorLinkedList.addObjectToMap(10004, fourth);
        xorLinkedList.addObjectToMap(10005, fifth);
        xorLinkedList.addObjectToMap(10006, sixth);

        // link nodes to each other 
        first.pre_next_address = 00000 ^ 10002;
        secound.pre_next_address = 10001 ^ 10003;
        third.pre_next_address = 10002 ^ 10004;
        fourth.pre_next_address = 10003 ^ 10005;
        fifth.pre_next_address = 10004 ^ 10006;
        sixth.pre_next_address = 10006 ^ 00000;

        //print all
        Node node = xorLinkedList.head;


    }
}
