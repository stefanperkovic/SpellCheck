public class TrieTST {

    private NodeTST root;

    public TrieTST (){
        root = null;
    }

    // Method to insert string into Trie
    public void insert(String s){

        if (root == null){
            this.root = new NodeTST(s.charAt(0));
        }
        NodeTST current = root;

        // Loop through each character of the string to insert
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (current.getValue() == c){
                // Continues if character is not the last in string
                if (i + 1 < s.length()){
                    // Sets character to middle if null
                    if(current.getMiddle() == null){
                        NodeTST next_node = new NodeTST(s.charAt(i + 1));
                        current.setMiddle(next_node);
                    }
                    current = current.getMiddle();
                }
                // Exits if at end of string
                else{
                    current.setWord();
                    return;
                }
            }
            // Goes to the left of current node
            else if(c < current.getValue()){
                if (current.getLeft() == null){
                    current.setLeft(new NodeTST(c));
                }
                current = current.getLeft();
                // Processes same character again
                i--;
            }
            // Goes to the right of current node
            else {
                if (current.getRight() == null){
                    current.setRight(new NodeTST(c));
                }
                current = current.getRight();
                // Processes same character again
                i--;
            }

        }
        current.setWord();
    }

    // Method to lookup word in the Trie
    public boolean lookup(String s){
        NodeTST current = root;
        // Goes through each character of string
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            // Traverse tree while there are nodes to check
            while (current != null){
                // Go left
                if (c < current.getValue()){
                    current = current.getLeft();
                }
                // Go right
                else if (c > current.getValue()) {
                    current = current.getRight();
                }
                // Character matches
                else{
                    // Check if words complete
                    if (i + 1 == s.length()){
                        return current.isWord();
                    }
                    current = current.getMiddle();
                    break;
                }

            }
            // Word not found
            if (current == null){
                return false;

            }

        }
        return false;
    }
}
