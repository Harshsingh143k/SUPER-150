package class2;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1");
        int num= sc.nextInt();
        System.out.println("2");
        int base= sc.nextInt();
        int sum=0;
        int mul=1;
        while(num>0){
            int rem=num%base;
            sum=sum+rem*mul;
            mul=mul*base;
            System.out.println(mul);
        }
        //System.out.println(mul);
    }
}
