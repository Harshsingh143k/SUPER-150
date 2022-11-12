import java.util.Scanner;
//incomplete
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="  ";
        for (int i = 0; i < n; i++) {
            System.out.println(s);
            for (int j = 0; j < n; j++) {
                if ((j+i)<=n-1)
                    System.out.print("  *");
                else{
                    System.out.print("");
                }
            }
        }
    }
}
