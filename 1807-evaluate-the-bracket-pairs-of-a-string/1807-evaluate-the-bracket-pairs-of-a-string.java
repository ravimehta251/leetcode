class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            List<String> ar=knowledge.get(i);
            map.put(ar.get(0),ar.get(1));
        }
        String sr="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                String p="";
                i++;
                while(s.charAt(i)!=')'){
                    p=p+s.charAt(i);
                    i++;
                }
                String st=map.get(p);
               
                sr+=st==null ? "?":st;

            }else{
                sr=sr+s.charAt(i);
            }
        }
        return sr;
    }
}