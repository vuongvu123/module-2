package KeThua.kethua1;

public class Point3D extends Point2D{
    private float z;
    public Point3D(){

    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z =z;
    }
    public float getZ(float z){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x,float y,float z){
        float [] arrPoint = new float [3];
        arrPoint[0]=x;
        arrPoint[1]=y;
        arrPoint[2]=z;
    }
    public float getXYZ(float arr[]){
        float a=arr[0];
        float b=arr[1];
        float c=arr[2];
        return a + b + c;
    }
    public String toString(float arr[]){
        return ("(x,y,z) = " + "(" + arr[0] + ","+ arr[1] +","+ arr[2] +")");
    }
}
