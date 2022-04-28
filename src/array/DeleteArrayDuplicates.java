package array;

/**
 * 使用双指针方式
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

    public static void main(String[] args) {
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
