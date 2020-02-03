public class MyHashMap {

        Node[] array;


    MyHashMap(){
            array = new Node[16];
        }

        public void put(Object key,Object value){
            Node node;
            int index = key.hashCode();
            if (array[index] == null){
                array[index].value = value;
            }else{
                node = array[index].next;
                while ( node != null){
                    node = node.next;
                }
                node.next = new Node(value,null);
            }
        }

class Node{
            Object value;
            Node next;
            Node(Object value,Node next){
                this.value = value;
                this.next = next;
            }
}



}
