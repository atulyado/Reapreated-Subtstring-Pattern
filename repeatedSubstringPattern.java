class Solution {
    public boolean repeatedSubstringPattern(String s) { // abab
        String ss = s + s;// this makes it double example abab to abababab
        String trim = ss.substring(1,ss.length() -1);// remove the first and last character to bababa
        return trim.contains(s); //check if bababa have abab the original inside it 
    }
}
