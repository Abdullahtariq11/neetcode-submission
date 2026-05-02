class Solution {
    public int maxArea(int[] heights) {

      int l = 0;
      int r = heights.length - 1;
      int area = 0;

      while (l<r){
        int currentArea = Math.min(heights[l],heights[r])*(r-l);
        if(area < currentArea){
          area = currentArea;
        }
        if(heights[l]<heights[r]){
          l++;
        }
        else{
          r--;
        }

      }
      return area;
        
    }
}
