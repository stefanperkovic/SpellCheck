public class Node {

    private boolean isWord;
    private Node[] next;

    public Node(){
        this.isWord = false;
        this.next = new Node[26];
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(){
        isWord = true;
    }

    public Node[] getNext(){
        return this.next;
    }

}
