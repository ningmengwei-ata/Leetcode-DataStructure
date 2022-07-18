import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        //method1 hashset
//        Set<Integer> numSet=new HashSet();
//        for (Integer i :nums){
//            numSet.add(i);
//        }
//        return numSet.size() < nums.length;
        //method2 array sort
        Arrays.sort(nums);
        for (Integer i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
