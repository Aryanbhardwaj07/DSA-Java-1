//https://leetcode.com/problems/richest-customer-wealth/
package Arrays;

import java.util.Arrays;

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            // return sum;
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }

}
