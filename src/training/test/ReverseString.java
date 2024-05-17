package training.test;

public class ReverseString {

    public static <Char> void main(String[] args) {

        String s = "Sandeep";

        // Char[] array = s.chars();
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }


        String str = "Geeks", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);




    }
}
