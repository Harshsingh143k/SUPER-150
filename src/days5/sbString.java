package days5;

public class sbString {
    public static void main(String[] args) {
      String p="hello";
        for (int i = 1; i <=p.length() ; i++) {
            for (int j = 0; j <p.length()-i+1; j++) {
                System.out.println(p.substring(j,j+i));
            }
        }
    }
}
