package Lab01;

import java.util.*;

public class ex6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so ptu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Nhap vao cac ptu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
        System.out.println("Tong: " + sum);
        System.out.println("Trung binh cong: " + ((double) sum / n));
        scanner.close();
    }
}