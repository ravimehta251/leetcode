class Solution {
    public int maxSum(int[] nums) {
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<10;i++){
            ar.add(new ArrayList<>());
        }
        for(int num:nums){
            int max=0;
            int k=num;
            while(k!=0){
                max=Math.max(max,k%10);
                k=k/10;
            }
            ar.get(max).add(num);
        }
        int max=-1;
        for(ArrayList<Integer> ar1:ar){
            Collections.sort(ar1);
            int n=ar1.size();
            if(1<n){
                max=Math.max(max,ar1.get(n-1)+ar1.get(n-2));
            }
        }
        return max;

    }
}