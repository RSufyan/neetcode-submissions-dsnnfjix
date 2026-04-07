class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map1 = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++){
        map1.put(nums[i],i);
    }

    for (int j = 0; j < nums.length; j++){
        int comp = target - nums[j];
        if(map1.containsKey(comp) && map1.get(comp)!= j){
            if(map1.get(comp)>j){
                return new int[]{j,map1.get(comp)};
            }
            else{
                return new int[]{map1.get(comp), j};
            }
            
        }
    }
    return new int[]{};
    }
}
