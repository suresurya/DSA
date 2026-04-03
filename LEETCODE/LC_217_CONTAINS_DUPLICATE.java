package LEETCODE;

public class LC_217_CONTAINS_DUPLICATE {


    class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums==null) return false;
            if(nums.length<=1) return false;

            HashSet<Integer> map=new HashSet<>();

            for(int n:nums){
                if(!map.add(n)){
                    return true;
                }
            }
            return false;
        }
    }


}
