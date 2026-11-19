class Solution {
    public boolean checkDivisibility(int n) {
        int sumn =0;
        int product =1;
        int temp =n;
        while(temp>0){
         int rem = temp% 10;
            product = product * rem;

            sumn = sumn +rem;
            temp = temp/10;
        }
       int  finalsum = product + sumn;

       return n % finalsum ==0 ;
       
    }
}
