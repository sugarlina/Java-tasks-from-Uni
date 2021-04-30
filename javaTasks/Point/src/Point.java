public class Point {
    private int x;
    private int y;
/*def ctor*/
    public Point(){
        x=0;
        y=0;
    }

    public Point (int initialX,int initialY){
        x=initialX;
        y=initialY;
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x*x+y*y);
    }
/*encapsulation*/
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setLocation(int newX,int newY){
        x=newX;
        y=newY;
    }
 /*дефинира поведението на обектите=>instance method*/
    public void translate(int dx,int dy){
        x+=dx;
        y+=dy;
    }
}
