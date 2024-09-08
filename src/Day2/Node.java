package Day2;

//Node lưu trữ số nguyên 
public class Node {
    private int data;
    public Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
