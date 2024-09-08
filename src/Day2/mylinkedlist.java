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

    public void add(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) { // test xem index co khac 0 khong
            addFirst(data);// neu co dung addfirst
            return;
            // index = 1
            // 1 -> 2 -> 3
            // can add 4 vao 1 va 2
        } else {
            Node temp = head; // temp = 1
            for (int i = 0; i <= index - 1; i++) {
                temp = temp.next;// temp = 2
            }
            Node nextNode = temp.next;// nextNode = 2
            temp.next = newNode;// temp.next = 4
            newNode.next = nextNode;// newNode.next = 3
            // 1 -> 4 -> 2 -> 3
        }
    }

    // BTVN 2
    public int length() {
        Node temp = head;
        int count = 0;
        // 1 -> 2 -> 3 -> 4
        if (head != null) {// temp = 1
            count++;// count = 1
        }
        while (temp != null) {
            temp = temp.next;// temp = 2 ==> temp = 3 ==> temp = 4
            count++;// count = 2 ==> count = 3 ==> count = 4
        }
        System.out.println(count);
        return count;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    // 1 -> 2 -> 3 -> 4
    public void deletFirst() {
        Node temp = head;
        head = head.next;
        temp = null;
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
