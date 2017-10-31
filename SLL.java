class Node {
    public int value;
    public Node next;
}


public class SLL {
    private Node head;
    
    public boolean isEmpty() {
        return (head == null);
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
    }

    public Node remove() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public String find(int num) {
        Node current = head;
        while (current != null) {
            if (current.value == num) {
                System.out.println("Found" + current.value);
                return ("Found" + current.value);
            }
            current = current.next;
        }
        return ("Not Found");
    }
    
    public void removeAt(int num) {
        Node current = head;
        Node prev = current;
        while (current != null) {
            if(current.value == num){
                prev.next = current.next;
                System.out.println("Success: " + num + " removed");
            }
            prev = current;
            current = current.next;
        }

    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("Finished");
    }

}

