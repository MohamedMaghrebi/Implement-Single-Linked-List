
//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
    // why when inserting a value at a position that is already occupied, it throws a null pointer exception.

package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1); // Fix implemented
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(4);

        // Testing delete method
        singleLinkedList.deleteNode(0); // Delete at beginning
        singleLinkedList.traverseLinkedList();
        singleLinkedList.deleteNode(3); // Delete at end
        singleLinkedList.traverseLinkedList();
        singleLinkedList.deleteNode(1); // Delete at middle
        singleLinkedList.traverseLinkedList();
    }
}
// by Mohamed