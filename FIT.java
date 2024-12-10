//JUNE222
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t!=0) {
        int x = scanner.nextInt();
        int y=x+x;
        System.out.println(y*5);
        t--;
            }
    }
}
