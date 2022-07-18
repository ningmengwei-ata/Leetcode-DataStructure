import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {

        Integer n = nums.length;
        int[] result = new int[2];
        //method 1:two loop
        for (Integer i = 0; i < n; i++) {
            for (Integer j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        //method 2 hashmap
            HashMap<Integer, Integer> Index = new HashMap<Integer, Integer>();

            for (Integer i = 0; i < nums.length; i++) {

                Integer targetKey=target-nums[i];
                    if (Index.containsKey(targetKey)) {
                        result[0] = i;
                        result[1] = Index.get(targetKey);
                    }
                Index.put(nums[i],i);

            }
            return result;
    }
}
