import ArraysAndHashing.ContainsDuplicate;
import ArraysAndHashing.IsAnagram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        IsAnagram isAnagram = new IsAnagram();
        int[] dups = {1,2,3,4};
        String s1 = "anagram";
        String s2 = "nagarmm";
        System.out.println(duplicate.duplicate(dups));
        System.out.println(isAnagram.isAnagram(s1, s2));


        }

}