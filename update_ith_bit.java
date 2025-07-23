public class update_ith_bit {
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
      public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static int updateithbit(int n,int i,int j){
    if(j==0){
        return clearithbit(n,i);
    }
    else{
        return setithbit(n,i);
    }
    }
    public static void main(String[] args) {
    System.out.println(clearithbit(20,2));

    }
}
