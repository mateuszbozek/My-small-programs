package Calculator;

public class Rectangle extends Figure implements Print {

    private double a,b,sum;

    public Rectangle(){
        this.a=0;
        this.b=0;
        this.sum=0;
    }

    public Rectangle(double a,double b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public double calculatorArea() {
        return sum=a*b;
    }

    @Override
    public double calculatorPerimeter() {
        return sum = a+a+b+b;
    }

    @Override
    public void print() {
        System.out.println("Wynik dzialania to : "+sum);
    }
}
