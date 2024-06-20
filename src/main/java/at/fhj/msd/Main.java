package at.fhj.msd;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator c = new Calculator();
        try {
            double n1 = Double.parseDouble(args[0]);
            double n2 = Double.parseDouble(args[1]);


            System.out.println(c.add(n1, n2));
            System.out.println(c.minus(n1, n2));
            System.out.println(c.multiply(n1, n2));
            System.out.println(c.divide(n1, n2));
            System.out.println(c.factorial((int)n1));
        }catch (Exception e){
            System.out.println("Keine Zulässige Eingabe!");
        }

        logger.info("It is a info logger.");
        logger.error("It is an error logger.");


        System.out.println("Peter Fischer");

    }
}
