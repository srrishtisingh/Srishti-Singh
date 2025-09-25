public import java.util.*;
public clasS 2kipowerN{
  public static double powTwo(int n){
    if(n==0) return 1;
    return Math.pow(2,n)+ powTwo(n-1);
  }
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    System.out.print(powTwo(n));
  }
} {
    
}
