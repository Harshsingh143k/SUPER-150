import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos =1;
        int  sum;
        while(n!=0){
            int i= n%10;
             //sum= sum+int (pos*Math.pow(10,i-1));
            n=n/10;

        }
       // System.out.print(sum);
    }
}
