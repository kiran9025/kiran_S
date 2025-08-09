import java.util.Scanner;

public class Problem_2 {
    public static void oddSeries(int x) {
        int a = 1;
        for(int i = 0; i < x ; i++){
            System.out.print(a + " ");
            a += 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series to be printed ");
        int x = sc.nextInt();
        Problem_2.oddSeries(x);
    }
}
