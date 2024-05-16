package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double n1 = 50.0;
        double n2 = 15.0;

        System.out.println(c.add(n1,n2));
        System.out.println(c.minus(n1,n2));
        System.out.println(c.multiply(n1,n2));
        System.out.println(c.divide(n1,n2));

    }
}
