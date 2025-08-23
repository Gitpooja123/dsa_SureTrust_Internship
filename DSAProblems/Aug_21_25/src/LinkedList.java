class Node {
    int data; //value store karne ke liye
    Node next; //agle node ka address store karne ke liye

    Node(int data) { //initialize object (object banate hi automatically call hota)
        this.data = data; // jo value pass kare, use store karo
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        Node start = head;
        while (start!=null){
            System.out.print(start.data + "->");
            start = start.next;
        }
        System.out.println("null");
    }

    public void addAtFirst(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println(head.data); // head is now pointing to newNode
    }

    public int countNoOfNodes(){
        Node start = head;
        int count = 0;
        while (start!=null){
            count++;
            start = start.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();

        list.addAtFirst(10);
        list.display();

        System.out.println(list.countNoOfNodes());

    }
}
