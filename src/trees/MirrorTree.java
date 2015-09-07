package trees;

public class MirrorTree {

    Node temp;
    public Node mirrorTree(Node node){
        if(node==null)
            return null;
        Node n1=mirrorTree(node.left);
        Node n2=mirrorTree(node.right);
        temp=n1;
        node.left=n2;
        node.right=temp;
        return node;
    }
}
