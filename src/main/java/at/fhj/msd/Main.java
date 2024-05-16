package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        try {
            double n1 = Double.parseDouble(args[0]);
            double n2 = Double.parseDouble(args[1]);


            System.out.println(c.add(n1, n2));
            System.out.println(c.minus(n1, n2));
            System.out.println(c.multiply(n1, n2));
            System.out.println(c.divide(n1, n2));
        }catch (Exception e){
            System.out.println("Keine Zulässige Eingabe!");
        }


        System.out.println("Peter Fischer");

    }
}
