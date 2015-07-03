package graphs;

import java.util.LinkedList;

public class AdjacencyList {

    private int vertexCount;
    private LinkedList<Integer>[] adjacencyList;
    
    @SuppressWarnings("unchecked")
    public AdjacencyList(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException();
        }
        this.vertexCount = vertexCount;
        adjacencyList = new LinkedList[this.vertexCount];
        for (int i = 0; i < this.vertexCount; i++) {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            adjacencyList[i] = linkedList;
        }
    }
    
    private boolean isIndicesValid(int i, int j) {
        if (i < 0 || i >= this.vertexCount || j < 0 || j >= this.vertexCount) {
            return false;
        } else {
            return true;
        }
    }
    
    public void addEdge(int i, int j) {
        if (isIndicesValid(i, j)) {
            LinkedList<Integer> linkedList = adjacencyList[i];
            linkedList.add(j);
        } else {
            throw new java.lang.IndexOutOfBoundsException("Indices out of range");
        }
    }
    
    public boolean isEdge(int i, int j) {
        if (isIndicesValid(i, j)) {
            LinkedList<Integer> linkedList = adjacencyList[i];
            for (int p=0; p < linkedList.size(); p++) {
            if (linkedList.get(p) == j) {
                System.out.println("There is an edge");
                return true;
            }
         }
            System.out.println("There is not an edge");
            return false;  
        } else {
            throw new java.lang.IndexOutOfBoundsException("Indices out of range");
        }
    }
    
    public void printGraph() {
        for (int i = 0; i < this.vertexCount; i++) {
            System.out.print("\n");
            LinkedList<Integer> linkedList = adjacencyList[i];
            for (int j=0; j < linkedList.size(); j++) {
                System.out.print(linkedList.get(j)+",");
            }
        }
    }
}
