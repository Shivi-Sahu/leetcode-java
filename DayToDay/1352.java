class ProductOfNumbers {
   ArrayList<Integer> list = new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        list.add(num);
        
    }
    
    public int getProduct(int k) {
        int n =  list.size();
        int product =1;

        for(int i = n-k; i<n; i++){
            product = product * list.get(i);
        }

        return product;
    }
}

