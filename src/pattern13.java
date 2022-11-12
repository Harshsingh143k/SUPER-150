import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= 2*n-1; i++) {
            System.out.println( );
            for (int j = 0; j < (2*n-1); j++) {
                if ((j+i) >= 2*n-1)
                    System.out.print("  *");
                else {
                    System.out.print("   ");
                }
            }
        }
    }
}
