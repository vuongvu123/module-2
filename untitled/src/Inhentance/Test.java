package Inhentance;

public class Test {
    public static void main(String[] args) {
        Point point=new Point(10,20);
        Movepoint Movepoint=new Movepoint(10,20,30,30);
        System.out.println(point);
        Movepoint.move();
        System.out.println(Movepoint);
    }
}
