public class TrieTST {

    private NodeTST root;


    public TrieTST (){
        root = null;
    }


    public void insert(String s){
        if (root == null){
            this.root = new NodeTST(s.charAt(0));
        }
        NodeTST current = root;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);


            if (current.getValue() == c){
                if (i + 1 < s.length()){
                    if(current.getMiddle() == null){
                        NodeTST next_node = new NodeTST(s.charAt(i + 1));
                        current.setMiddle(next_node);
                    }
                    current = current.getMiddle();
                }
                else{
                    current.setWord();
                    return;
                }
            }
            else if(c < current.getValue()){
                if (current.getLeft() == null){
                    current.setLeft(new NodeTST(c));
                }
                current = current.getLeft();
            }
            else {
                if (current.getRight() == null){
                    current.setRight(new NodeTST(c));
                }
                current = current.getRight();
            }

        }
        current.setWord();
    }

    public boolean lookup(String s){
        NodeTST current = root;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            while (current != null){
                if (c < current.getValue()){
                    current = current.getLeft();
                }
                else if (c > current.getValue()) {
                    current = current.getRight();
                }
                else{
                    if (i + 1 == s.length()){
                        return current.isWord();
                    }
                    current = current.getMiddle();
                    break;
                }

            }
            if (current == null){
                return false;

            }

        }
        return false;
    }

    public void printTrie(){


    }
}
