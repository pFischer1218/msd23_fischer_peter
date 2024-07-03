package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class is used to provide simple mathematical functions fom addition, subtraction, multiplication, division to factorial.
 * It logs each operation at the debug level using Log4j.
 */
public class Calculator {

    private static Logger logger = LogManager.getLogger();

    /**
     * Adds two numbers.
     *
     * @param number1 the first number to add
     * @param number2 the second number to add
     * @return the sum of number1 and number2
     */
    public double add(double number1, double number2) {
        logger.debug("addiert: {} und {}", number1, number2);
        return number1 + number2;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param number1 the number, which subtracted from
     * @param number2 the number that is subtracted
     * @return the result of subtracting number2 from number1
     */
    public double minus(double number1, double number2) {
        logger.debug("subtrahiert: {} und {}", number1, number2);
        return number1 - number2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param number1 the first number to multiply
     * @param number2 the second number to multiply
     * @return the result of multiplying number1 and number2
     */
    public double multiply(double number1, double number2) {
        logger.debug("multipliziert: {} und {}", number1, number2);
        return number1 * number2;
    }

    /**
     * Divides the first number by the second number.
     *
     * @param number1 the number, which is divided
     * @param number2 the number, with wich the first number is divided
     * @return the result of dividing number1 by number2
     * @throws ArithmeticException if number2 is zero
     */
    public double divide(double number1, double number2) {
        logger.debug("dividiert: {} und {}", number1, number2);

        if (number2 == 0) {
            logger.error("Nulldivision nicht moeglich");
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return number1 / number2;
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param number the number to calculate the factorial of
     * @return the factorial of the number, or 0 if the number is negative
     */
    public int factorial(int number) {
        if (number < 0) {
            return 0;
        }

        if (number >= 1) {
            return number * factorial(number - 1);
        }

        return 1;
    }
}