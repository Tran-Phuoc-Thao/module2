package lopvadoituongjava;

import java.util.Scanner;

public class QuadraticEquation {
    private double a=0, b=0, c=0;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    public static void main(String[] args) {
        double a, b, c,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập a");
        a = scanner.nextDouble();
        System.out.println(" nhập b");
        b = scanner.nextDouble();
        System.out.println(" nhập c");
        c = scanner.nextDouble();

        QuadraticEquation pt = new QuadraticEquation(a,b,c);

        delta = pt.getDiscriminant();

        if(delta<0){
            System.out.print("Phuong trinh vo nghiem");
        }else if(delta==0)
        {
            System.out.print("Phuong trinh co nghiem kep\n x= "+pt.getRoot1());
        }else{
            System.out.print("Phuong trinh co 2 nghiem phan biet\n x1= "+pt.getRoot1()+ "\n x2= "+pt.getRoot2());
        }
    }


}
