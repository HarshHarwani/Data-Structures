package graphs;

import java.util.LinkedList;


 

public class Graph {
    
    
    private final int V;
    private int E;
    private LinkedList<Integer>[] adj;
    private Type type;

    @SuppressWarnings("unchecked")
    public Graph(int v,Type type) {
        this.V = v;
        this.E = 0;
        this.type=type;
        adj = new LinkedList[this.V];
        for (int i = 0; i < this.V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public int V() {
        return this.V;
    }

    public int E() {
        return this.E;
    }

    public void validateVertex(int v) {
        if (v < 0 || v >= this.V) {
            throw new IllegalArgumentException("vertex is not valid");
        }

    }

    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w); 
        this.E++;
        adj[v].add(w);
        if(this.type==Type.undirected)
        adj[w].add(v); // in case of directed graph just remove this line
    }

    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vertices " + this.V + " Edges " + this.E);
        stringBuilder.append("\n");
        for (int v = 0; v < V; v++) {
            stringBuilder.append(v + ": ");
            for (int w : adj[v]) {
                stringBuilder.append(w + " ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
    public static void main(String args[]){
        Graph g=new  Graph(6,Type.undirected);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 5);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        System.out.println(g.toString());
    }

}
enum Type{
    directed,undirected
}