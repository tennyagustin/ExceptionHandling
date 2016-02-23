/**
 * Created by Tenny on 2/21/16.
 */
public class Calculator extends Exception {

    public static int add(int n1, int n2) {

        int sum = n1 + n2;

        return sum;
    }

    public static int subtract(int n1, int n2) {

        int difference = n1 - n2;

        return difference;

    }

    public static int multiply(int n1, int n2) {

        int product = n1*n2;

        return product;
    }

    public static int divide(int n1, int n2) throws DivideByZeroException {

        if(n2 == 0) {

            throw new DivideByZeroException("You can't divide by 0.");

        } else {

            int quotient = n1 / n2;

            return quotient;
        }
    }
}