package Calculator;

public class Circle extends Figure implements Print {

    private double r,sum;

    public Circle()
    {
        this.r=0;
        this.sum=0;
    }

    public Circle (double r)
    {
        this.r=r;
        this.sum=0;
    }

    @Override
    public double calculatorArea() {
        return sum=( Math.PI*r*r);
    }

    @Override
    public double calculatorPerimeter() {
        return sum = ( 2*Math.PI*r );
    }

    @Override
    public void print() {
        System.out.println("Wynik dzialania to : "+sum);
    }
}
