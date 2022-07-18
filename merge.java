import java.util.Arrays;

public class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (Integer i=m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
//      System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);

        //method2
        int[] nums1Copy=new int[nums1.length];
        System.arraycopy(nums1,0,nums1Copy,0,nums1.length);
        Integer i=0,j=0;
        while(i<m &&j<n){
            if(nums1Copy[i]>=nums2[j]){
                nums1[i]=nums1Copy[i];
            }else{
                nums1[i]=nums2[j];
            }
        }
    }
}
