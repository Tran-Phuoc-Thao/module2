package AbstractClassInterface;

public class Cirle extends Shape implements Resizeable{
    private double r;

    public Cirle(double r) {
        this.r = r;
    }
    public Cirle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }



    @Override
    public void resize(double percent) {
        this.r=this.r*Math.random()*percent;
    }
}
