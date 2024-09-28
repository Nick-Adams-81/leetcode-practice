package PrStuff;


import PrStuff.TwoPointer.ReverseString;
import PrStuff.TwoPointer.ValidPalindrome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        ValidPalindrome validPalindrome = new ValidPalindrome();

        System.out.println(validPalindrome.valid("A man, a plan, a canal: Panama!"));
        System.out.println(reverseString.reverse("hello world"));

    }
}
