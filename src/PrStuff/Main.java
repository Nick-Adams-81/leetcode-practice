package PrStuff;

import PrStuff.TwoPointer.OppositePointers.ReverseAString;
import PrStuff.TwoPointer.OppositePointers.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        ValidPalindrome validPalindrome = new ValidPalindrome();

        System.out.println(reverseAString.reverse("hello world"));
        System.out.println(validPalindrome.validPalindrome("A man, a plan, a canal: Panama!"));
    }
}
