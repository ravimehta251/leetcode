class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
       int[] arr1 = arr.clone();
        Arrays.sort(arr);
        int j=1;
        if(arr.length==0){
            return arr;
        }
        map.put(arr[0],j);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                j++;
            }
            map.put(arr[i],j);
        }
         for(int i=0;i<arr.length;i++){
            arr1[i]=map.get(arr1[i]);
         }
        return arr1;
    }
}