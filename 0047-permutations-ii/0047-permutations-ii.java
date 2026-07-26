class Solution {
    public void  backtrack(List<List<Integer>> ar,ArrayList<Integer> templist,int[] nums,boolean[] used){
        if(templist.size()==nums.length && !ar.contains(templist)){
            ar.add(new ArrayList<>(templist));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            used[i]=true;
            templist.add(nums[i]);
            backtrack(ar,templist,nums,used);
            used[i]=false;
            templist.remove(templist.size()-1);

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ar=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ar,new ArrayList<>(),nums,new boolean[nums.length]);
        return ar;
    }
}