package dailycodingchallenge;

import java.util.HashMap;
import java.util.Random;

public class XORLinkedList {
    Node lastNode;
    HashMap<Integer, Node> pointer_mapping = new HashMap<Integer, Node>();
    Random rad = new Random();

    XORLinkedList(){
        pointer_mapping.put(0, null);
    }

     static class Node{
        int xoraddress;
        int data;

        Node(int data){
        this.data = data;
        }
    }

    public void add(int data){
        //created new node
        Node current_node = new Node(data);
        pointerFunction(rad.nextInt(), current_node);

        //calculate xor for last node
        Node previousOfLast = getNodByPointer(lastNode.xoraddress);
        lastNode.xoraddress = previousOfLast.xoraddress ^ current_node.xoraddress;
    
    }

    public void pointerFunction(int pointer, Node node){
        //this fucntion will take care of object and pointer mapping
        pointer_mapping.put(pointer, node);
    }

    public Node getNodByPointer(int pointer){
        return pointer_mapping.get(pointer);
    }
    
}