package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        MathMethods mathMethods = new MathMethods();
        int a = 155;
        System.out.println("Czy " + a + " jest liczbą parzystą? " + mathMethods.isEven(a));
        System.out.println("Czy " + a + " jest liczbą parzystą? " + mathMethods.isOdd(a));
        System.out.println("Pole koła o promieniu " + a + " wynosi:" + mathMethods.circleField(a));
        System.out.println("Kwadrat liczby " + a + " wynosi: " + mathMethods.power(a));
    }
}
