public class LC121 {

    public static int maxProfit(int[] prices) {

        int leastSoFar = Integer.MAX_VALUE;
        int maxProfitSoFar = 0;

        for(int i: prices){

            if(i < leastSoFar){
                leastSoFar = i;
            }
            if((i-leastSoFar)>maxProfitSoFar){
                maxProfitSoFar = i - leastSoFar;
            }
        }

        return maxProfitSoFar;
    }


    public static void main(String [] args){
        int [] values = {7,1,5,3,6,4};
        System.out.println(maxProfit(values));
    }

}
