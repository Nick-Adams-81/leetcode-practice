package BST;

public class FirstBadCommit {

    // given n = 5, and version = 4 is the first bad commit, every commit after is also a bad commit.
    // isBad(3) -> false;
    // isBad(5) -> true;
    // isBad(4) -> true;
    // n is the total number of commits
    // n is an int, version is an int, and we are given a sorted int[] commits
    // there's an external API defined in a parent class VersionControl which
    // returns a boolean value.
    private boolean isBadVersion(int version) {
        return true;
    };
    public int isBad(int n) {
        int left = 1; int right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return left;
    }


 }
