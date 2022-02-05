class Solution {
    public boolean isPalindrome(int x) {
        int temp =x;
        int temp1 =0;
        int reverse =0;    
        boolean flag = false;
        while(temp > 0){
            temp1 = temp%10;
            reverse = reverse * 10 + temp1;
            temp /= 10;
        }
        if(reverse == x)
            flag = true;
        return flag;
    }
}
