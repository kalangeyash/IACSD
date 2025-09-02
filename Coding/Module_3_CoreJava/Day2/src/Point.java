

/*
4. Hands on
Create a  class Point2D   for representing a point in x & y(int) co-ordinate system.
(Tight encapsulation please !)
4.1 Create a parameterized constructor to accept x & y co-ords.
4.2 Add  show() method  --to return point's x & y co-ords
4.3 Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
Hint - Ask yourself - 
How will you invoke it from the tester ?
4.4 
Add a non static method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.
Hint - Ask yourself - 
How will you invoke it from the tester ?
______________________________
4.5  Create a separate Driver(main)  class(for UI )  , "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points & store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)

4.8  (OPTIONAL WORK)
Find out if the points  are same or different (Hint : isEqual)

Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.

 */



public class Point {
    private int x;
    private int y;

    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    String show(){
        String res = "X co-ordinate is "+x+" & Y co-ordinate is "+y;
        return res;
    }

    boolean isEqual(int X,int Y){
        boolean equality = false;
        if(x == X && y == Y){
            equality = true;
        }else{
            equality = false;
        }
        return equality;
    }

    double calculateDistance(int X,int Y){
        double v1 = X-x;
        v1 = v1*v1;
        double v2 = Y-y;
        v2 = v2*v2;

        double res = (double)(v1+v2);

        double dist = Math.sqrt(res);
        //√
        return dist;
    }

    

}