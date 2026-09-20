static void rotate (int[] nums, int k) {
        int n = nums.length - 1;
            reverse(nums, left:0, n);
            reverse(nums, left:0, k - 1);
            reverse(nums, k, n);
     }
