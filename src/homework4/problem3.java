import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i < 10) {
            i = i + 1 ;
        System.out.print(n);
        System.out.print("x" + i);
        System.out.println("=" + (i * n));}
    }}