public class TrieTST {

    private NodeTST root;


    public TrieTST (){
        root = new NodeTST();
    }


    public void insert(String s){
        NodeTST current = root;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);


            if (current.getValue() == c){
                if (i + 1 < s.length()){
                    if(current.getMiddle() == null){
                        NodeTST next_node = new NodeTST(s.charAt(i + 1));
                        current.setMiddle(next_node);
                    }
                }

                current.setMiddle(new Node());


            }
            current = current.getNext()[index];
        }
        current.setWord();
    }

    public boolean lookup(String s){
        Node current = root;
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i);
            if (current.getNext()[index] == null){
                return false;

            }
            current = current.getNext()[index];

        }
        return current.isWord();
    }

    public void printTrie(){


    }
}
