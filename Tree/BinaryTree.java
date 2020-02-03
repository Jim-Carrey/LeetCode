import java.util.Stack;

public class BinaryTree {
    Node rootNode;

    public static void main(String[] args) {
        int[] array = {5,4,7,3,2,6,8};
        BinaryTree binaryTree = new BinaryTree();
        for (int i = 0; i < array.length; i++) {
            binaryTree.insertValToTree(array[i]);
        }
        binaryTree.firstTraverse();
        System.out.println();
        binaryTree.recursionFirstTarverse(binaryTree.rootNode);
    }

    void insertValToTree(int value){
        Node node = new Node(value);
        if (this.rootNode == null){ //判断二叉树是否为空，为空则将此节点设为根节点
            rootNode = node;
        }else{  //不为空，则比较，值比根节点小，则放在左子树，反之放在右子树
            Node p = this.rootNode;
            while (true){
                if (value < p.value){
                    if (p.leftSon == null){
                        p.leftSon = node;
                        break;
                    }else {
                        p = p.leftSon;
                    }
                }else if (value > p.value){
                    if (p.rightSon == null){
                        p.rightSon = node;
                        break;
                    }else {
                        p = p.rightSon;
                    }
                }else{
                    System.out.println("已存在");
                }
                }
            }

        }
        //递归先序遍历

    void recursionFirstTarverse(Node rootNode){
        if (rootNode != null){
            System.out.print(rootNode.value+" ");
            recursionFirstTarverse(rootNode.leftSon);
            recursionFirstTarverse(rootNode.rightSon);
        }

    }
//非递归，栈方式先序遍历
    void firstTraverse(){
        Stack<Node> nodeStack = new Stack<Node>();
            Node node = rootNode;
            while (node != null || !nodeStack.isEmpty()){
                while(node != null){
                    System.out.print(node.value+" ");
                    nodeStack.push(node);
                    node = node.leftSon;
                }
                //左子树为空结束，弹栈，找出该节点的右子树
                if (!nodeStack.isEmpty()){
                    node = nodeStack.pop();
                    node = node.rightSon;
                }
            }
    }

}

class Node{
    int value;
    Node leftSon;
    Node rightSon;

    Node(int value){
        this.value = value;
        leftSon = null;
        rightSon = null;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }
}
