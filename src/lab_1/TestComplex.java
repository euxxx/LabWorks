package lab_1;
import java.util.Random;

public class TestComplex {
    public static void main(String args[]) {

        System.out.println("Комплексные числа:\n");

        // тестовый набор чисел
        Complex num_1 = new Complex(1.0, 1.0);
        num_1.print();

        Complex num_2 = new Complex(1.0, -1.0);
        num_2.print();

        Complex num_3 = new Complex(-1.0, 1.0);
        num_3.print();

        Complex num_4 = new Complex(-1.0, -1.0);
        num_4.print();

        System.out.println("\n***\n");

        
        
        // модули чисел
        System.out.println("Модули чисел:\n");

        System.out.println(num_1.getModule());
        System.out.println(num_2.getModule());
        System.out.println(num_3.getModule());
        System.out.println(num_4.getModule());

        System.out.println("\n***\n");

        
        
        // аргуметы чисел
        System.out.println("Аргументы:\n");

        System.out.print("a - pos / b - pos: (pi/4) = ");
        System.out.println(num_1.getArgument());

        System.out.print("a - pos / b - neg: (7/4 * pi) = ");
        System.out.println(num_2.getArgument());

        System.out.print("a - neg / b - pos: (3/4 * pi) = ");
        System.out.println(num_3.getArgument());

        System.out.print("a - neg / b - neg: (5/4 * pi) = ");
        System.out.println(num_4.getArgument());

        System.out.println("\n***\n");


        // сложение и вычитание
        num_1 = new Complex(0 + new Random().nextDouble()*10.0, 0 + new Random().nextDouble()*10.0);
        System.out.print("1-е число = ");
        num_1.print();

        System.out.println();

        num_2 = new Complex(0 + new Random().nextDouble()*10.0, 0 + new Random().nextDouble()*10.0);
        System.out.print("2-е число = ");
        num_2.print();

        System.out.println();

        System.out.println("Результат их сложения:");
        num_3 = new Complex().addittion(num_1, num_2);
        num_3.print();

        System.out.println("Результат их вычитания:");
        num_4 = new Complex().substraction(num_1, num_2);
        num_4.print();
    }
}
