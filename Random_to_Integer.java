class Solution {
    public int romanToInt(String s) {
        int sum =0, value =0, pre =0;
        s = s.toLowerCase();
        for(int j = s.length()-1; j >= 0; j--){
            switch (s.charAt(j)){
                case 'i': value = 1; break;
                case 'v': value = 5; break;
                case 'x': value = 10; break;
                case 'l': value = 50; break;
                case 'c': value = 100; break;
                case 'd': value = 500; break;
                case 'm': value = 1000; break;
            }
            if (value < pre)
                sum -= value;
            else 
                sum += value;
            pre = value;
        }
        return sum;
    }
}
