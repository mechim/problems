class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                sol[0] = map.get(diff);
                sol[1] = i;
            } else{
                map.put(nums[i], i);
            }
        }
        return sol;
    }
}
