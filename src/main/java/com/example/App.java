package com.example;

public class App {

public boolean isPalindrome(String text) {
    if (text == null) {
        throw new IllegalArgumentException("Text must not be null");
    }

    String str = text.toLowerCase();
    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        reversed += str.charAt(i);
    }

    return str.equals(reversed);
}

public static void main(String[] args) {
    App obj = new App();

    String text = "madam";

    System.out.println("String: " + text);

    if (obj.isPalindrome(text)) {
        System.out.println("The string is a Palindrome");
    } else {
        System.out.println("The string is not a Palindrome");
    }
}

}