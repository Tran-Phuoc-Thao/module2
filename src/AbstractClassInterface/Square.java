package AbstractClassInterface;

public class Square extends Shape implements Resizeable {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void resize(double percent) {
        a=a*Math.random()*percent;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return a*4;
    }

    public static void main(String[] args) {
        Square hinhvuong = new Square(12);
        hinhvuong.getArea();
        System.out.println(hinhvuong.getArea());
        hinhvuong.resize(100);
        System.out.println(hinhvuong.getArea());

    }
}
