package DSA;

public class srtSrt {
        public int strStr(String haystack, String needle) {

            char[] n = needle.toCharArray();
            char[] h = haystack.toCharArray();

            for (int i = 0; i < haystack.length(); i++) {

                if (h[i] == n[0]) {

                    int e = i + n.length;

                    if (e <= haystack.length()) {
                        if (haystack.substring(i, e).equals(needle)) {
                            return i;
                        }
                    }
                }
            }

            return -1;
        }
}
