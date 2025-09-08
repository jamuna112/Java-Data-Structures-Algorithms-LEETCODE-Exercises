package org.example.linkedlist;

public class LinkedListMain {

   public void invokeLinkedListAllFunctions() {
       LinkedList ll = new LinkedList(7);

       ll.append(6);
       ll.append(5);
       ll.getHead();
       ll.getTail();
       ll.getLength();
       ll.printList();

       //remove last
      LinkedList.Node nn = ll.removeLastNode();
       System.out.println("removed node is " + nn.value);
       ll.getHead();
       ll.getTail();
       ll.getLength();


   }
}
