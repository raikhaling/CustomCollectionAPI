package Collections;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class CustomIntLinkedList {
    private Node head;
    private int size;

    public CustomIntLinkedList() {
        this.head = null;
        size = 0;
    }

    public void add(int value) {
        Node nodal = new Node(value);
        if (head == null) { //if the list is empty then add head to the new Node.
            head = nodal;
            size++;
        } else {
//            while(head.next != null){
//                head = head.next;
//            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nodal; //link the new node to the last node in the list
            size++;
        }
    }

    public void addFirst(int value) {
        Node first = new Node(value);
        first.next = head;
        head = first;

    }

    //method to remove a node
    public void remove(int index) {

        int flag = 0;
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            /**----Method 1----*/
//           while(current.next != null){
//               flag++;
//               current = current.next;
//               if(flag == index -1){
//                   current.next = current.next.next;
//               }
//           }
            /**----Method 2----*/
            for (int i = 0; i < index - 1; i++) {

                current = current.next;// move to the node
            }
            current.next = current.next.next; // skip the node at the given index
        }
        size--;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


}
