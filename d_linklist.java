//                                          DOUBLY LINKED LIST


class Node {
    int data;
    Node next;
    Node prev;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class d_linklist{
    
    private Node head;
    
    public d_linklist() {
        this.head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        head = newNode;
    }
        public void clear() {
        head = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }

    }

    
    public int removeLast() {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
             int data = current.next.data;
            current.next = null;
            return  data;
    }


    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main (String arr[])
    {
        d_linklist myList = new d_linklist();
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addLast(10);
        myList.printNodes();
        myList.removeLast();
        myList.printNodes();

    }
}


