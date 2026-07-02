class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;

        for(int i=0;i<piles.length;i++){
            right= Math.max(piles[i],right);
        }

        while(left<right){
            int mid= left+ (right-left)/2;
            if(canEat(h,mid,piles)){
                right = mid;
            }
            else{
                left=mid+1;
            }
        }

        return left;

    }

    public boolean canEat(int h, int r, int[] piles){
        int hoursNeeded=0;
        for(int p: piles){
            hoursNeeded += (p+r-1)/r;
        }
        return hoursNeeded<=h;
    }
}
