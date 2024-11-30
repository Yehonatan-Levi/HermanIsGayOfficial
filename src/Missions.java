public class Missions {
    public static void ex1() {
        String[] array = new String[5];
        array[0] = "Herman";
        array[1] = "is";
        array[2] = "super";
        array[3] = "mega";
        array[4] = "gay";

        String output = "";
        for (String s : array) {
            output += s;
        }
        System.out.println(output);

        output = "";
        for (int i = 4; i >= 0; i--) {
            output += array[i];
        }
        System.out.println(output);
    }
}
