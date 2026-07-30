class Solution {
    public String data(int i) {
    switch (i) {
        case 2: return "abc";
        case 3: return "def";
        case 4: return "ghi";
        case 5: return "jkl";
        case 6: return "mno";
        case 7: return "pqrs";
        case 8: return "tuv";
        case 9: return "wxyz";
        default: return "";
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ar=new ArrayList<>();
        int l=digits.charAt(0)-'0';
        String spo=data(l);
        for(char c:spo.toCharArray()){
            ar.add(""+c);
        }
        
        for(int i=1;i<digits.length();i++){
             l=digits.charAt(i)-'0';
            int k=ar.size();
            List<String> ar1=new ArrayList<>(ar);
            ar.clear();
            for(int j=0;j<k;j++){
                String m=data(l);
                String sp=ar1.get(j);
                for(char o:m.toCharArray()){
                    ar.add(sp+o);
                }
            }

        }
        return ar;
    }
}