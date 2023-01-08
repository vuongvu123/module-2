package KeThua.kethua1;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y=  y;
    }
    public float getX(float x){
        return this.x;
    }
    public void setX(float x){
        this.x =x;
    }
    public float getY(float y){
        return this.y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x, float y){
        float [] arr = new float [2];
        arr[0]=x;
        arr[1]=y;
    }
    public float getXY(float arr[]){
        this.x =arr[0];
        this.y= arr[1];
        return this.x + this.y;
    }
    public String toString(){
      return "(x,y) = " + "(" + x + "," + y + ")" ;
    }
}
