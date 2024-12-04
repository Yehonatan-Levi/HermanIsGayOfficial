public class Missions {

    public interface StringManipulation {
        String manipulate(String text);
    }

    StringManipulation toUpperCase = text -> text.toUpperCase();
    StringManipulation toLowerCase = text -> text.toLowerCase();

    public static void exStringManipulation(String text) {
        System.out.println(text);
        System.out.println(new Missions().toLowerCase.manipulate(text));
        System.out.println(new Missions().toUpperCase.manipulate(text));
    }

    public interface CheckString {
        char[] check(String text1, String text2);
    }

    CheckString whoSmaller = (text1, text2) -> {return (text1.length() < text2.length()) ? text1.toCharArray(): text2.toCharArray();};

}
