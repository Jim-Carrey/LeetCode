/*设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。

        循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。

        你的实现应该支持如下操作：

        MyCircularQueue(k): 构造器，设置队列长度为 k 。
        Front: 从队首获取元素。如果队列为空，返回 -1 。
        Rear: 获取队尾元素。如果队列为空，返回 -1 。
        enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
        deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
        isEmpty(): 检查循环队列是否为空。
        isFull(): 检查循环队列是否已满。
实现思路：固定数组+双指针
*/

import java.util.ArrayList;

public class MyCircularQueue {
    ArrayList date ;
    int size ;      //队列大小
    int frontIndex = 0;     //头指针
    int rearIndex = 0;      //尾指针
    MyCircularQueue(int k){
        date = new ArrayList(k);
        size = k;
    }

    boolean isEmpty(){
        return date.isEmpty();
    }

    boolean isFull(){
        if ((date.size()==size)){
            return true;
        }
        return false;
    }

    boolean enQueue(int value){
        if(!isFull()){
            date.add(value);
            rearIndex = date.lastIndexOf(value);
            return true;

        }
        return false;
    }

    boolean deQueue(){
        if (!isEmpty()){
            date.remove(frontIndex);
            frontIndex = rearIndex-1;
            return true;
        }
        return false;
    }

   int Front(){
        if (!isEmpty()){
           return (int) date.get(frontIndex);
        }
        return -1;
   }

   int Rear(){
        if (!isEmpty()){
            return (int) date.get(rearIndex);
        }
        return -1;
   }
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.enQueue(2));
        System.out.println(myCircularQueue.enQueue(3));
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
    }
}


