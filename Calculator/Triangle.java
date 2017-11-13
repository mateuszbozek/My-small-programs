package Calculator;

public class Triangle extends Figure implements Print{

    private double h;
    private double a,b,c;
    private double sum=0;

    public Triangle()
    {
        this.a=0;
        this.b=0;
        this.c=0;
        this.h=0;
    }

    public Triangle(double h,double a)
    {
        this.h=h;
        this.a=a;
    }

    public Triangle(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double calculatorArea() {

        return sum =(a*h/2);
    }

    @Override
    public double calculatorPerimeter() {
        return sum = a+b+c;
    }

    @Override
    public void print() {

        System.out.println("Wynik dzialania to : "+sum);

    }

}
