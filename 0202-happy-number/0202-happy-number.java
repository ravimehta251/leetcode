class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(true){
            int k=n;
            int num=0;
            while(k!=0){
                int sq=(k%10)*(k%10);
                k=k/10;
                num+=sq;
            }
            n=num;
            if(num==1){
                return true;
            }
            if(set.contains(num)){
                return false;
            }else{
                set.add(num);
            }
        }
       
    }
}