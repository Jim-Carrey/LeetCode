/*
双链表实现
@ author  Jim_Carrey
*/

public class MyDoubleLinkedList {
        Node node;
        int size;

        MyDoubleLinkedList(){
            this.node = new Node("i'm head");
            node.pre = null;
            node.next = null;
            this.size = 1;
        }
        public void add(Node node){
            this.node.next = node;
            node.pre = this.node;
            node.next = null;
            this.node = node;
            size++;
        }

    public static void main(String[] args) {
            MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
            myDoubleLinkedList.add(new Node("csd"));
            System.out.println(myDoubleLinkedList.node.object);
            myDoubleLinkedList.add(new Node(1));
            System.out.println(myDoubleLinkedList.node.object);
            System.out.println(myDoubleLinkedList.node.pre.object);
            System.out.println(myDoubleLinkedList.node.pre.pre.object);

    }

}
class Node{
        Object object;
        Node next;
        Node pre;
    Node(Object object){
        this.object = object;
    }
}