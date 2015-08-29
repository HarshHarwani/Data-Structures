package graphs;

import java.util.Stack;

public class ProperDFS {

    private final int source;
    private boolean[] marked;
    private int[] edgeTo;

    public ProperDFS(Graph G, int s) {
        this.source = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        dfs(G, source);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(g, w);
            }
        }

    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> Path(int v) {
        if (!hasPathTo(v))
            return null;
        Stack<Integer> stack = new Stack<>();
        for (int x = v; x != this.source; x = edgeTo[x]) {
            stack.push(x);
        }
        stack.push(this.source);
        return stack;
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
        ProperDFS properDFS = new ProperDFS(g, 0);
        for (int v = 0; v < g.V(); v++) {
            if (properDFS.hasPathTo(v)) {
                System.out.println("0" + "to" + v + ":");
                for (int x : properDFS.Path(v)) {
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
