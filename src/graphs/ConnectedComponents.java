package graphs;

public class ConnectedComponents {

    private int[] id;
    private int[] size;
    private boolean[] marked;
    private int count;

    public ConnectedComponents(Graph g) {
        marked = new boolean[g.V()];
        id = new int[g.V()];
        size = new int[g.V()];
        for (int x = 0; x < g.V(); x++) {
            if (!marked[x]) {
                dfs(g, x);
                count++;
            }
        }

    }

    private void dfs(Graph g, int x) {
        marked[x] = true;
        id[x] = count;
        size[count]++;
        for (int w : g.adj(x)) {
            if (!marked[w]) {
                dfs(g, w);
            }
        }

    }

    public boolean isConnected(int v, int w) {
        return id(v) == id(w);
    }

    public int id(int v) {
        return id[v];
    }

    public int size(int v) {
        return size[id[v]];
    }

    public int count() {
        return count;
    }

    public static void main(String args[]) {
        Graph g = new Graph(6, Type.undirected);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 5);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        ConnectedComponents components = new ConnectedComponents(g);
        System.out.println(components.count());
        System.out.println(components.isConnected(2, 3));
    }

}
