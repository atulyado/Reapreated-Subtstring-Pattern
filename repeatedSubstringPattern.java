class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        String trim = ss.substring(1,ss.length() -1);
        return trim.contains(s);
    }
}