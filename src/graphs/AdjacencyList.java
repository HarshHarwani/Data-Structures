package graphs;

import java.util.LinkedList;

public class AdjacencyList {

    private int vertexCount;
    private vertexClass[] vertexArray;
    
    
    private class vertexClass {
        private int vertex;
        private LinkedList<Integer> adjacencyList;
        public int getVertex() {
            return vertex;
        }
        public void setVertex(int vertex) {
            this.vertex = vertex;
        }
        public LinkedList<Integer> getAdjacencyList() {
            return adjacencyList;
        }
        public void setAdjacencyList(LinkedList<Integer> adjacencyList) {
            this.adjacencyList = adjacencyList;
        }
    }
    
    public AdjacencyList(int vertexCount) {
        this.vertexCount=vertexCount;
        vertexArray =new vertexClass[this.vertexCount];
       for (int i = 0; i < vertexCount; i++) {
           vertexClass vClass=new vertexClass();
           vClass.setVertex(i);
           vClass.setAdjacencyList(new LinkedList<Integer>());
           vertexArray[i]=vClass;
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
           vertexClass vClass=vertexArray[i];
           LinkedList<Integer> linkedList=vClass.getAdjacencyList();
           linkedList.add(j);
        } else {
            throw new java.lang.IndexOutOfBoundsException("Indices out of range");
        }
    }
   public void removeEdge(int i, int j) {
        if (isIndicesValid(i, j)) {
            vertexClass vClass = vertexArray[i];
            LinkedList<Integer> linkedList=vClass.getAdjacencyList();
            int index=linkedList.indexOf(j);
            if (index!=-1) {
            linkedList.remove(index);
            }
        } else {
            throw new java.lang.IndexOutOfBoundsException("Indices out of range");
        }
    }
    
    public boolean isEdge(int i, int j) {
        if (isIndicesValid(i, j)) {
            vertexClass vClass = vertexArray[i];
            LinkedList<Integer> linkedList = vClass.getAdjacencyList();
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
           vertexClass vClass = vertexArray[i];
            System.out.print("Vertex"+ vClass.getVertex()+"-->");
            LinkedList<Integer> linkedList = vClass.getAdjacencyList();
            for (int j=0; j < linkedList.size(); j++) {
                System.out.print(linkedList.get(j)+",");
            }
        }
    }
}
