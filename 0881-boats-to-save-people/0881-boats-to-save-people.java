class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int i=0,j=people.length-1;
        while(i<=j){
            int sum=people[j]+people[i];
            if(sum<=limit){
                i++;
                j--;
            }else if(limit<sum){
                j--;
            }
            l++;
            
        }
        return l;
    }
}