import java.util.LinkedList;

public class Missions {

    public interface StringManipulation {
        String manipulate(String text);
    }

    static final StringManipulation toUpperCase = text -> text.toUpperCase();
    static final StringManipulation toLowerCase = text -> text.toLowerCase();

    public static void exStringManipulation(String text) {
        System.out.println(text);
        System.out.println(toLowerCase.manipulate(text));
        System.out.println(toUpperCase.manipulate(text));
    }

    public interface CheckString {
        char[] check(String text1, String text2);
    }

    static CheckString whoSmaller = (text1, text2) -> (text1.length() < text2.length()) ? text1.toCharArray() : text2.toCharArray();

    public static void exCheckString(String text1, String text2) {
        System.out.println(whoSmaller.check(text1, text2));
    }
}
