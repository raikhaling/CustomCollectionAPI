package Collections;

public class StringReversal {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}

