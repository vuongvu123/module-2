package baiArray;

import java.util.Scanner;

public class Array2Chieu {
    public static void main(String[] args) {
        System.out.println("Nhập vào độ dài của mảng 2 chiều");
        Scanner scanner= new Scanner(System.in);
        int m =scanner.nextInt();
        int n=scanner.nextInt();
        int  [][] arr=new int [m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i  + ","+ j + "]" );
                arr[i][j]= scanner.nextInt();
            }
        }
    int max = arr[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i][j]>max){
                    max= arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
