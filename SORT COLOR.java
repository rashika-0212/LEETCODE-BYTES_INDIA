class Solution {
    public void sortColors(int[] nums) {
        if (nums.length==1){
            return;
        }
        int j=0,k=nums.length-1;
        for(int i=0;i<nums.length;){
            if(nums[i]==0){
                swap(nums,i,j);
                j++;
                i++;   
             }
             else if(nums[i]==2&&i<k){
                 swap(nums,i,k);
                 k--;
             }
             else{
                 i++;
             }
                
            }
        }
        private void swap(int[] nums,int i,int j){int maxProfit(int* prices, int pricesSize){
    int maxProfit=0;
    int minprice=prices[0];
    for(int i =0;i<pricesSize;i++){
        if(prices[i]<=minprice){
            minprice=prices[i];
        }
        if(prices[i]-minprice>maxProfit){
            maxProfit=prices[i]-minprice;
        }int maxProfit(int* prices, int pricesSize){
    int maxProfit=0;
    int minprice=prices[0];
    for(int i =0;i<pricesSize;i++){
        if(prices[i]<=minprice){
            minprice=prices[i];
        }
        if(prices[i]-minprice>maxProfit){
            maxProfit=prices[i]-minprice;
        }
    }
    return maxProfit;

  }
