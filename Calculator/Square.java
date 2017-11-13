package Calculator;

public class Square extends Figure implements Print {


    private double sum,a;

    public Square()
    {
        this.a=a;
    }

    public Square(double a)
    {
        this.a=a;
    }

    @Override
    public double calculatorArea() {
        return sum=a*a;
    }

    @Override
    public double calculatorPerimeter() {
        return sum=4*a;
    }

    @Override
    public void print() {
        System.out.println("Wynik dzialania to : "+sum);
    }
}
