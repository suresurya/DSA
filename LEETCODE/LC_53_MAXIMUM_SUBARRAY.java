package LEETCODE;

public class LC_53_MAXIMUM_SUBARRAY {
    class Solution {
        public int maxSubArray(int[] a) {
            if(a==null ) return 0;
            if(a.length<=1) return a[0];

            int cs=a[0];
            int maxs=a[0];
            for(int i=1;i<a.length;i++){
                cs=Math.max(a[i],cs+a[i]);
                maxs=Math.max(cs,maxs);
            }
            return maxs;
        }
    }

}
