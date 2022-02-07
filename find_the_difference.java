//adding the string value using ASCII number and finding the character by taking the difference of those two sums
class Solution {
    public int stringSum (String str){
        int sum = 0;
        for(int i = 0; i< str.length(); i++)
            sum += (int) str.charAt(i);
        return sum;
    }
    public char findTheDifference(String s, String t) {
        return (char) (stringSum(t) - stringSum(s));
    }
}

//another approach of solving is by using BITWISE method where two similer character got cancelled and left out with the single unique character
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}
