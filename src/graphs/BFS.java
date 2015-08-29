package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    private int source;
    private int[] distTo;
    private int[] edgeTo;
    private boolean[] marked;

    public BFS(Graph g, int s) {
        this.source = s;
        distTo = new int[g.V()];
        edgeTo = new int[g.V()];
        marked = new boolean[g.V()];
        bfs(g, s);
    }

    private void bfs(Graph g, int s) {
        g.validateVertex(s);
        marked[s] = true;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < g.V(); i++) {
            distTo[i] = Integer.MAX_VALUE;
        }
        queue.add(s);
        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (int x : g.adj(v)) {
                if (!marked[x]) {
                    distTo[x] = distTo[v] + 1;
                    edgeTo[x] = v;
                    marked[x] = true;
                    queue.add(x);
                }
            }
        }

    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public int distTo(int v) {
        return distTo[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v))
            return null;
        Stack<Integer> path = new Stack<Integer>();
        int x;
        for (x = v; x!=source; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(x);
        return path;
    }
    
    public static void main(String args[]) {
        Graph g = new Graph(6,Type.undirected);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 5);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        BFS bfs=new BFS(g, 0);
        for (int v = 0; v < g.V(); v++) {
            if (bfs.hasPathTo(v)) {
                System.out.println("0" + "to" + v + ":");
                for (int x : bfs.pathTo(v)) {
                    if (x == 0)
                        System.out.print("-0");
                    else
                        System.out.print("- " + x);
                }
                System.out.println("\n");
            } else {
                System.out.println("Not connected");
            }
        }
    }

}
