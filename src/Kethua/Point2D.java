package Kethua;

public class Point2D {

    private float x = 0;
    private float y = 0;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float XY[] = {x, y};
        return XY;
    }

    public void setXY(float x ,float y) {
        this.x = x;
        this.y = y;

    }
    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y
                ;
    }
}



    class Point3D extends Point2D{

       private float z = 0;

        public Point3D(float x,float y,float z) {
            super();
            this.z = z;
        }

        public Point3D() {
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }
        public float[] getXYZ() {
            float array[] ={super.getX(),super.getY(),z};
            return array;
        }

        public void setXY(float x,float y) {
            super.setXY(x,y);
            this.z=z;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "z=" + z +
                    '}';
        }
    }


