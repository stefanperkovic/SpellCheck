import java.util.ArrayList;
import java.util.HashMap;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Stefan Perkovic
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all misspelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {

        TrieTST dic_trie = new TrieTST();
        // Insert each word from the dictionary into the Trie
        for (int i = 0; i < dictionary.length; i++){
            dic_trie.insert(dictionary[i]);
        }

        // Create a Trie to store misspelled words found in the text
        TrieTST misspelled_words = new TrieTST();
        ArrayList<String> words = new ArrayList<String>();

        // Loop through each word in the text
        for (int i = 0; i < text.length; i++){

            // Checks if the word is not in the dictionary
            if (!dic_trie.lookup(text[i])){
                // Adds word if it hasn't been previously added
                if (!misspelled_words.lookup(text[i])){
                    misspelled_words.insert(text[i]);
                    words.add(text[i]);
                }

            }
        }
        // Convert the ArrayList of misspelled words to an array and return it
        return words.toArray(new String[words.size()]);

    }






}
