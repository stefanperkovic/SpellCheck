public class NodeTST {

    private boolean isWord;
    private NodeTST left;
    private NodeTST middle;
    private NodeTST right;
    private char value;


    // Initializes node with a certain character value
    public NodeTST(char value){
        this.isWord = false;
        this.left = null;
        this.middle = null;
        this.right = null;
        this.value = value;
    }


    public boolean isWord() {
        return isWord;
    }

    public void setWord(){
        isWord = true;
    }

    public NodeTST getLeft() {
        return left;
    }

    public NodeTST getMiddle() {
        return middle;
    }

    public NodeTST getRight() {
        return right;
    }


    public void setLeft(NodeTST left) {
        this.left = left;
    }

    public void setMiddle(NodeTST middle) {
        this.middle = middle;
    }

    public void setRight(NodeTST right) {
        this.right = right;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}

