package Calculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choise;
        char choisee;
        char yesOrNo;
        double a,b,c,h;
        boolean isGood;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witam ! Tutaj twoj ulubiony kalkulator.");
        System.out.println("Jaka figure masz do policzenia ?");

        do {

            isGood=true;

            System.out.println("1 -Trojkat\n2 -Prostokat\n3 -Kolo\n4 -Kwadrat\n");
            choise=scanner.nextInt();

            switch (choise)
            {
                case 1://trojkat
                    System.out.println("Chcesz policzyc pole czy obwod ? : \np -pole\no -obwod");
                    choisee=scanner.next().charAt(0);

                    Triangle triangle;

                    switch(choisee){
                        case 'p':
                            System.out.print("Podaj wysokosc :");
                            h=scanner.nextDouble();

                            System.out.print("Podaj dlugosc boku :");
                            a=scanner.nextDouble();

                            triangle = new Triangle(h,a);
                            triangle.calculatorArea();
                            triangle.print();
                            break;
                        case 'o':
                            System.out.print("Podaj dlugosc 1 boku :");
                            a=scanner.nextDouble();

                            System.out.print("Podaj dlugosc 2 boku :");
                            b=scanner.nextDouble();

                            System.out.print("Podaj dlugosc 3 boku :");
                            c=scanner.nextDouble();

                            triangle= new Triangle(a,b,c);
                            triangle.calculatorPerimeter();
                            triangle.print();
                            break;
                        default:
                            System.out.println("Wybrano zla opcje. (TROJKAT)");
                            isGood=false;
                            break;
                    }
                    break;
                case 2://prostokąt

                    System.out.print("Podaj dlugosc pierwszego boku : ");
                    a=scanner.nextDouble();

                    System.out.print("Podaj dlugosc drugiego boku : ");
                    b=scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(a,b);

                    System.out.println("Chcesz policzyc pole czy obwod ? : \np -pole\no -obwod");
                    choisee=scanner.next().charAt(0);

                    switch(choisee)
                    {
                        case 'p':
                            rectangle.calculatorArea();
                            rectangle.print();
                            break;
                        case 'o':
                            rectangle.calculatorPerimeter();
                            rectangle.print();
                            break;
                        default:
                            System.out.println("Podano zle opcje. (PROSTOKAT-INSIDE)");
                            isGood=false;
                            break;
                    }
                    break;

                case 3://kolo

                    System.out.println("Chcesz policzyc pole czy obwod ? : \np -pole\no -obwod");
                    choisee=scanner.next().charAt(0);

                    System.out.print("Podaj promiec kola : ");
                    a=scanner.nextDouble();

                    Circle circle = new Circle (a);

                    switch (choisee)
                    {
                        case 'p':
                            circle.calculatorArea();
                            circle.print();
                            break;
                        case 'o':
                            circle.calculatorPerimeter();
                            circle.print();
                            break;

                        default:
                            System.out.println("Wybrano zla opcje. (KOLO-INSIDE)");
                            isGood=false;
                            break;
                    }
                    break;
                case 4:

                    System.out.println("Chcesz policzyc pole czy obwod ? : \np -pole\no -obwod");
                    choisee=scanner.next().charAt(0);

                    System.out.print("Podaj dlugosc boku : ");
                    a=scanner.nextDouble();

                    Square square = new Square(a);

                    switch (choisee)
                    {
                        case 11:
                            square.calculatorPerimeter();
                            square.print();
                            break;
                        case 12:
                            square.calculatorPerimeter();
                            square.print();
                            break;
                        default:
                            System.out.println("Wybrano zla opcje. (KWADRAT-INSIDE)");
                            isGood=false;
                            break;
                    }
                    break;
                default:
                    System.out.println("Wybrano zla opcje. (CHOISE-INSIDE)");
                    isGood=false;
                    break;
            }

            System.out.println("Dziekuje za skorzystanie z programu :) \n Czy chcesz policzyc inna figure lub te sama figure na innych wartosciach ? ( t - TAK , n - NIE )");
            yesOrNo=scanner.next().charAt(0);
            if(yesOrNo == 't')
                isGood=false;

        }while(isGood==false);
        System.out.println("Koniec.");
    }
}
