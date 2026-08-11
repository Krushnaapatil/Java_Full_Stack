package DSA;

import java.util.HashMap;

public class areOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        char[] cArray = s.toCharArray();

        for(char ch : cArray){
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
        int check = h.get(cArray[0]);
        for(char ch : cArray){
            if (h.get(ch) != check){
                return false;
            }
        }

        return true;
    }
}
