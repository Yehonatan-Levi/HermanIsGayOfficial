public class Missions {

    public interface StringManipulation {
        String manipulate(String stringManipulation);
    }

    public static StringManipulation toUpperCase = input -> input.toUpperCase();
    StringManipulation toLowerCase = input -> input.toLowerCase();


}
