package baiArray;

import java.util.Scanner;

public class SumCot {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng phần tử của mảng 2 chiều");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        float [][] arr = new float [n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + j +"]");
                arr[i][j]= scanner.nextFloat();
            }
        }
        float []sum = new float [n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                sum[i]+=arr[i][j];
            }
            System.out.println("tổng các cột " + i +  " là " + sum[i]);
        }
    }
}
