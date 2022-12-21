package intructorJava;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double rate = 23000;
        double USD = scanner.nextDouble();
        double VND = USD * rate;
        System.out.print(VND);
    }
}
