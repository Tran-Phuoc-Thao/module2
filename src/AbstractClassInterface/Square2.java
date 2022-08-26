package AbstractClassInterface;

public class Square2 {
    public static void main(String[] args) {
        Squares square = new Squares(       5);
        System.out.println(square.howToColor());
        System.out.println(square.toString());
    }
}
interface Colorable {
    public abstract String howToColor();
}
class Squares implements Colorable{
    private double side;
    public Squares(){

    }
    public Squares (double side){
        this.side = side;

    }
    @Override
    public String howToColor(){
        return "Color all four side";
    }
    public String toString(){
        return "Square has side = "+this.side;
    }
}