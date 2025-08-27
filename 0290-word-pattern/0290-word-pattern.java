import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        Map<Character, String> CharToWord = new HashMap<>();
        Map<String, Character> WordToChar = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(CharToWord.containsKey(c)){
                if(!CharToWord.get(c).equals(w)){
                    return false;
                }
            }
            else{
            if(WordToChar.containsKey(w)){
                return false;
            }
            CharToWord.put(c,w);
            WordToChar.put(w,c);
            }
        }
        return true;
         

    }
}