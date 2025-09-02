import java.util.Scanner;

public class PointTester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Hello welcome you Point-----");
        System.out.println("Enter Two coordinates... X1 and Y1");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();

        System.out.println("Great now Enter Two coordinates... X2 and Y2");
        int X2 = sc.nextInt();
        int Y2= sc.nextInt();
        Point p1 = new Point(X1, Y1);
        Point p2 = new Point(X2, Y2);

        System.out.println("Object P1's coordinates are \n"+p1.show());
        System.out.println("Object P2's coordinates are \n"+p2.show());

        System.out.println(p1.isEqual(X2,Y2));
        System.out.println(p1.calculateDistance(X2,Y2));
    }
}