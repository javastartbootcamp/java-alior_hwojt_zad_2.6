package pl.javastart.task;

public class MathMethods {
    boolean isEven(int a) {
        return (a % 2 == 0);
    }

    boolean isOdd(int a) {
        return (a % 2 != 0);
    }

    double circleField(double a) {
        return Math.PI * a * a;
    }

    int power(int a) {
        return a * a;
    }
}
