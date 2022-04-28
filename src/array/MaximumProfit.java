package array;

import org.junit.Test;

/**
 * 一星期买彩票最大利润：给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 *
 *
 * 解决：当第二天大一前一天时直接计算，小时直接跳过，得出最大值
 */

public class MaximumProfit {
    public int maxProfit(int[] profit){
        int p=0;
        for (int i=1;i<profit.length;i++){
            if (profit[i]>profit[i-1]){
                p+=profit[i]-profit[i-1];
            }
        }
        return p;
    }
    //测试
    @Test
    public void Test(){
        int p=maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(p);
    }
}
