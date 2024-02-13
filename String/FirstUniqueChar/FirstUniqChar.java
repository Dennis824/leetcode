package String.FirstUniqueChar;

import java.util.LinkedHashMap;
import java.util.Map;

class FirstUniqChar {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) +1 );
            } else{
                map.put(s.charAt(i), 1);
            }
        }
        for(Character key: map.keySet()){
            if(map.get(key) == 1){
                return s.indexOf(key);
            }
        }

        return -1;
    }
}

/*
387
TC O(n)
SC O(k) k - number of keys
 */