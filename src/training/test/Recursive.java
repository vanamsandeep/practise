package training.test;

public class Recursive {

    public static void main(String[] args) {

        System.out.println(addDollarSymbol("Sandeep"));

    }

    public static String addDollarSymbol(String name) {
        String result = "";
        if (name.length() <= 1) {
            return name;
        }
        result += name.charAt(0) + "$" + addDollarSymbol(name.substring(1));
        return result;
    }
}
