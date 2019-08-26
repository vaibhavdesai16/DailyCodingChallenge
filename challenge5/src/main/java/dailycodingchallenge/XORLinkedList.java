package dailycodingchallenge;

import java.util.HashMap;

/**
 * XORLinkedList
 */
public class XORLinkedList {
    Node head;
    HashMap<Integer, Node> pointermap = new HashMap<Integer, Node>();

    public static class Node {
        int pre_next_address; 
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    public void  addObjectToMap(int address, Node node){
        pointermap.put(address, node);
    }

    
}