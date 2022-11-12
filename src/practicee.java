import java.util.Scanner;

public class practicee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("provide size");
        //int size=6;
        int[] arr=new int[6];
        //int top=-1;
        push(34);





    }

    static  void push(int x){
        if(top+1==size){
            System.out.println("Stack overflow");
            return;
        }
        else{
            top++;
            arr[top]=x;
            System.out.println("element pushed......operatiion completed");
        }
    }
    static void pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        else{
            int y=arr[top];
            top--;
            System.out.println(y);

        }
    }


}
