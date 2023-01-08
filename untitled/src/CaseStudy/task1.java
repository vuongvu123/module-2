package CaseStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static int  displayMainMenu(){
        System.out.println("1. Employee Management" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào lựa chọn");
        int choose = scanner.nextInt();
        return choose;
    }
    public static void display(int a){
        switch(a){
            case 1:
                System.out.println("1 Display list employees\n" +
                        " 2.Add new employee\n " +
                        "3 Edit employee\n" +
                        "4 Return main menu");
                break;
            case 2:
                System.out.println("1. Display list customers\n" +
                        "2. Add new customer\n" +
                        "3. Edit customer\n" +
                        "4. Return main menu");
                break;
            case 3:
                System.out.println("1 Display list facility\n" +
                        "2 Add new facility\n" +
                        "3 Display list facility maintenance\n" +
                        "4 Return main menu");
                break;
            case 4:
                System.out.println("1. Add new booking\n" +
                        "2. Display list booking\n" +
                        "3. Create new constracts\n" +
                        "4. Display list contracts\n" +
                        "5. Edit contracts\n" +
                        "6. Return main menu");
                break;
            case 5:
                System.out.println("1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu");
                break;
            case 6:
                break;
        }

    }

    public static void main(String[] args) {
       // int h=displayMainMenu();
        display(displayMainMenu());
    }

}
