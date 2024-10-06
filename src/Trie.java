public class Trie {

    private Node root;


    public Trie (){
        root = new Node();
    }

    // Method to insert string into Trie
    public void insert(String s){
        Node current = root;
        // Goes through each character
        for (int i = 0; i < s.length(); i++){
            int index  = s.charAt(i);
            // Create new node if one doesn't exist
            if (current.getNext()[index] == null){
                current.getNext()[index] = new Node();

            }
            current = current.getNext()[index];
        }
        // Mark the last node as a word
        current.setWord();
    }

    // Method to lookup a string in the trie
    public boolean lookup(String s){
        Node current = root;
        // Traverse through each character
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i);
            // If node is null word doesn't exist
            if (current.getNext()[index] == null){
                return false;

            }
            current = current.getNext()[index];
        }
        // Returns true if the last node is a word
        return current.isWord();
    }


}
