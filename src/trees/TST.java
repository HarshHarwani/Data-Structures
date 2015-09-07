package trees;

// implementation  of Ternary Search Trees(Memory efficient implementation of tries)
public class TST<Value> {

    private Node<Value> root;
    private int N;

    private static class Node<Value> {
        private Node<Value> left, middle, right;
        private char c;
        private Value value;

    }

    public TST() {

    }

    public int size() {
        return N;
    }
}
