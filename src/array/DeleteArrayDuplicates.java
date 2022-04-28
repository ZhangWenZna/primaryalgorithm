package array;

import org.junit.Test;

/**
 * 删除排序数组中的重复项：给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
 * 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。由于在某些语言中不能改变数组的长度，
 * 所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *
 * 解决：使用双指针方式
 * i和j来比较，i，j从相同位置开始，相同时通过j++，不同时j位置把i位置覆盖，节约来空间复杂度
 */

public class DeleteArrayDuplicates {
    public int removeDuplicates(int[] nums){
        //当nums长度为0是返回0；
        if (nums.length==0) return 0;
        int i=1;
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    //测试
    @Test
    public void Test() {
        DeleteArrayDuplicates deleteArrayDuplicates=new DeleteArrayDuplicates();
        int[] nums=new int[]{1,1,2,2,3};
        int k=deleteArrayDuplicates.removeDuplicates(nums);
        int[] expectedNums=new int[k];
        for (int i=0;i<k;i++){
            expectedNums[i]=nums[i];
        }
        for (int i=0;i<expectedNums.length;i++){
            System.out.print(expectedNums[i]);
        }
    }
}