import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int sum = 1;
        while (i<=n)
        {
        sum*=i;
        i++;
        }
        System.out.println(sum);
    }}