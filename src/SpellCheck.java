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
        HashMap<String, Boolean> checker = new HashMap<>();
        for (int i = 0; i < dictionary.length; i++){
            checker.put(dictionary[i], true);
        }

        HashMap<String, Boolean> other_words = new HashMap<>();
        ArrayList<String> order = new ArrayList<>();

        for (int i = 0; i< text.length; i++){
            if (!checker.containsKey(text[i])){
                if (!other_words.containsKey(text[i])){
                    order.add(text[i]);
                    other_words.put(text[i], true);

                }

            }
        }

        String[] output = new String[order.size()];
        for(int i = 0; i < order.size(); i++){
            output[i] = order.get(i);

        }


        return output;
    }
}
