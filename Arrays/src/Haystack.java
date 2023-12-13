public class Haystack {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if (needle.equals(haystack.substring(i, i + needleLength))) {
                return i;
            }
        }
        return -1;
    }
}
