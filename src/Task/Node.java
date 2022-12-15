package Task;

final class Node {
    private final Character contents;
    public Node next = null;
    public Node(char contents) {this.contents = contents;}
    public char get(){return contents;}
}
