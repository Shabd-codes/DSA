class Solution {
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        String c = new StringBuilder(s).reverse().toString();
        if (s.equals(c)){
            return true;
        }
        else{
            return false;
        }

    }
}