//SingleLinkedList
package LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked list
    public Node createLinkedList(int nodeValue) {
        head = new Node(nodeValue);
        tail = head;
        size = 1;
        return head;
    }

    // Insert into a linked list
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse a linked list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.print("\n");
        }
    }

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Delete a node from a single linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) { // Deleting the first node
            head = head.next;
            size--;
            if (size == 0) { // If there was only one element
                tail = null;
            }
        } else if (location >= size) { // Deleting the last node
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // If there was only one element
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else { // Deleting a node at any given location
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}

// By Mohamed