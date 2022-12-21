package baiArray;

import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng phần tử mảng A");
        Scanner scanner= new Scanner(System.in);
        int N1= scanner.nextInt();
        int [] arrA= new int [N1];
        for (int i = 0; i <N1 ; i++) {
            System.out.println("Nhập vào phần tử vị trí thứ " + i);
            arrA[i]= scanner.nextInt();
        }
        System.out.println("Nhập vào số lượng phần tử mảng B");
        int N2=scanner.nextInt();
        int[] arrB= new int [N2];
        for (int i = 0; i <N2 ; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arrB[i]=scanner.nextInt();
        }
        int [] arrC= new int [N1 + N2];
        for (int i = 0; i <arrA.length ; i++) {
            arrC[i]=arrA[i];
        }
        for (int i = 0; i <arrB.length ; i++) {
            arrC[i+arrA.length]=arrB[i];
        }
        for (int i = 0; i <arrC.length ; i++) {
            System.out.println(arrC[i]);
        }
    }
}
