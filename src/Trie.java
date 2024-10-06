public class Trie {

    private Node root;


    public Trie (){
        root = new Node();
    }


    public void insert(String s){
        Node current = root;
        for (int i = 0; i < s.length(); i++){
            int index  = s.charAt(i);
            if (current.getNext()[index] == null){
                current.getNext()[index] = new Node();

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
