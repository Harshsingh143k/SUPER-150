import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("  ");
            for (int j = 0; j < n; j++) {
                if ((j+i)>=n-1)
                    System.out.print("  *");
                else{
                    System.out.print("   ");
                }
            }
        }
    }
}
