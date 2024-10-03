public class Trie {

    private Node root;


    public Trie (){
        root = new Node();
    }


    public void insert(String s){
        Node current = root;
        for (int i = 0; i < s.length(); i++){
            int index  = s.charAt(i) - 'a';
            if (root.getNext()[index] == null){
                root.getNext()[index] = new Node();

            }
            current = current.getNext()[index];
        }
        current.setWord();
    }

    public boolean lookup(String s){




    }

    public void printTrie(){



    }







}
