class twosum {
    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(input, target);
        for (int i : result) {
            System.out.print(i);
        }
        
        //test 2 
        System.out.println("\ntest 2");
        int[] input2 = new int[]{3,2,4};
        int target2 = 6;
        int[] result2 = twoSum(input2, target2);
        for (int i : result2) {
            System.out.print(i);
        }
       
        //test 3 

        System.out.println("\ntest 3"); 
        int[] input3 = new int[]{3,3};
        int target3 = 6;
        int[] result3 = twoSum(input3, target3);
        for (int i : result3) {
            System.out.print(i);
        }
  
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0;i < nums.length; i++) {   
            for(int y = i+1; y < nums.length;y++) {
                if(nums[i] + nums[y] == target) {
                    return new int[]{nums[i], nums[y]};
                }        
            } 
        }
        return new int[]{};
    }
}
