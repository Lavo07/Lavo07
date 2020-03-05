import java.util.Scanner;
public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int sum = 0;
        if (n % 2 == 1)
        { sum=(n + 1) / 2;
        System.out.println(sum);}
        else if (n % 2 == 0)
        { sum = -(n / 2);
            System.out.println(sum); }
        }}