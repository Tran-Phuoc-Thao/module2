package AbstractClassInterface;

public class Rectangle extends Shape implements Resizeable{
    private double dai;
    private double rong;
    public Rectangle() {}
    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }


    @Override
    public void resize(double percent) {
        this.dai=this.dai*Math.random()*percent;
        this.rong=this.rong*Math.random()*percent;

    }

    @Override
    public double getArea() {
        return dai*rong;
    }

    @Override
    public double getPerimeter() {
        return (dai+rong)*2;
    }
}
