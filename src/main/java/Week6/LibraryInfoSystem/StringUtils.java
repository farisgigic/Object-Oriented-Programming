package Week6.LibraryInfoSystem;

public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word.isEmpty() || word.isBlank() || searched.isEmpty() || searched.isBlank()) { //isEmpty()->AKO JE length = 0; isBlank()->AKO SAMO IMA SPACEOVE "   "
            return false;
        }
        if (word.toLowerCase().trim().contains(searched.toLowerCase().trim())) {
            return true;
        }
        return false;
    }
}