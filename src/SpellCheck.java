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
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {

        Trie dic_trie = new Trie();
        for (int i = 0; i < dictionary.length; i++){
            dic_trie.insert(dictionary[i]);
        }

        Trie misspelled_words = new Trie();

        for (int i = 0; i < text.length; i++){
            if (!misspelled_words.lookup(text[i]) && !dic_trie.lookup(text[i])){

                misspelled_words.insert(text[i]);

            }

        }



    }







}
