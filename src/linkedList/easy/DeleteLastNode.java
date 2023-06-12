package linkedList.easy;

public class DeleteLastNode {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteNodeFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        else {

            if (head != tail) {
                Node currentNode = head;
                while (currentNode.next != tail) {
                    currentNode = currentNode.next;
                }

                // Second last element will become the new tail of the element
                tail = currentNode;
                tail.next = null;

            } else {
                head = tail = null;
            }

        }
    }

    public static void main(String[] args) {

        DeleteLastNode sList = new DeleteLastNode();

        // Adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        // Printing original list
        System.out.println("Original List: ");
        sList.display();

        while (sList.head != null) {
            sList.deleteNodeFromEnd();
            // Printing updated list
            System.out.println("Updated List: ");
            sList.display();
        }
    }
}
