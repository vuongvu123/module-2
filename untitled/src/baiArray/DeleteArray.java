package baiArray;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng mảng số nguyên");
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int [] arr= new int [n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào phần tử muốn xóa");
        int x =  scanner.nextInt();
        int index=0;
        for (int i = 0; i <= n-1 ; i++) {
            if (arr[i] == x){
                index =i;
            }
        }
        for (int i = index; i <= n-1 ; i++) {
            if(i==n-1){
                arr[i]=0;
            }else {
                arr[i]=arr[i+1];
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
