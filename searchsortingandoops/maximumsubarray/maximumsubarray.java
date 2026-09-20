
    public int maxsubarray(int[] nums) {
        int currSum = 0; int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxsum = Math.max(currSum, maxSum);
        
        }

        return maxSum;
    }
