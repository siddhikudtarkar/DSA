package DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationArraylist {
      public static void helper(int[] nums,List<List<Integer>> ans , int idx ){
        int n= nums.length;
        if(idx==n-1){
            List<Integer> ll = new ArrayList<>();
            for(int i:nums){
                ll.add(nums[i]);
            }
            ans.add(ll);
            return;
        }

        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            helper(nums,ans,idx+1);
            swap(i,idx,nums);

        }
    }

        public static void swap(int i,int j, int[] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
       
        public List<List<Integer>> permute(int[] nums){
            List<List<Integer>> ans = new ArrayList<>();
            helper(nums,ans,0);
            return ans;
    
        
      }
}

