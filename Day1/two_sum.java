class Solution {
    public void moveZeroes(int[] nums) {
       int a;
       a=nums.length;
        int b;
        for(int i=0;i<a;i++)
        {
            if(nums[i]==0)
            {
                b=nums[i];
                nums[i]=nums[a-1];
                nums[a-1]=b;
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(nums[i]);
        }
        
    }
}