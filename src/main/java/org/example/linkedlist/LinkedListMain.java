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

       boolean insertValue = ll.insert(2, 23);
       System.out.println("inserted value "+ insertValue);
       ll.printList();

       //remove last
      LinkedList.Node nn = ll.removeLastNode();
       System.out.println("removed node is " + nn.value);

       //remove
       LinkedList.Node remNode = ll.remove(2);
       System.out.println("remove node in between "+ remNode.value);
       ll.printList();

       //add a node in the beginning of the list
       ll.prepend(10);

       //remove first node from the list
       LinkedList.Node removeNode = ll.removeFirst();
       System.out.println("Removed first node "+ removeNode.value);
       ll.printList();

       //reverse a linkedlist
      LinkedList.Node rev =  ll.reverseLinkedlist();
       System.out.println("reversed linked list head " + rev.value);

    //remove duplicates
       System.out.println("remove duplicates are ");
       ll.prepend(20);
       ll.prepend(30);
       ll.prepend(20);
       ll.prepend(30);
       ll.printList();
       ll.removeDuplicates();
       ll.printList();



   }
}
