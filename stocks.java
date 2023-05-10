/*The best time to buy and sell stocks problem  involves finding the maximum profit that can be earned by buying and selling stocks at
 specific times. 
In Java, the problem can be solved by iterating through the prices of the stocks and keeping track of the minimum price seen so far and the 
maximum profit that can be earned by selling the stock at the current price. The algorithm works by first initializing the minimum price to be 
the first price in the array and the maximum profit to be zero. Then, for each subsequent price in the array, we calculate the profit that can be 
earned by selling at that price and update the maximum profit if it is greater than the current maximum profit. 
Finally, we return the maximum profit.
 The time complexity of this algorithm is O(n), where n is the length of the prices array.
*/
public class stocks {

    public static int profit(int a[]){
       int buyPrice = Integer.MAX_VALUE;
      int maxProfit = 0;
      

      for(int i= 0 ; i<a.length ; i++){
         if(buyPrice < a[i]){ //profit
//In this implementation, we iterate through the prices array and update the minimum price seen so far and the maximum profit that can be earned at each step.
            int profit = a[i] - buyPrice;  //today's profit
            maxProfit = Math.max(maxProfit,profit); //global profit
         }
         else{
            buyPrice = a[i];
         }

        }
        return maxProfit;


      }
    
    
    
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(profit(a));
    }
    
}
