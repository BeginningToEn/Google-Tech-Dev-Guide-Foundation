import java.util.Iterator;

/**
 * Former Coding Interview Question: Find longest word in dictionary that is a subsequence of a given string
 */

public class LongestWordFinder {

    //doesn't work with empty strings
    private static boolean is_subsequence(String parent, String child){
        CharacterIterator childIt = new CharacterIterator(child);
        CharacterIterator parentIt = new CharacterIterator(parent);

        while (true) {

            if (childIt.getCurrent() == parentIt.getCurrent()) {
                if ( !childIt.hasNext() ) {
                    return true;
                }
                else {
                    if (!parentIt.hasNext()) return false;
                    childIt.goNext();
                    parentIt.goNext();
                }
            } else {
                if (!parentIt.hasNext()) return false;
                parentIt.goNext();
            }
        }
    }

    public String run (String parent_string, Iterable<String> set_of_words) {
        String output = "";
        int longest_length = 0;

        for (String it : set_of_words) {
            if (it.length() > longest_length && is_subsequence(parent_string, it)){
                longest_length = it.length();
                output = it;
            }
        }

        return output;
    }
}

class CharacterIterator {

    private final String str;
    private int pos = 0;

    public CharacterIterator(String str) {
        this.str = str;
    }

    public boolean hasNext() {
        return pos < str.length() - 1;
    }

    public void goNext() {
        pos++;
    }

    public Character getCurrent(){
        return str.charAt(pos);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}