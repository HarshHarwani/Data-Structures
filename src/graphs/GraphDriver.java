package graphs;

public class GraphDriver {
    
    public static void main(String args[]) {
        
        AdjacencyMatrix aMatrix=new AdjacencyMatrix(4);
        aMatrix.addEdge(0, 1);
        aMatrix.addEdge(0, 3);
        aMatrix.addEdge(1, 2);
        aMatrix.addEdge(2, 0);
        aMatrix.addEdge(2, 3);
        aMatrix.isEdge(2,3);
        aMatrix.printGraph();
        AdjacencyList aList=new AdjacencyList(5);
        aList.addEdge(0, 1);
        aList.addEdge(0, 3);
        aList.addEdge(1, 2);
        aList.addEdge(2, 0);
        aList.addEdge(2, 3);
        aList.isEdge(0, 1);
        aList.isEdge(0, 3);
        aList.isEdge(2, 0);
        aList.isEdge(2, 0);
        aList.printGraph();
        aList.removeEdge(0, 3);
        aList.removeEdge(1, 2);
        aList.removeEdge(3, 2);
        aList.printGraph();
    }
}
