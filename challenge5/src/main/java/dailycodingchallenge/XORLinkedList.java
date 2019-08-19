package dailycodingchallenge;

import java.util.HashMap;

public class XORLinkedList {
    Node lastNode;
    HashMap<Integer, Node> pointer_mapping = new HashMap<Integer, Node>(); 

     static class Node{
        Node xoraddress;

        Node(int data){
        
        }
    }

    public void add(int data){
        //created new node
        Node node = new Node(data);
        //calculate xor for last node 
    }

    public void pointerFunction(int pointer, Node node){
        //this fucntion will take care of object and pointer mapping
        pointer_mapping.put(pointer, node);
    }
    
}