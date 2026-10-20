class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt = 0;
        int i = 1, j = 0;
        while(true){ 
            if( j < arr.length && i == arr[j] ){
                i++;
                j++;
            }
            else{
                cnt++;
                i++;
            }
            if(cnt == k) return i-1;
        }
    }
}