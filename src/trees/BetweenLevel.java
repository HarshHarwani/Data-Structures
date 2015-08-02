package trees;

/**
 * Objec­tive: Given a binary Tree and two lev­els, Print all the nodes between
 * those.
 * 
 * Input: A Binary Tree and two levels.
 * 
 * Out­put: Print all the nodes between given levels.
 * 
 * @author hharwani
 *
 */
public class BetweenLevel {
    
    public void printBetweenLevel(Node root,int min,int max){
        printBetweenLevel1(root,min,max,0);
    }

    private void printBetweenLevel1(Node root, int min, int max, int level) {
        if(root==null)
            return;
        if(level>min && level<max)
            System.out.print(root.data+" ");
        printBetweenLevel1(root.left, min, max,level+1);
        printBetweenLevel1(root.right, min, max,level+1);
    }

}
