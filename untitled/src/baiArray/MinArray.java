package baiArray;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng phần tử của mảng");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        int [] arr =new int [size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i]=scanner.nextInt();
        }
        int min= arr[0];
        for (int i = 0; i <size ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("số nhỏ nhất trong mảng " + min);
    }
}
