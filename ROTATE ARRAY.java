int maxProfit(int* prices, int pricesSize){
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
