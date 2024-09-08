package Day2;

public class mylinkedlist {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);// chuyen du lieu vao node
        newNode.next = head;// lien ket newNode den voi head
        head = newNode;// gan head vao newNode
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;// Node temp tro den d/c cua head de lay du lieu head
        // Chu y neu head la null gan luon head voi newNode
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        // Sau lenh nay da tim duoc node cuoi cung va duoc gan cho temp

        temp.next = newNode;
    }

    public static void main(String[] args) {
        mylinkedlist listlinked = new mylinkedlist();
        // listlinked.addFirst(1);
        // listlinked.addFirst(2);
        // listlinked.addFirst(3);
        listlinked.addLast(1);
        listlinked.addLast(2);
        listlinked.addLast(3);
    }
}
