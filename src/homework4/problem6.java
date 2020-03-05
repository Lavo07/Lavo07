import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float i = 1;
        float sum = 1;
        while (i < n)
        {
            i++;
            sum = sum + 1/i;
        }
        System.out.println(sum);
    }}
