import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class God {
    private Map<Integer, String> dictionary = new HashMap<>();
    public static final int NUMBEROFWORD = 52;
    public God() {
        dictionary.put(1, "a");
        dictionary.put(2, "b");
        dictionary.put(3, "c");
        dictionary.put(4, "d");
        dictionary.put(5, "e");
        dictionary.put(6, "f");
        dictionary.put(7, "g");
        dictionary.put(8, "h");
        dictionary.put(9, "i");
        dictionary.put(10, "j");
        dictionary.put(11, "k");
        dictionary.put(12, "l");
        dictionary.put(13, "m");
        dictionary.put(14, "n");
        dictionary.put(15, "o");
        dictionary.put(16, "p");
        dictionary.put(17, "q");
        dictionary.put(18, "r");
        dictionary.put(19, "s");
        dictionary.put(20, "t");
        dictionary.put(21, "u");
        dictionary.put(22, "v");
        dictionary.put(23, "w");
        dictionary.put(24, "x");
        dictionary.put(25, "y");
        dictionary.put(0, "z");
        dictionary.put(26, "aa");
        dictionary.put(27, "ab");
        dictionary.put(28, "ac");
        dictionary.put(29, "ad");
        dictionary.put(30, "ae");
        dictionary.put(31, "af");
        dictionary.put(32, "ag");
        dictionary.put(33, "ah");
        dictionary.put(34, "ai");
        dictionary.put(35, "aj");
        dictionary.put(36, "ak");
        dictionary.put(37, "al");
        dictionary.put(38, "am");
        dictionary.put(39, "an");
        dictionary.put(40, "ao");
        dictionary.put(41, "ap");
        dictionary.put(42, "aq");
        dictionary.put(43, "ar");
        dictionary.put(44, "as");
        dictionary.put(45, "at");
        dictionary.put(46, "au");
        dictionary.put(47, "av");
        dictionary.put(48, "aw");
        dictionary.put(49, "ax");
        dictionary.put(50, "ay");
        dictionary.put(51, "az");
    }
    public String generateSpecialWord() {
        Random random = new Random();
        int number = random.nextInt(NUMBEROFWORD);
        if(dictionary.containsKey(number)) {
            return dictionary.get(number);
        }
        return "0";
    }
}
