class Solution {

    public boolean Bloomed(int[] bloomday, int mid, int m, int k){
        int consecutive = 0;
        int bouque = 0;
        for(int bloom : bloomday){
            if(bloom <= mid){
                consecutive++;
                if(consecutive == k){
                    bouque++;
                    consecutive = 0;
                }
            } else {
                consecutive = 0;
            }
        }
        return bouque >= m;
    }

    public int minDays(int[] bloomday, int m, int k) {
        int start = bloomday[0], end = bloomday[0];
        int ans = -1;
        for(int bloom : bloomday){
            if(bloom >= end){
                end = bloom;
            }
            if(bloom <= start){
                start = bloom;
            }
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(Bloomed(bloomday, mid, m, k)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}