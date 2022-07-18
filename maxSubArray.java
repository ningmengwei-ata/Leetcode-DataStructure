import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        Integer max=nums[0];
        Integer sum=nums[0];
        //method one
        for (Integer i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(sum,max);
        }
        //method two
        for(Integer i=1;i<nums.length;i++){
            if(sum>0){
                sum=sum+nums[i];
            }
            else {
                sum = nums[i];
            }
            max=Math.max(sum,max);
        }
        //method three
        List<Integer> sumList = new ArrayList();
        sumList.add(nums[0]);
        for (Integer i=1;i<nums.length;i++){
            if(sumList.get(i-1)>0) {
                Integer newItem=nums[i]+sumList.get(i-1);
                sumList.add(newItem);
            }
            else{
                sumList.add(nums[i]);
            }
        }
        max= Collections.max(sumList);

        return max;
    }
}
