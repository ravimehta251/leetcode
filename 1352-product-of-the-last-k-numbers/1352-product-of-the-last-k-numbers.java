class ProductOfNumbers {
    public ArrayList<Integer> ar;

    public ProductOfNumbers() {
        ar=new ArrayList<>();
        
    }
    
    public void add(int num) {
        ar.add(num);
    }
    
    public int getProduct(int k) {
        int n=ar.size()-1;
        int p=1;
        for(int i=0;i<k;i++){
            p*=ar.get(n--);
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */