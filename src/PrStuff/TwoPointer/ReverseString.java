package PrStuff.TwoPointer;

public class ReverseString {

    // This is an opposite pointer method
    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

}
