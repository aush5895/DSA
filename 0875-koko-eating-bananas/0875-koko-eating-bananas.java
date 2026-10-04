class Solution {

    public long eating(int[] piles, int x){
        long hours = 0;
        for(int pile: piles){
            hours += (pile + x - 1)/x;
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int ans = 0;
        for(int pile : piles){
            if(pile > end) end = pile;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(eating(piles, mid) <= h){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}