import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int i=0;
        int sum=0 ;
        while (i < y) {
            if (i > x && i%9==0)
            System.out.println("i/9= " +i);
            sum = sum + i;
            i++;
            }System.out.println("sum = " +sum);

    }}
