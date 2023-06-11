package linkedList.easy;

import javax.swing.plaf.SliderUI;

/*
 * 
 * Insert Node at the start of the linked list
 * 
 * 
*/
public class InsertNode {

    // Represent a node of a single linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Represent the head and tail of the linked list
    public Node heaNode = null;
    public Node taiNode = null;

    // addAtStart will create a new node at the beginning of the list
    public void addAtStart(int data) {
        // Create a new node
        Node newNode = new Node(data);
        if (heaNode == null) {
            heaNode = newNode;
        } else {
            // Temp node to carry the head
            Node temNode = heaNode;

            // add the newNode to the head
            heaNode = newNode;
            heaNode.next = temNode;

        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = heaNode;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertNode sList = new InsertNode();

        // Adding 1 to the list
        sList.addAtStart(1);
        sList.display();

        // Adding 2 to the list

        sList.addAtStart(2);
        sList.display();

        // Adding 3 to the list
        sList.addAtStart(3);
        sList.display();
    }

}
