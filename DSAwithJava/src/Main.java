import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        try {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scn.nextInt();
            new QuickSort().solve(arr);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}