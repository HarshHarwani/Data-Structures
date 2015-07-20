package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAtDepthBtree {
    
    //recursive solution
    public List<LinkedList<Node>> getListAtDepthBtree(Node node) {
        List<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
        createLists(node, lists, 0);
        return lists;
    }

    private void createLists(Node node, List<LinkedList<Node>> lists, int level) {
        if (node == null)
            return;
        LinkedList<Node> list = null;
        if (level == lists.size()) {
            list = new LinkedList<Node>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(node);
        createLists(node.left, lists, level + 1);
        createLists(node.right, lists, level + 1);
    }
    
    //iterative solution
    public List<LinkedList<Node>> createLists1(Node node){
        List<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> current = new LinkedList<>();
        if(node!=null){
            current.add(node);
        }
        while(current.size()>0){
            lists.add(current);
            LinkedList<Node> parents=current;
            current=new LinkedList<>();
            for(Node n:parents){
                if(n.left!=null)
                    current.add(n.left);
                if(n.right!=null)
                    current.add(n.right);
            }
        }
        return lists;
    }

}
