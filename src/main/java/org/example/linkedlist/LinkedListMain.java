package org.example.linkedlist;

public class LinkedListMain {

   public void invokeLinkedListAllFunctions() {
       LinkedList ll = new LinkedList(7);

       ll.append(6);
       ll.append(5);

       //get node
       LinkedList.Node getNode  = ll.get(1);
       System.out.println("In index 1 we have "+getNode.value);

       ll.printList();
       //set node value
       boolean setValue = ll.set(0, 11);
       System.out.println("Value set "+ setValue);

       //remove last
      LinkedList.Node nn = ll.removeLastNode();
       System.out.println("removed node is " + nn.value);

       //add a node in the beginning of the list
       ll.prepend(10);
       ll.printList();

       //remove first node from the list
       LinkedList.Node removeNode = ll.removeFirst();
       System.out.println("Removed first node "+ removeNode.value);
       ll.printList();




   }
}
