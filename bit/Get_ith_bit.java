public class Get_ith_bit{
    public static int getith(int n,int i){
        int formula=1<<i;
        if((n & formula) == 0){
            return 0;
        }
        else
        return 1;
    }
    public static void main(String[] args) {
        System.out.print(getith(3, 0));
    }
}