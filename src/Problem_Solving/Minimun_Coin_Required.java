package Problem_Solving;
import java.util.*;
public class Minimun_Coin_Required {
    public static int minCoin(int[] coins, int amount){
        int[] dp = new int[amount + 1];

        Arrays.fill(dp,amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins){

                if (coin <= i){
                    dp[i] = Math.min(dp[i],dp[i-coin] + 1);
                }
            }
        }

        if (dp[amount] == amount +1){
            return -1;
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int answer = minCoin(coins, amount);

        System.out.println("Minimum coins = " + answer);
    }
}
