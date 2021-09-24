package lab_1;

import static java.lang.Math.sqrt;
import static java.lang.Math.asin;
import static java.lang.Math.abs;
import static java.lang.Math.PI;

public class Complex {

    // вещественная и мнимая части в виде чисел с плавающей запятой двойной точности
    double real, imag;

    // конструктор по умочланию
    public Complex() {
    }

    // конструктор с двумя параметрами
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // определение модуля
    public double getModule() {
        return sqrt(real*real + imag*imag);
    }

    // определение аргумента
    public double getArgument() {

        // если вещественная часть положительная
        if (real > 0) {

            // мнимая - положительная
            if (imag > 0) return asin(abs(imag)/getModule());

            // мнимая - отрицательная
            else return 2*PI - asin(abs(imag)/getModule());

        // если вещественная часть отрицательная
        } else {

            // мнимая - положительная
            if (imag > 0) return PI - asin(abs(imag)/getModule());

            // мнимая - отрицаьельная
            else return asin(abs(imag)/getModule()) + PI;
        }
    }

    // сложение
    public Complex addittion(Complex num_1, Complex num_2) {
        Complex result = new Complex(0.0, 0.0);

        result.real = num_1.real + num_2.real;
        result.imag = num_1.imag + num_2.imag;

        return result;
    }

    // вычитание
    public Complex substraction(Complex num_1, Complex num_2) {
        Complex result = new Complex(0.0, 0.0);

        result.real = num_1.real - num_2.real;
        result.imag = num_1.imag - num_2.imag;

        return result;
    }

    // вывод
    public void print() {
        System.out.print(real);
        if (imag > 0) {
            System.out.print(" + ");
            System.out.print(imag);
            System.out.print("*i\n");
        } else {
            System.out.print(" - ");
            System.out.print(abs(imag));
            System.out.print("*i\n");
        }
    }
}