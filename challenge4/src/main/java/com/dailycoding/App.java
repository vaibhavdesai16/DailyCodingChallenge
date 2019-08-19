package com.dailycoding;
import java.util.HashSet;

import com.dailycoding.LinkedList.Node;

public class App 
{
    public static void main( String[] args )
    {
       LinkedList linkOne = new LinkedList();

       linkOne.head = new Node(10);
       Node secound = new Node(20);
       Node third = new Node(30);
       Node fourth = new Node(40);
       Node fifth = new Node(50);
       Node sixth = new Node(60);
       Node seventh = new Node(70);
       Node eight = new Node(80);

        //linking 
       linkOne.head.next = secound;
       secound.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = sixth;
       sixth.next = seventh;
       seventh.next = eight;


       LinkedList linkTwo = new LinkedList();
       linkTwo.head = new Node(78);
       Node seventyNine = new Node(79);
       Node eightyOne = new Node(81);
       Node eightTwo = new Node(82);
       Node eightThree = new Node(83);

       linkTwo.head.next = seventyNine;
       seventyNine.next = eightyOne;
       eightyOne.next = eightTwo;
       eightTwo.next = eightThree;
       eightTwo.next = fifth;

       linkTwo.printList();

       findCommonNode(linkOne, linkTwo);


    }

    public static void findCommonNode(LinkedList one, LinkedList two){
        
        HashSet<Node> nodeSet = new HashSet<Node>();
        Node pointerOne = one.head;
        Node pointerTwo = two.head;
        while(pointerOne.next != null){
            nodeSet.add(pointerOne);
            pointerOne = pointerOne.next;
        }

        while(pointerTwo.next != null){
            if(!nodeSet.add(pointerTwo.next)){
                System.out.println("intersection found " + pointerTwo.next.data);
                break;
            }
            pointerTwo = pointerTwo.next;
        }
    }
}
