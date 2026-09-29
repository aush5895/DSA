class Solution {

    long divide(int[] nums, int divisor){

        long sum = 0;

        for(int num : nums){
            sum += (num + divisor - 1) / divisor;
        }

        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold){

        int start = 1;
        int end = 0;

        for(int num : nums){
            end = Math.max(end, num);
        }

        int ans = end;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(divide(nums, mid) <= threshold){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ans;
    }
}