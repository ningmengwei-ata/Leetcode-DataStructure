import sun.security.util.ArrayUtil;

import java.util.*;

public class interset {
    public int[] intersect(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
         Arrays.sort(nums2);
         int[] result=new int[Math.min(nums1.length,nums2.length)];
         int index1=0,index2=0,index=0;
         while(index1<nums1.length&&index2<nums2.length){
             if(nums1[index1]<nums2[index2]){
                 index1++;
             }
             else if(nums2[index2]<nums1[index1]){
                 index2++;
             }
             else{
                 result[index]=nums1[index1];
                 index1++;
                 index2++;
                 index++;
             }
         }

        return Arrays.copyOfRange(result,0,index);
    }
}
