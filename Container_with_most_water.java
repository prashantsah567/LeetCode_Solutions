class Solution {
    public int maxArea(int[] height) {
        int area, newArea = 0, left =0, right = height.length-1, h;
        while(left < right){
            if(height[left] < height[right])
                h = height[left];
            else
                h = height[right];
        
        area = h * (right - left);
            if(newArea < area)
                newArea = area;
            
        if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return newArea;
    }
}
