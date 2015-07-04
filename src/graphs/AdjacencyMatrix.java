package graphs;

/**
 * 
 * @author hharwani
 * Adjacency matrix is way where graph is stored, in this methodspace is a trade-off
 * for most of the graph methods, here space is proportional to the square of number of vertices i.e approx o(n^2) 
 */
public class AdjacencyMatrix {

    private boolean[][] adjMatrix;
    private int vertexCount;
    
    public AdjacencyMatrix(int vertexCount) {
        this.vertexCount=vertexCount;
        adjMatrix=new boolean[this.vertexCount][this.vertexCount];
    }
    
    public void addEdge(int i, int j) {
        if (i < 0 || i > this.vertexCount || j > this.vertexCount || j < 0) {
            throw new java.lang.IllegalArgumentException();
        } else {
            adjMatrix[i][j]=true;
        }     
    }
    
    public void removeEdge(int i, int j) {
        if (i < 0 || i > this.vertexCount || j > this.vertexCount || j < 0) {
            throw new java.lang.IllegalArgumentException();
        } else {
            adjMatrix[i][j]=false;
        }
    }
    
    public boolean isEdge(int i, int j) {
        System.out.println(adjMatrix[i][j]);
        return adjMatrix[i][j];
    }   
    
    public void printGraph() {
        for (int i = 0; i < this.vertexCount; i++ ) {
            System.out.print("\n");
            for (int j = 0; j < this.vertexCount; j++) {
                System.out.print(adjMatrix[i][j] + ",");
            }
        }
    }
}
