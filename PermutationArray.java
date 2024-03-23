package DSA;
import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    public void helper(List<List<Integer>> ans,List<integer> ds,boolean[] isValid,int[] nums){
    for(int i=0;i<nums.length;i++){
        if(isValid[i]==false);
        {
            ds.add(nums[i]);
            isValid[i]=true;
            helper(nums,ds,isValid,ans);
            isValid[i]=false;
            ds.remove(ds.size()-1);
            return;
        }
        }
    }
   public List<List<Integer>> permute(int [] nums){

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();
    boolean [] isValid = new boolean[nums.length];
    helper(nums,ds,isValid,ans);
    return ans;

   }
}
  
