public class set_ith_bit {
    public static int setbit(int n,int i){
        int formula=1<<i;
        return n | formula;
    }
    public static void main(String[] args) {
       System.out.println(setbit(10, 2)); 
    }
}
