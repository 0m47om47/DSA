import java.util.*;
public class evenodd {
    public static void evenodd(int a){
        int n=1;
        if((a & n)==0){
            System.out.println("even");
        }
        else
        System.out.println("odd");
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a number for finding even or odd = ");
      int a=sc.nextInt();
      evenodd(a);
    }
}
