public class Clear_last_i_bits {
    public static int clear(int i, int j){
        int n=(~0)<<j;
        return i & n;
    }
    public static void main(String[] args) {
      System.out.println(clear(25, 2));  
    }
}
