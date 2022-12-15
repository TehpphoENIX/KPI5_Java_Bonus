package Task;

import java.util.HashMap;

public final class LinkedSequence {
    private Node root;
    public LinkedSequence(final String image){
        char[] charArray = image.toCharArray();

        Node pointer = null;
        HashMap<Character,Node> allNodes = new HashMap<>();
        for (char c :
                charArray) {
            //node acquisition
            Node buffer;
            if(allNodes.containsKey(c))
            {
                buffer = allNodes.get(c);
            }else{
                buffer = new Node(c);
                allNodes.put(c,buffer);
            }
            //tree construction
            if(pointer == null){
                root = buffer;
                pointer = root;
            }else{
                pointer.next = buffer;
                pointer = pointer.next;
            }
        }
    }

    public static class Iterator{
        private Node pointer;
        public Iterator(Node node){pointer = node;}
        public char get(){return pointer.get();}
        public boolean compare(final Iterator iterator){return iterator.get() == this.get();}
        public void iterate(final int numberOfJumps){
            int n = numberOfJumps;
            if(n<1){
                n=1;
            }
            for (int i = 0; i < n; i++) {
                pointer = pointer.next;
            }
        }
        public boolean empty() {return pointer == null;}
    }
    public Iterator getIterator(){return new Iterator(root);}
}
