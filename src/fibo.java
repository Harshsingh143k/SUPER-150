import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0;
       int b=1;
       int sum;
       int i=3;
        if(n==0){
            System.out.println(a);
        }
        if(n==1){
            System.out.println(b);
        }
       while(i<=n){
           if(i==0){
               System.out.println(0);
           }
           if(i==1){
               System.out.println(1);
           }
           sum=a+b;
           a=b;
           b=sum;
           System.out.println(sum);
           i++;
       }
    }
}
