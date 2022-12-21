package baiArray;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int size =100;
        int[] arr= new int [100];
        Scanner scanner= new Scanner(System.in);
        int X = scanner.nextInt();
        int index = scanner.nextInt();
        while (index>100){
            System.out.println("Nhập vào vị trí nhỏ hơn max size(100)");
            index = scanner.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if(i== index){
                arr[i]= X;
            }
        }
        for (int i = 0; i <=index ; i++) {
            System.out.println(arr[i]);
        }
    }
}
