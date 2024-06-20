package at.fhj.msd;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){

        logger.debug("addiert: {} und {}", number1, number2);

        return number1+number2;
    }

    public double minus(double number1, double number2){

        logger.debug("subtrahiert: {} und {}", number1, number2);

        return number1-number2;
    }

    public double multiply(double number1, double number2){

        logger.debug("multipliziert: {} und {}", number1, number2);

        return number1*number2;
    }

    public double divide(double number1, double number2){

        logger.debug("dividiert: {} und {}", number1, number2);

        if (number2 == 0) {
            logger.error("Nulldivision nicht moeglich");
            throw new ArithmeticException();
        }

        return number1/number2;
    }

    public int factorial(int number){


        if(number<0){
            return 0;
        }

        if(number>=1)
            return number*factorial(number-1);

        return 1;
    }
}
