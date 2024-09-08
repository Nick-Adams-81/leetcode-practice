package Strings;

public class IndexOfFirstOccurance {

    public int needleInHaystack(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(haystack.length() <= needle.length()) return -1;
        for(int i = 0; i < haystack.length() - needle.length(); i++) {
            if(haystack.startsWith(needle, i)) return i;
        }
        return -1;
    }
}
