public class clear_range_of_bit {
    public static int range(int n,int i,int j){
        int a=(-1)<<j+1;
        int b=(1<<i)-1;
        int m=a|b;
        return n & m;
    }
    public static void main(String[] args) {
        System.out.println(range(10, 2, 4));
    }
}
