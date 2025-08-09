import java.util.HashMap;
import java.util.Scanner;

public class Problem_4{
    public static void countElements(int[] arr){
        int[] elements = {1,2,3,4,5,6,7,8,9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < elements.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] % elements[i] == 0){
                    count++;
                }
            }
            map.put(elements[i] ,count);

        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        countElements(arr);
    }
}
