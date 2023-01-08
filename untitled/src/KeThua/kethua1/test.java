package KeThua.kethua1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Point3D a= new Point3D(3,4,5);
        Point2D b= new Point2D(7,8);
        float [] arr = new float [3];
        System.out.println(b.toString());
        arr[0]=a.getX(3);
        arr[1]=a.getY(4);
        arr[2]=a.getZ(5);
        a.setXYZ(3,4,5);
        System.out.println(a.toString(arr));

    }
}
