/*
双链表实现
@ author  Jim_Carrey
*/

public class MyDoubleLinkedList {
        Node headNode;
        int size;



        MyDoubleLinkedList(){
            this.headNode = new Node("i'm head");
            headNode.pre = null;
            headNode.next = null;
            this.size = 1;
        }

        //向链表添加节点
        public void add(Node node){
            if (headNode == getTailNode()){
                headNode.next = node;
                node.pre = headNode;
                size++;
            }else {
                getTailNode().next = node;
                node.pre = getTailNode();
                node.next = null;
                size++;
            }
        }

        //获取头结点
        public Node getHeadNode(){
            return headNode;
        }

        //获取尾结点
        public Node getTailNode(){
            Node tailNode = headNode;
            while (tailNode.next != null){
                tailNode = tailNode.next;
            }
            return tailNode;
        }



    public static void main(String[] args) {
            MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
            myDoubleLinkedList.add(new Node("csd"));
            myDoubleLinkedList.add(new Node(1));
            System.out.println(myDoubleLinkedList.getHeadNode().object);
            System.out.println(myDoubleLinkedList.getTailNode().object);
            System.out.println(myDoubleLinkedList.size);
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