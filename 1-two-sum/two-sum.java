class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = optamized(nums, target);
        return res;
    }

    public int[] optamized(int[] nums, int target){
        Map<Integer, Integer> m = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int sec = target - nums[i];
            if(m.containsKey(sec)){
                res[0] = m.get(sec);
                res[1] = i;
            }
            m.put(nums[i], i);
        }

        return res;

    }
}