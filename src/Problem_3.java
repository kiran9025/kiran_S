import java.util.Scanner;

public class Problem_3 {
    public static void series(int x) {
        int a = 1;
        if(x % 2 == 0){
            x -= 1;
        }
        for(int i = 0; i < x ; i++){
            System.out.print(a + " ");
            a += 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series to be printed ");
        int x = sc.nextInt();
        Problem_3.series(x);
    }
}
