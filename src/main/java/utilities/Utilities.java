package utilities;

public class Utilities {
    public static void equalStings(String f, String s){
        if (!f.equals(s)){
            throw new AssertionError("String: '" + f + "' != string: '" + s + "'");
        }
    }
}
