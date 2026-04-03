package LEETCODE;

public class LC_485_MAX_CONSECUTIVE_ONES {
    class Solution {
        public int findMaxConsecutiveOnes(int[] a) {
            int cs=a[0];
            int maxs=a[0];

            for(int i=1;i<a.length;i++){
                if(a[i]!=0){
                    cs=Math.max(a[i],cs+a[i]);
                    maxs=Math.max(maxs,cs);
                }else{
                    cs=0;
                    maxs=Math.max(maxs,cs);
                }
            }
            return maxs;
        }
    }
}
