class Solution {
    public int len(int a){
        int k=0;
        while(a!=0){
            k++;
            a=a/10;
        }
        return k;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ar=new ArrayList<>();
        int min=len(low),max=len(high);
        String s="123456789";
        for(int i=min;i<=max;i++){
            for(int j=0;j<11;j++){
                if((j+i)<10){
                String p=s.substring(j,j+i);
                int k=Integer.parseInt(p);
                if(low<=k  && k<=high){
                    ar.add(k);
                }
                }
            }
        }
        return ar;

        
    }
}